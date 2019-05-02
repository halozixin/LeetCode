package com.zh.study.april;

import java.util.Stack;

/**
 * @auther zh
 * @data 2019/5/2 22:47
 */
public class Practice34 {
    /*
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    */
    public class Solution {
        TreeNode KthNode(TreeNode pRoot, int k)
        {
            Stack<TreeNode> stack = new Stack<>();
            int count = 0;
            TreeNode node = pRoot;
            while(node != null || !stack.isEmpty()){
                if(node != null){
                    stack.push(node);
                    node = node.left;
                }else{
                    node = stack.pop();
                    count++;
                    if(count == k){
                        return node;
                    }
                    node = node.right;
                }
            }
            return null;
        }


    }
}
