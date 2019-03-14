package com.zh.study;

/**
 * @auther zh
 * @data 2019/3/14 19:44
 * 1.题目描述：给定两个数组，在两个数组中，返回包含相同元素最多的数组的长度。
 * 例子：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 返回：3.
 * 解释：在数组 A和B中最长的子数组为[3,2,1]长度为3.
 */
public class Practice3 {
    public int findLength(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;
        int res = 0;
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (A[i] == B[j]){
                    dp[i+1][j+1] = dp[i][j] +1;
                }
                res = Math.max(res,dp[i+1][j+1]);
            }
        }
        return res;
    }
}
