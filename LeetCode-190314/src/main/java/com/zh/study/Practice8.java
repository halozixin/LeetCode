package com.zh.study;

import java.util.Arrays;

/**
 * @auther zh
 * @data 2019/3/17 17:01
 * 654最大二叉树
 * 题目描述
 * 评论 (26)
 * 题解
 * 提交记录
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 *
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 *
 * Example 1:
 *
 * 输入: [3,2,1,6,0,5]
 * 输入: 返回下面这棵树的根节点：
 *
 *       6
 *     /   \
 *    3     5
 *     \    /
 *      2  0
 *        \
 *         1
 * 注意:
 *
 * 给定的数组的大小在 [1, 1000] 之间。
 */
public class Practice8 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0){
            return null;
        }

       return creatMaxTree(nums,0,nums.length-1);
    }

    private  static TreeNode creatMaxTree(int[] nums, int begin, int last) {
        if (begin > last){
            return null;
        }
        int maxNum = nums[begin];
        int index = begin;
        for (int i = begin; i <= last; i++) {
            if (nums[i] > maxNum){
                maxNum = nums[i];
                index = i;
            }
        }
        TreeNode head = new TreeNode(maxNum);
        head.left =  creatMaxTree(nums,begin,index-1);
        head.right = creatMaxTree(nums,index+1,last);
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,8,0};
        System.out.println(constructMaximumBinaryTree(nums).val);
    }

}
