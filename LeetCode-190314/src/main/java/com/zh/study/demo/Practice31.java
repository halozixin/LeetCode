package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 21:33
 * 翻转链表
 */


 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Practice31 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!= null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
