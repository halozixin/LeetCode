package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/25 16:18
 */
public class Practice22 {


//    public static void main(String[] args) {
//        Practice22 practice22 = new Practice22();
//        int[] arr = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9};
//        int res = practice22.GetNumberOfK(arr, 1);
//        System.out.println(res);
//    }

    private int GetNumberOfK(int[] array, int k) {
        int first = getFirst(array,0,array.length-1,k);
        int last = getLast(array,0,array.length-1,k);
        if(last != -1 && first != -1){
            return last-first+1;
        }
        return 0;
    }

    private int getLast(int[] array, int start, int end, int k) {
        if (start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        while (start <= end){
            if (array[mid] > k){
                end = mid-1;
            }else if (array[mid] < k){
                start = mid+1;
            }else if ((mid+1) <array.length && array[mid+1] == k){
                start = mid +1;
            }else {
                return mid;
            }
            mid = (start +end) >> 1;
        }

        return -1;

    }

    private int getFirst(int[] array, int start, int end, int k) {
        if (start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        while (start <= end){
            if (array[mid] > k){
                end = mid-1;
            }else if (array[mid] < k){
                start = mid+1;
            }else if ((mid-1) >=0 && array[mid-1] == k){
                end = mid-1;
            }else {
                return mid;
            }
            mid = (start +end) >> 1;
        }

        return -1;
    }
}
