package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/10 16:59
 */
class Person{
    public void print(){
        System.out.println("1.我是爸爸！");
    }
}
class Student extends Person{
    @Override
    public void print(){
        System.out.println("2.我是儿子！");
    }
}
public class Practice24{
    public static void main(String[] args) {
        Person per = new Student(); //向上转型
        per.print();
    }
}
