package com.zh.study.ds;

import java.util.Stack;

/**
 * @auther zh
 * @data 2019/3/18 16:51
 * 实现二叉树的先序，中序，后续遍历的递归与非递归
 */

class TreeNode{
    public TreeNode left = null;
    public TreeNode right = null;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
/**
* @Description: 遍历顺序根左右
* @Param: [root]
* @return: void
* @Author: Zhang Hao
* @Date: 2019/3/18
*/
public void preOrderRecs(TreeNode root){
    if (root != null){
        System.out.println(root.val);
        preOrderRecs(root.left);
        preOrderRecs(root.right);
    }
}

/**
* @Description: 先序遍历非递归
* @Param: [root]
* @return: void
* @Author: Zhang Hao
* @Date: 2019/3/19
*/

public void preOrder(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    TreeNode p = root;
    while(p != null || !stack.isEmpty()){
        while (p != null){
            System.out.println(p.val);
            stack.push(p);
            p = p.left;
        }
        if (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            p = pop.right;
        }
    }
}


public void inOrderRecs(TreeNode root){
    if (root != null){
        preOrderRecs(root.left);
        System.out.println(root.val);
        preOrderRecs(root.right);
    }
}


public void inOrder(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    TreeNode p = root;
    while (p!=null || !stack.isEmpty()){
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        if (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            p = pop.right;
        }
    }
}







    public void postOrderRecs(TreeNode root){
        if (root != null){
            preOrderRecs(root.left);
            preOrderRecs(root.right);
            System.out.println(root.val);
        }
    }
/**
* @Description: 后序遍历，如果此节点没有左右孩子，那么就输出该节点。如果
* @Param: [root]
* @return: void
* @Author: Zhang Hao
* @Date: 2019/3/19
*/
    public void postOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null,cur = null;
        stack.push(root);
        while (!stack.isEmpty()){
            cur = stack.peek();
            if ((cur.left == null &&cur.right == null)|| (pre!=null&&(cur.right ==pre || cur.left == pre))){
                TreeNode pop = stack.pop();
                System.out.println(pop.val);
                pre = pop;
            }
            else {
                if (cur.right != null){
                    stack.push(cur.right);
                }
                if (cur.left !=null){
                    stack.push(cur.left);
                }
            }
        }

    }

}
class TestTree{
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);

        treeNode.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.preOrder(treeNode);
        binaryTree.inOrder(treeNode);
        binaryTree.postOrder(treeNode);
    }
}