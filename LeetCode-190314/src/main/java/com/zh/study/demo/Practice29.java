package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/11 17:59
 * 求最大连续数组和
 */
public class Practice29 {
    public static void main(String[] args) {

    }
    public static int getMaxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            if (cur > max){
                max = cur;
            }
            if (cur < 0){
                cur = 0;
            }
        }
        return max;
    }
}
