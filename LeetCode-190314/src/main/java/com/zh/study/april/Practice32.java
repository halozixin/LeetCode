package com.zh.study.april;

import java.util.Stack;

/**
 * @auther zh
 * @data 2019/4/29 9:02
 * 将二叉树转为双向链表
 */
public class Practice32 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        boolean isFirst = true;
        Stack<TreeNode> stack = new Stack<>();
        while(p!=null ||!stack.isEmpty()){
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        p = stack.pop();
        if (isFirst){
            pRootOfTree = p;
            pre = pRootOfTree;
            isFirst = false;
        }else {
            pre.right = p;
            p.left = pre;
            pre = p;
        }
        p = p.right;
        }
        return pRootOfTree;
    }
}
