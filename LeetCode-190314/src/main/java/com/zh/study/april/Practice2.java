package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/14 19:49
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Practice2 {
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if(sequence.length == 0){
                return false;
            }
            if(sequence.length == 1){
                return true;
            }
            return helper(sequence,0,sequence.length-1);
        }
        private boolean helper(int[] arr, int start,int end){
            if(start > end){
                return true;
            }
            int i = start;
            while(arr[i]<arr[end]){
                i++;
            }
            for(int j = i;j<end;j++){
                if(arr[j]<arr[end]){
                    return false;
                }
            }
            return helper(arr,start,i-1)&&helper(arr,i,end-1);
        }
    }
}
