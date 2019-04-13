package com.zh.study.spring;

import com.zh.study.spring.conf.Configration;
import com.zh.study.spring.conf.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther zh
 * @data 2019/4/12 17:51
 */
public class SpringTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configration.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
