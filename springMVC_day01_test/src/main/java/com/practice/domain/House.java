package com.practice.domain;

public class House {
    private String house;
    private String address;

    @Override
    public String toString() {
        return "{" +
                "房子='" + house + '\'' +
                ", 地址='" + address + '\'' +
                '}';
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
