package com.zh.study.demo;

/**
 * @auther zh
 * @data 2019/4/13 21:50
 */
public class Practice33 {
    //删除链表中所有重复结点
    public ListNode deleteDuplicate(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (p2 != null) {
            if (p1.val != p2.val) {
                pre = pre.next;
                p1 = p1.next;
                p2 = p2.next;
            } else {
                while (p2 != null && p1.val == p2.val) {
                    p2 = p2.next;
                }

                pre.next = p2;
                p1 = p2;
                if(p2!=null) {
                    p2 = p2.next;
                }

            }
        }
        return dummy.next;



    }

}
