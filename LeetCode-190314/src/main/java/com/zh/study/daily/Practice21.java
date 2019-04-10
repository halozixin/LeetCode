package com.zh.study.daily;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/9 19:43
 */
public class Practice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 6){
            System.out.println(0);
            return;
        }
        int result = (int) (Math.pow(2,(num-6))%666666666);
        System.out.println(result);

    }
}
