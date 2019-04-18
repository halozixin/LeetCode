package com.zh.study.april;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/18 20:03
 * 求数组中n个数字的连续最大和
 */
public class Practice13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        findMaxValue(arr,k);
    }

    private static void findMaxValue(int[] arr, int k) {

    }
}
