package com.zh.study.demo;

import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/4/10 21:04
 */
//class ListNode{
//    int val;
//    ListNode next = null;
//
//    public ListNode(int val) {
//        this.val = val;
//    }
//}
public class Practice28 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            heapSort(arr,arr.length-1-i);
            swap(arr,0,arr.length-1-i);
        }
    }

    private static void heapSort(int[] arr, int lastIndex) {
        for (int i = (lastIndex-1)/2;i>=0;i--){
            int k = i;
            while (2*k+1 <= lastIndex){
                int biggerIndex = 2*k+1;
                if (2*k+1 < lastIndex){
                    if (arr[biggerIndex+1] > arr[biggerIndex]){
                        biggerIndex++;
                    }
                }
                if (arr[biggerIndex] > arr[k]){
                    swap(arr,k,biggerIndex);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
