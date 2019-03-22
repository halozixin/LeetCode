package com.zh.study;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther zh
 * @data 2019/3/22 18:18
 * 此方法实现了判断数组里面是否有两个数字之和为15
 */

public class Practice0322 {

    public static void main(String[] args) {
        int[] array = {200,100,20,30,40,50};
        boolean flag = isArraySum15(array);
        System.out.println(flag);

    }

    private static boolean isArraySum15(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = 15 - nums[i];
            if (map.get(nums[i]) != null){
                return true;
            }
            map.put(tmp,nums[i]);
        }
        return false;
    }

}
