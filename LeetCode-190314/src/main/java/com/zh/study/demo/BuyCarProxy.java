package com.zh.study.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther zh
 * @data 2019/4/12 11:36
 */
public class BuyCarProxy implements InvocationHandler {
    private Customer customer;

    public BuyCarProxy(Customer customer) {
        super();
        this.customer = customer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(customer,args);
    }


//    @Override
//    public void buyCar() {
//        if (this.customer.getMoney() >400000){
//            this.customer.buyCar();
//        }else {
//            System.out.println("钱不够");
//        }
//
//    }
}
