package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/28 9:28
 * 判断一棵二叉树是否为平衡二叉树
 */
public class Practice26 {
    public class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if(root == null){
                return true;
            }
            return (Math.abs(depth(root.left)-depth(root.right)) <= 1)
                    &&IsBalanced_Solution(root.left)&&
                    IsBalanced_Solution(root.right);

        }
        private int depth(TreeNode root){
            if(root == null){
                return 0;
            }
            return Math.max(depth(root.left),depth(root.right))+1;
        }
    }
}
