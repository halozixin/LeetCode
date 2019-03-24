package com.zh.study.daily;

import java.util.Arrays;
import java.util.List;

/**
 * @auther zh
 * @data 2019/3/23 10:25
 */
public class Practice10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map( i -> i*i).forEach(System.out::println);

//        numbers.stream().sorted().forEach(System.out::println);
    }
}
