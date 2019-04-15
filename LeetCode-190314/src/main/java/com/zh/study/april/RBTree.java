package com.zh.study.april;

import org.springframework.context.annotation.Bean;

/**
 * @auther zh
 * @data 2019/4/15 10:27
 */
public class RBTree <T extends Comparable<T>>{
    private RBTNode<T> mRoot; //根节点

    private static final boolean RED = false;
    private static final boolean BLACK = true;

    public class RBTNode<T extends Comparable<T>>{
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;

        public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }


/**
* @Description:  红黑树的节点(x)进行左旋转

 * 旋示意图(对节点x进行左旋)：
 *     px                              px
 *    /                               /
 *   x                               y
 *  /  \      --(左旋)--           / \
 * lx   y                          x  ry
 *    /   \                       /  \
 *   ly   ry                     lx  ly
* @Param: [x]
* @return: void
* @Author: Zhang Hao
* @Date: 2019/4/15
*/
private void leftRotate(RBTNode<T> x){
    RBTNode<T> y = x.right;
    // 将 “y的左孩子” 设为 “x的右孩子”；
    // 如果y的左孩子非空，将 “x” 设为 “y的左孩子的父亲”
    x.right = y.left;
    if (y.left != null){
        y.left.parent = x;
    }
    // 将 “x的父亲” 设为 “y的父亲”
    y.parent = x.parent;

    // 如果 “x的父亲” 是空节点，则将y设为根节点
    if (x.parent == null){
        this.mRoot = y;
    }else {
        // 如果 x是它父节点的左孩子，则将y设为“x的父节点的左孩子”
        if (x.parent.left == x){
            x.parent.left = y;
        }else{
            // 如果 x是它父节点的左孩子，则将y设为“x的父节点的左孩子”
            x.parent.right = y;
        }
    }
    // 将 “x” 设为 “y的左孩子”
    y.left = x;
    // 将 “x的父节点” 设为 “y”
    x.parent = y;
}
    /**
    * @Description: 对红黑树的节点(y)进行右旋转
     * 右旋示意图(对节点y进行左旋)：
     *            py                               py
     *           /                                /
     *          y                                x
     *         /  \      --(右旋)-.            /  \
     *        x   ry                           lx   y
     *       / \                                   / \
     *      lx  rx                                rx  ry
     *
    * @Param: [y]
    * @return: void
    * @Author: Zhang Hao
    * @Date: 2019/4/15
    */
    private void rightRotate(RBTNode<T> y){
        RBTNode<T> x = y.left;
        // 将 “x的右孩子” 设为 “y的左孩子”；
        // 如果"x的右孩子"不为空的话，将 “y” 设为 “x的右孩子的父亲”
        y.left = x.right;
        if (x.right != null){
        x.right.parent = y;
        }
        // 将 “y的父亲” 设为 “x的父亲”
        x.parent = y.parent;

        if (y.parent == null){
            // 如果 “y的父亲” 是空节点，则将x设为根节点
            this.mRoot = x;
        }else {
            // 如果 y是它父节点的右孩子，则将x设为“y的父节点的右孩子”
            if (y.parent.left == y){
                y.parent.left = x;
            }else {
                // (y是它父节点的左孩子) 将x设为“x的父节点的左孩子”
                y.parent.right = x;
            }
        }
        // 将 “y” 设为 “x的右孩子”
        x.right = y;
        // 将 “y的父节点” 设为 “x”
        y.parent = x;

    }



    public void insert(T key){
        RBTNode<T> node = new RBTNode<>(BLACK,key,null,null,null);
        if (node!= null){
            insert(node);
        }
    }
    /**
    * @Description: 将节点插入到红黑树
    * @Param: [node]
    * @return: void
    * @Author: Zhang Hao
    * @Date: 2019/4/15
    */
    private void insert(RBTNode<T> node){
        int cmp;
        RBTNode<T> y = null;
        RBTNode<T> x = this.mRoot;
        while (x!= null){
            y = x;
            cmp = node.key.compareTo(x.key);
            if (cmp < 0){
                x = x.left;
            }else {
                x = x.right;
            }
        }
        node.parent = y;
        if (y != null){
            cmp = node.key.compareTo(y.key);
            if (cmp < 0){
                y.left = node;
            }else {
                y.right = node;
            }
        }else {
            this.mRoot = node;
        }
        //2.设置节点颜色
        node.color = RED;

        //3.将其重新修正为二叉树
        insertFixUp(node);

    }
    /**
    * @Description: 红黑树修正方法
     * 在插入节点后，将其重新构建为红黑树
    * @Param: [node]
    * @return: void
    * @Author: Zhang Hao
    * @Date: 2019/4/15
    */
    private void insertFixUp(RBTNode<T> node) {
        RBTNode<T> parent,gparent = null;
        // 若“父节点存在，并且父节点的颜色是红色”
        while ((parent = node.parent)!= null && parent.color == RED){
            gparent = parent.parent;

            //若“父节点”是“祖父节点的左孩子”
            if (gparent.left == parent){
                // Case 1条件：叔叔节点是红色
                RBTNode<T> uncle = gparent.left;
                if ((uncle !=null) && uncle.color ==RED){
                    uncle.color = BLACK;
                    parent.color = BLACK;
                    gparent.color = RED;
                    node = gparent;
                    continue;
                }
                // Case 2条件：叔叔是黑色，且当前节点是左孩子
                if (parent.left == node){
                    RBTNode<T> tmp;
                    rightRotate(parent);
                    tmp = parent;
                    parent = node;
                    node = tmp;
                }
                // Case 3条件：叔叔是黑色，且当前节点是右孩子。
            }
        }
        this.mRoot.color = BLACK;
        gparent.color = RED;
        leftRotate(gparent);
    }
}
