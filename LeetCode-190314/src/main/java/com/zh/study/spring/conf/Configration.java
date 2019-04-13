package com.zh.study.spring.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @auther zh
 * @data 2019/4/12 18:01
 */
@Configurable
public class Configration {

    @Bean(name = "person")
    public Person getPerson(){
        Person person = new Person();
        person.setName("zhang");
        person.setAge("19");
        return person;
    }
}
