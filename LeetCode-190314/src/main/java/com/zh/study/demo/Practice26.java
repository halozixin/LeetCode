package com.zh.study.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/10 19:49
 */
public class Practice26 {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        StringBuilder sb =new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String res1 = str1.toUpperCase();
        String res2 = str2.toUpperCase();
        for (int i = 0; i < res2.length(); i++) {
            char c = res2.charAt(i);
            hashSet.add(c);
        }
        for (int i = 0; i < res1.length(); i++) {
            if (!hashSet.contains(res1.charAt(i))){
                linkedHashSet.add(res1.charAt(i));
            }
        }
        for (Character c : linkedHashSet){
            System.out.print(c);
        }
    }
}
