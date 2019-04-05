package com.zh.study.daily;

import java.util.ArrayList;

/**
 * @auther zh
 * @data 2019/3/25 14:25
 * 二叉树的层次遍历
 */
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
public class Practice13 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }

    /**
     * 二叉树的序列化
     *
     * @param root
     * @return
     */
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    /**
     * 二叉树的反序列化
     *
     * @param str
     * @return
     */
    private int index = -1;
    TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        if (index >= len){
            return null;
        }
        String[] roots = str.split(",");
        TreeNode node = null;
        if (!roots[index].equals("#")){
            node = new TreeNode(Integer.valueOf(roots[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
