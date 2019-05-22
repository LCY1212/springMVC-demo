package com.practice.domain;

import java.util.Date;

public class User {
    private String userName;
    private Float money;
    private Date brithday;

    @Override
    public String toString() {
        return "{" +
                "用户名='" + userName + '\'' +
                ", 拥有资金=" + money +
                ", 生日=" + brithday +
                '}';
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
