package com.zh.study;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/3/20 16:17
 * 思路是字符从前往后找出现的下标和从后往前找出现的下标一样说明这个字符串是第一个不重复
 */
public class Test320 {
    public static void main(String[] args) {
    String str1 = "abc"+"abc";
    String str2 = new String(str1);
        System.out.println(str1.endsWith(str2));
        System.out.println(str1 == str2);
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
    }


}
