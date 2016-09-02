package org.eureka.pinty.utils;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/2.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class CheckUtils {

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }
}
