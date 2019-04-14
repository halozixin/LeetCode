package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 21:46
 * 链表中间的节点
 */
public class Practice32 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast!= null&& fast.next != null){
                slow = slow.next;
                fast =fast.next.next;
            }
            return slow;
        }
    }
}
