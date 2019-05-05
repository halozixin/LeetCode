package com.zh.study.april;

import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/5/5 14:30
 */
public class Practice37 {

    public class Gift {
        public int getValue(int[] gifts, int n) {
            // write code here
            Arrays.sort(gifts);

            int ans = gifts[n/2];
            int num = 0;
            for(int i = 0; i < gifts.length; i++) {
                if(gifts[i] == ans) {
                    num++;
                }
            }
            return num <= n/2 ? 0 : ans;
        }
    }
}
