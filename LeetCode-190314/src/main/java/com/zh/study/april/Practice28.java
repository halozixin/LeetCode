package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/28 16:31
 */
public class Practice28 {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0){
            return null;
        }
        int[] B = new int[A.length];
        int lenA = A.length;
        B[0] =1;
        for(int i = 1;i<lenA;i++){
            B[i]  = B[i-1]*A[i-1];
        }
        int temp = 1;
        for (int i = lenA-2; i>=0; i--) {
            temp *= A[i+1];
            B[i] *= temp;
        }
        return B;
    }
}
