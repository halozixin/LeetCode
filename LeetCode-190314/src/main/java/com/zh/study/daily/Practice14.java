package com.zh.study.daily;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/5 12:09
 */

public class Practice14 {
    private static float count(int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return (n-1)*(count(n-1)+count(n-2));
    }
    private static float probability(int n){
        if (n == 1){
            return 1;
        }
        return n*probability(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            System.out.println(String.format("%.2f",count(n)/probability(n)*100)+"%");
        }while (sc.hasNext());
    }
}
