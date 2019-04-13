package com.zh.study.spring.conf;

/**
 * @auther zh
 * @data 2019/4/12 18:02
 */
public class Person {
    private String name;
    private String age;
    public Person(){
        super();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
