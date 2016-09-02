package org.eureka.pinty.data.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/2.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class Calendar {

    private static String CALENDAR_FORMATE = "yyyy-MM-dd";
    private Date date = new Date();

    public Calendar() {

    }

    public Calendar(String calendar) {
        setDateWithString(calendar);
    }

    public Calendar(Date date) {
        this.date = date;
    }

    public void setDateWithString(String calendar) {
        SimpleDateFormat format = new SimpleDateFormat(CALENDAR_FORMATE, Locale.CHINA);
        try {
            date = format.parse(calendar);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getCalendarAsString() {
        SimpleDateFormat format = new SimpleDateFormat(CALENDAR_FORMATE, Locale.CHINA);
        return format.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
