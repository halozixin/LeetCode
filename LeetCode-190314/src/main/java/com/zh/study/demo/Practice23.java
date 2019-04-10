package com.zh.study.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther zh
 * @data 2019/4/10 12:10
 */
interface ISinger{
    void sing();
}
class Singer implements ISinger{

    @Override
    public void sing() {
        System.out.println("唱歌");
    }
}
public class Practice23 {
    public static void main(String[] args) {
        Singer target = new Singer();
        ISinger proxy = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (proxy1, method, args1) -> {
                    System.out.println("hello");
                    Object returnValue = method.invoke(target, args1);
                    System.out.println("Thanks");
                    return returnValue;
                });
        proxy.sing();
    }
}
