package com.zh.study.demo;

import java.util.Stack;

/**
 * @auther zh
 * @data 2019/4/10 18:59
 * 实现带min函数的栈，使用两个栈实现
 */
class MinStack{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stackmin = new Stack<>();
    public int pop(){
        int tmp = stack1.pop();
        if (tmp == stackmin.peek()){
            stackmin.pop();
        }
        return 0;
    }
    public void push(int num){
        stack1.push(num);
        if (stackmin.empty()){
            stackmin.push(num);
        }else {
            if (stackmin.peek() > num){
                stackmin.push(num);
            }
        }
    }
    public int min(){
        return stackmin.peek();
    }
}
public class Practice25 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
//        minStack.push(2);
//        minStack.push(4);
//        minStack.push(6);
//        minStack.push(1);
        System.out.println(minStack.min());
//        System.out.println();
    }
}
