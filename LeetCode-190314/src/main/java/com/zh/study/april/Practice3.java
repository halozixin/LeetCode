package com.zh.study.april;

import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/4/14 20:39
 */
public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            meger(arr, left, mid, right);
        }

    }

    private static void meger(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[l + left] = temp[l];
        }

    }



    //堆排序
//    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,9,2,4,6,8,10};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void sort(int[] arr){
//        for (int i = 0; i < arr.length - 1 ; i++) {
//            heapSort2(arr,arr.length-1-i);
//            swap(arr,0,arr.length-1-i);
//        }
//    }
//
//    private static void heapSort2(int[] arr, int lastIndex) {
//        for (int i = (lastIndex-1)/2; i >=0 ; i--) {
//            int k = i;
//            while (2*k+1 <= lastIndex){
//                int bigIndex = 2*k+1;
//                if (2*k+1 < lastIndex){
//                    if (arr[bigIndex+1] > arr[bigIndex]){
//                        bigIndex++;
//                    }
//                }
//                if (arr[bigIndex] > arr[k]){
//                    swap(arr,k,bigIndex);
//                }else {
//                    break;
//                }
//            }
//
//        }
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
}
