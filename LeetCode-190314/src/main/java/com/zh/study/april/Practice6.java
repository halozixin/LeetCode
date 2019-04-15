package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/15 16:11
 *
 */
public class Practice6 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}
