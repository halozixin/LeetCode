package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 19:46
 * 利用数组实现队列
 *
 */
public class MyQueue {
    private int[] queue;

    private int cap;

    private int head;

    private int tail;

    private int size;

    public  MyQueue(int cap){
    this.cap = cap;
    this.head = -1;
    this.tail = -1;
    queue = new int[cap];
    this.size = 0;
    }

    public void add(int value){
        if (size == cap){
            System.out.println("Queue is full");
            return;
        }
        if (++tail == cap){
            tail = 0;
        }
        queue[tail] = value;
        size++;
    }

    public int put(){
        if (size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        if (++head == cap){
            head = 0;
        }
        int res = queue[head];
        size--;
        return res;
    }
}
class Test{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(2);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.put();
        queue.put();
        queue.put();
    }
}
