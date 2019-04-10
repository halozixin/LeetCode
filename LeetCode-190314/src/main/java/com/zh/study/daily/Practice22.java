package com.zh.study.daily;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/9 20:08
 */
public class Practice22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();
        int boy = 0;
        int girl = 0;
        for (int i = 0; i < num ; i++) {
            boy += sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            girl+=sc.nextInt();
        }
        double res = 0;
        if (boy == 2*girl){
            res = total;
            System.out.println(String.format("%.6f",res));
            return;
        }else if (boy > 2*girl){
            res = 3*girl;
            if (res > total){
                res = total;
            }
            System.out.println(String.format("%.6f",res));
        }else {
            res = boy*1.5;
            if (res > total){
                res = total;
            }
            System.out.println(String.format("%.6f",res));
        }

    }
}
