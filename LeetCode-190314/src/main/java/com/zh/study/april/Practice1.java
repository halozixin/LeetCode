package com.zh.study.april;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zh
 * @data 2019/4/14 15:36
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * LeetCode 118
 */
public class Practice1 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            int count = 0;
            if(numRows == 0){
                return res;
            }
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            res.add(firstRow);
            for(int i = 0;i<numRows-1;i++){
                //此处需要得到杨辉三角上一行数据
                res.add(helper(i+2,res.get(count++)));
            }
            return res;
        }
        private List<Integer> helper(int num,List<Integer> preList){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i< num;i++){
                //三角最外围都是1
                if(i==0 || i==(num-1)){
                    list.add(1);
                }else{
                    int temp = preList.get(i-1)+preList.get(i);
                    list.add(temp);
                }
            }
            return list;
        }
    }
}
