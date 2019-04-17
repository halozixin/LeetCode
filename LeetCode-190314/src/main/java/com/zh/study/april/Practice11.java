package com.zh.study.april;

import java.util.ArrayList;

/**
 * @auther zh
 * @data 2019/4/17 12:56
 * 顺时针打印矩阵
 *
 */
public class Practice11 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 0 || col == 0){
            return list;
        }
        int left = 0,right = col-1,top = 0,under = row-1;
        while(left <= right && top <= under){
            for(int i = left; i <= right;i++){
                list.add(matrix[top][i]);
            }
            for(int i = top+1;i<=under;i++){
                list.add(matrix[i][right]);
            }
            if(top != under) {
                for(int i = right-1; i>= left;i--){
                    list.add(matrix[under][i]);
                }
            }
            if(left != right) {
                for(int i = under-1;i>top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            under--;
        }
        return list;
    }
}
