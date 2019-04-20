package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/20 11:05
 * 小偷偷东西，不能偷数组中连续的
 */
public class Practice {

    public static void main(String[] args) {
    int[] arr = {3,8,14,1};
        System.out.println(getMaxValue(arr));
    }
    public static int getMaxValue(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int len = arr.length;
        if (len == 1){
            return arr[0];
        }
        if (len ==2){
            return Math.max(arr[0],arr[1]);
        }
        int[] res = new int[arr.length];
        res[0] = arr[0];
        res[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < len; i++) {
            res[i] = Math.max(res[i-1],res[i-2]+arr[i]);
        }
        return res[len-1];

    }
    public static int getMaxValue2(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int len = arr.length;
        if (len == 1){
            return arr[0];
        }
        if (len ==2){
            return Math.max(arr[0],arr[1]);
        }
        int pre = arr[0];
        int cur = Math.max(arr[0],arr[1]);
        int next = 0;
        for (int i = 2; i < len; i++) {
           next = Math.max(pre+arr[i],cur);
           pre = cur;
           cur = next;
        }
        return next;
    }

}
