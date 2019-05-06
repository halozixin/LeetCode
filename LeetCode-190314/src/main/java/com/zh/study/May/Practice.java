package com.zh.study.May;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/5/5 14:31
 */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char c :set){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
