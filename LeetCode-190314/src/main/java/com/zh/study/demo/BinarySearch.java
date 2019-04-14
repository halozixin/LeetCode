package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 20:45
 */
public class BinarySearch {
    public static int sort(int[] arr, int left, int right, int num) {

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
               right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(sort(arr,0,4,9));
    }
}
