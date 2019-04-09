package com.zh.study.ds;

/**
 * @auther zh
 * @data 2019/4/9 16:36
 */
public class RBTree<T extends Comparable<T>> {
    private RBNode<T> mRoot;

    private static final boolean RED = false;
    private static final  boolean BLACK = true;

    public class RBNode<T extends  Comparable<T>>{
        boolean color;
        T key;
        RBNode<T> left;
        RBNode<T> right;
        RBNode<T> parent;

        public RBNode(boolean color, T key, RBNode<T> left, RBNode<T> right, RBNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
    private void leftRotate(RBNode<T> x){
    //设置x的右孩子为y
        RBNode<T> y = x.right;

        x.right = y.left;
        if (y.left != null){
            y.left.parent = x;
        }
        y.parent = x.parent;

        if (x.parent == null){
            this.mRoot = y;
        }else{
            if (x.parent.left == x){
                x.parent.left = y;
            }else {
                x.parent.right = y;
            }

        }
        y.left = x;
        x.parent =y;
    }
}


