package com.zh.study.May;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @auther zh
 * @data 2019/5/9 21:23
 */
public class Practice4 {
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size)
        {


            ArrayList<Integer> res = new ArrayList<>();
            if(size == 0) return res;
            int begin;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for(int i = 0; i < num.length; i++){
                begin = i - size + 1;
                if(q.isEmpty())
                    q.add(i);
                else if(begin > q.peekFirst())
                    q.pollFirst();

                while((!q.isEmpty()) && num[q.peekLast()] <= num[i])
                    q.pollLast();
                q.add(i);
                if(begin >= 0)
                    res.add(num[q.peekFirst()]);
            }
            return res;
        }
    }
}
