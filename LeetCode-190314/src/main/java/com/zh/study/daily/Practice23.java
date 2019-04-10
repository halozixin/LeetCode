package com.zh.study.daily;

import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/4/9 20:27
 * 快排
 * 但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序。
 *
 */
public class Practice23 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,10};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    public static void quickSort(int[] arr,int start,int end){
        if (end > start){
        int middle = getMiddle(arr,start,end);
        quickSort(arr,start,middle-1);
        quickSort(arr,middle+1,end);
        }
    }

    private static int getMiddle(int[] arr, int start, int end) {
        int tmp = arr[start];

        while (start < end){
            while (start < end && arr[end] > tmp){
                end--;
            }
            arr[start] = arr[end];
            while (start < end && arr[start] < tmp){
                start++;
            }
            arr[end] = arr[start];

        }
        arr[start] = tmp;
        return start;
    }

}
