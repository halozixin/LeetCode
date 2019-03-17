package com.zh.study.ds;


import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/3/17 14:18
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){

        int length = arr.length;
        for (int i = 0;i < length-1;i++){
            heapSort(arr,length-1-i);
            swap(arr,length-1-i,0);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void heapSort(int[] arr, int lastIndex) {
        for(int i =(lastIndex-1)/2;i >=0;i--){
            int k = i;
            while (2*k+1 <= lastIndex){
                int biggerIndex = 2*k+1;
                if (2*k+1 < lastIndex){
                    if (arr[biggerIndex+1] > arr[biggerIndex]){
                        biggerIndex += 1;
                    }
                }
                if (arr[k] < arr[biggerIndex]){
                    swap(arr,k,biggerIndex);
                }else {
                    break;
                }
            }
        }


    }
}
