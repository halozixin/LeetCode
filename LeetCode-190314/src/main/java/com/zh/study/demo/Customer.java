package com.zh.study.demo;

import java.io.Serializable;

/**
 * @auther zh
 * @data 2019/4/12 11:34
 */
public class Customer implements IBuyCar {
    private int money;

    public Customer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void buyCar() {
        System.out.println("买车");
    }
}
