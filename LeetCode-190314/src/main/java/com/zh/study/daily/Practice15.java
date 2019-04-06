package com.zh.study.daily;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/5 12:27
 * 大数字排序
 */


public class Practice15 {

   static Map map = new HashMap();

    public static void main(String[] args) {
    map.put(3,3);
    map.put(2,2);
    method(map);
        System.out.println(map);
    }

    /**
     * 验证了java是传值而非传地址，java中没有指针
     * @param map
     */
    public static void  method(Map map){
        map = new HashMap();
        map.put(1,1);
    }
//    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(5);
//        node1.next = node2;
//        node2.next = node3;
//        ListNode node4 = new ListNode(2);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(6);
//        node4.next = node5;
//        node5.next = node6;
//        ListNode head = merge(node1, node4);
//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
//
//    }
//    public static ListNode merge(ListNode n1, ListNode n2){
//        if (n1 == null){
//            return n2;
//        }
//        if (n2 == null){
//            return n1;
//        }
//        ListNode head = new ListNode(-1);
//        ListNode tmp = head;
//        while (n1 != null && n2 != null){
//            if (n1.val < n2.val){
//                tmp.next = n1;
//                tmp = n1;
//                n1 = n1.next;
//            }else {
//                tmp.next = n2;
//                tmp = n2;
//                n2 = n2.next;
//            }
//        }
//        if (n1 != null){
//            tmp.next = n1;
//        }
//        if (n2 != null){
//            tmp.next = n2;
//        }
//        return head.next;
//    }


//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        while (s.hasNext()) {
//            int n = s.nextInt();
//            BigInteger[] bg = new BigInteger[n];
//            for (int i = 0; i < n; i++) {
//                bg[i] = s.nextBigInteger();
//            }
//            Arrays.sort(bg);
//            for (int i = 0; i < n; i++) {
//                System.out.println(bg[i]);
//            }
//
//        }
//    }

}
//class ListNode{
//    int val;
//    ListNode next = null;
//
//    public ListNode(int val) {
//        this.val = val;
//    }
//}
//class Test{
//    private static volatile Test test = null;
//    private Test(){}
//    public  static  Test getInstance(){
//        if (test == null){
//            synchronized (Test.class){
//                if (test == null){
//                    test = new Test();
//                }
//            }
//        }
//        return test;
//    }
//}