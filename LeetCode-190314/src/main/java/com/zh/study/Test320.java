package com.zh.study;


import java.util.*;

/**
 * @auther zh
 * @data 2019/3/20 16:17
 * 用两个栈实现队列
 */

public class Test320 {

    public class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);

        }

        public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
        }
    }
}
