package com.zh.study.april;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/28 21:06
 */
public class Practice30 {
    private static int N = 13;
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t>=0 && t<=100){
            for (int i = 0; i < t; i++) {
                int num1,num2,len;
                int[] arr = new int[N];
                char[] chars = new char[N];
                num1 =sc.nextInt();
                if (num1 == 0){
                    System.out.println("G");
                }
                String str = String.valueOf(num1);
                len = str.length();
                num2 = num1;
                String G = null,S = null;
                for (int j = len-1; j >= 0; j--) {
                    arr[j] = num1 %10;
                    if (num2%arr[j] == 0){
                        G+="G";
                    }
                    if (num2%arr[j] != 0){
                        S+="S";
                    }
                }
                if (G.length() == len){
                    System.out.println("G");
                }else if (S.length() == len){
                    System.out.println("S");
                }else {
                    System.out.println("H");
                }
            }
        }
    }


}
