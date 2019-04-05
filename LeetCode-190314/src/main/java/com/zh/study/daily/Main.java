package com.zh.study.daily;

import java.util.Scanner;
import java.util.Stack;

/**
 * @auther zh
 * @data 2019/3/30 19:39
 */
public class Main {

    TreeNode root ;
    String[] partTree;
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Main main = new Main();
        String[] strs = s.split(",");
        TreeNode root = main.createBinaryTreeByArray(strs, 0);
        boolean validBST = main.isValidBST(root);
        if (validBST){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    private TreeNode createBinaryTreeByArray(String []array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            if (array[index].equals("None")){
                return null;
            }
            Integer value = Integer.valueOf(array[index]);

            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while(!stack.isEmpty() || cur != null){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                if(pre != null && cur.val <= pre.val) {
                    return false;
                }
                pre = cur;
                cur = cur.right;
            }
        }
        return true;
    }
//    public  boolean isCBT(TreeNode head){
//        if(head==null){
//            return true;
//        }
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//        boolean leaf=false;
//        TreeNode l=null;
//        TreeNode r=null;
//        queue.offer(head);
//        while(!queue.isEmpty()){
//            head=queue.poll();
//            l=head.left;
//            r=head.right;
//            if((leaf&&(l!=null||r!=null)) || (l==null&&r!=null)){
//                //当前节点并不是左右孩子都有，那之后的节点必须都为叶节点，否则false
//                //有右孩子没有左孩子 false
//                return false;
//            }
//            if(l!=null){
//                queue.offer(l);
//            }
//            if(r!=null){
//                queue.offer(r);
//            }else{//无右孩子，则后面的节点都为叶节点了
//                leaf=true;
//            }
//        }
//        return true;
//    }
}



