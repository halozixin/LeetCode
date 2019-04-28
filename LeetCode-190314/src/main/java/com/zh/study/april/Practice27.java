package com.zh.study.april;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/28 16:12
 * 约瑟夫环问题
 */
public class Practice27 {
    public static int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) {
            return -1;
        }
        int[] arr = new int[n];
        int count = n;
        int i = -1;
        int step = 0;
        while(count > 0){
            i++;
            if(i >= n){
                i = 0;
            }
            if(arr[i] == -1){
                continue;
            }
            step++;
            if(step == m){
                arr[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = Practice27.LastRemaining_Solution(n, m);
        System.out.println(res);
    }
}
