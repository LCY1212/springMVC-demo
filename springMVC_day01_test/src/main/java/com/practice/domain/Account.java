package com.practice.domain;

import java.util.List;
import java.util.Map;

public class Account {
    private Integer id;
    private String accountName;
    private String password;

    private User vipUser;
    private List<House> houseList;
    private Map<String,Car> carMap;

    @Override
    public String toString() {
        return "账户信息{" +
                "id=" + id +
                ", 账号='" + accountName + '\'' +
                ", 密码='" + password + '\'' +
                ", 用户=" + vipUser +
                ", 房子List集合=" + houseList +
                ", 车Map集合=" + carMap +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getVipUser() {
        return vipUser;
    }

    public void setVipUser(User vipUser) {
        this.vipUser = vipUser;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }
}
