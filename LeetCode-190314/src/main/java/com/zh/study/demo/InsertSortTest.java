package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 9:30
 */
public class InsertSortTest {
    public static void insertSort(int[] arr){
        int size = arr.length;
        int tmp = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            tmp = arr[i];
            for(j = i;j>=0 && tmp>arr[j-1];j--){
                arr[j] = arr[j-1];
            }
        }
        arr[j] = tmp;
    }

}
