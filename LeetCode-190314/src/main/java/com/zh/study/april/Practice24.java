package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/26 20:38
 */
public class Practice24 {


    public int getLongestPalindrome(String A, int n) {
        // write code here
        int max = Integer.MIN_VALUE;
        boolean[][] dp = new boolean[n][n];
        //长度
        for (int i = 0; i < n; i++) {
            //起始位置
            for (int j = 0; j < n - i; j++) {
                //结束位置
                int k = i + j;
                if (A.charAt(j) == A.charAt(k)) {
                    if (i == 0 || i == 1) {
                        dp[j][k] = true;
                    } else {
                        dp[j][k] = dp[j + 1][k - 1];
                    }
                    if (dp[j][k]) {
                        max = Math.max(max, i + 1);
                    }
                }
            }
        }
        return max;
    }

}
