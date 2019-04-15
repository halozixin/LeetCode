package com.zh.study.april;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther zh
 * @data 2019/4/15 16:26
给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

示例 1:
给定的树 s:

3
/ \
4   5
/ \
1   2
给定的树 t：

4
/ \
1   2
返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。

示例 2:
给定的树 s：

3
/ \
4   5
/ \
1   2
/
0
给定的树 t：

4
/ \
1   2
返回 false。
 */
public class Practice7 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(s);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val == t.val){
                if(isSame(node,t)) return true;
            }
            if(node.left!= null){
                queue.offer(node.left);
            }
            if(node.right !=null){
                queue.offer(node.right);
            }
        }
        return false;
    }
    private boolean isSame(TreeNode t1,TreeNode t2){
        if(t1== null && t2 == null){
            return true;
        }
        if(t1!=null && t2 != null){
            return (t1.val == t2.val)&&
                    isSame(t1.left,t2.left)&&
                    isSame(t1.right,t2.right);
        }
        return false;
    }
}
