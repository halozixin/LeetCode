package com.zh.study.april;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/23 16:34
 */
public class Practice18 {
    public static void main(String[] args) {
        char c = 'A';
        c += 32;
        System.out.println(c);
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            String str = sc.nextLine();
//           String res =  changeStr(str);
//            System.out.println(res);
//        }
    }

    private static String changeStr(String str) {
        String[] strings = str.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String res = null;
            if (i != 0){
                char[] chars = strings[i].toCharArray();
                chars[0]  -= 32;
                 res = String.valueOf(chars);
            }
            sb.append(res);
        }
        return sb.toString();
    }
}
