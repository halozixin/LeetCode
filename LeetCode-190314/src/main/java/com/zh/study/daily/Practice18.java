//package com.zh.study.daily;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * @auther zh
// * @data 2019/4/8 20:04
// * 链表反转
// */
//class  ListNode{
//    int val;
//
//    ListNode next = null;
//    public ListNode(int val) {
//        this.val = val;
//    }
//}
//public class Practice18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList();
//        String string = sc.nextLine();
//        int i1 = sc.nextInt();
//        String[] str = string.split(",");
//        for (int i = 1; i <str.length-1 ; i++) {
//            list.add(Integer.valueOf(str[i]));
//        }
//        list.add(i1);
//        ListNode head = new ListNode(-1);
//        ListNode cur = head;
//        for (int i = 0; i < list.size()-1; i++) {
//            ListNode node = new ListNode(list.get(i));
//            cur.next = node;
//            cur = node;
//        }
//        cur.next = null;
//        ListNode res = revers(head.next,list.get(list.size()-1));
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        while (res != null){
//            sb.append(res.val+",");
//            res = res.next;
//        }
//        sb.append("]");
//        System.out.println(sb.toString());
//    }
//
//    private static ListNode revers(ListNode head, Integer k) {
//        ListNode prev = null;
//        ListNode cur = head;
//        ListNode next = null;
//        ListNode check = head;
//        int canProceed = 0;
//        int count = 0;
//        while (canProceed < k && check != null){
//            check = check.next;
//            canProceed++;
//        }
//        if (canProceed == k){
//            while (count < k && cur != null){
//                next = cur.next;
//                cur.next = prev;
//                prev = next;
//                cur = next;
//                count++;
//            }
//            if (next != null){
//                head.next = revers(next,k);
//            }
//            return prev;
//        }else {
//            return head;
//        }
//    }
//}
