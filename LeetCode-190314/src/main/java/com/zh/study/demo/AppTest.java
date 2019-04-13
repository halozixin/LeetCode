package com.zh.study.demo;


import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/4/12 15:07
 * 动态代理
 */
public class AppTest {
    public static void main(String[] args) {
        Customer customer = new Customer(5000000);
        BuyCarProxy carProxy = new BuyCarProxy(customer);
        IBuyCar bc = (IBuyCar) Proxy.newProxyInstance(IBuyCar.class.getClassLoader(), new Class[]{IBuyCar.class}, carProxy);
        bc.buyCar();


    }
}
