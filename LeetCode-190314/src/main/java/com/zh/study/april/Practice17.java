package com.zh.study.april;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/22 15:24
 * 第一个只出现一次的单词
 */
public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            char c = findFirstChar(str);
            System.out.println(c);

        }
    }
    public static char findFirstChar(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c)== str.lastIndexOf(c)){
                return c;
            }
        }
        return 0;
    }
}
