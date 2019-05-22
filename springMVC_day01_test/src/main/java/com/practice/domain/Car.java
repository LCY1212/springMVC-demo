package com.practice.domain;

public class Car {
    private String car;
    private String price;

    @Override
    public String toString() {
        return "{" +
                "品牌='" + car + '\'' +
                ", 价格='" + price + '\'' +
                '}';
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
