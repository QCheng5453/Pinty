package org.eureka.pinty.data.utils;

import org.eureka.pinty.data.utils.Money;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/2.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class Person {
    protected String personID;
    protected String name;
    protected Money extraMoney;
    protected Money owedMoney;

    public Person() {
    }

    public Money getOwedMoney() {
        return owedMoney;
    }

    public void setOwedMoney(Money owedMoney) {
        this.owedMoney = owedMoney;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getExtraMoney() {
        return extraMoney;
    }

    public void setExtraMoney(Money extraMoney) {
        this.extraMoney = extraMoney;
    }


}
