package com.zh.study.april;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/16 16:54
 */
public class Practice10 {
    public static void main(String[] args) {
        Practice10 practice10 = new Practice10();
        int[] arr = {1,2,3,4,5,6,7,0};
        int count = practice10.count(arr, 8);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
    public int count(int[] A, int n) {
        // write code here
        if(A == null || n == 0){
            return 0;
        }
        return megerSort(A,0,n-1);
    }
    private int megerSort(int[] arr ,int left,int right){
        int res = 0;
        int mid = (left+right)/2;
        if (left < right){
            res += megerSort(arr,left,mid);
            res += megerSort(arr,mid+1,right);
            res += meger(arr,left,mid,right);
        }
        return res;
    }
    private int meger(int[] arr,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        int count = 0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                count += (mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }
        for(int l = 0;l< temp.length;l++){
            arr[l+left] = temp[l];
        }
        return count;
    }
}
