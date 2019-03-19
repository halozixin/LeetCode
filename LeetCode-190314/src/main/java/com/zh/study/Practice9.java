package com.zh.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/3/17 19:26
 */
public class Practice9 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);
    }
}
