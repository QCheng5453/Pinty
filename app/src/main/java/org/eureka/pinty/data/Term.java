package org.eureka.pinty.data;

import org.eureka.pinty.data.utils.Calendar;
import org.eureka.pinty.data.utils.Money;
import org.eureka.pinty.data.utils.Person;

import java.util.ArrayList;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/2.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class Term {
    private Calendar startCalendar;
    private Calendar deadlineCalendar;

    private Money totalMoney;
    private Money leftMoney;
    private Money paidMoney;

    private Payee payee;
    private ArrayList<Payer> totalPayers;

    private ArrayList<Payer> getTotalPayers() {
        return totalPayers;
    }
}
