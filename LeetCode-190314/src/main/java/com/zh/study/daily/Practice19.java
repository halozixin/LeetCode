package com.zh.study.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/8 20:33
 */
public class Practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        String string = sc.nextLine();
        int n = sc.nextInt();
        String[] str = string.split(",");
        for (int i = 1; i <str.length-1 ; i++) {
            list.add(Integer.valueOf(str[i]));
        }
        for (int i = 0; i < list.size()/n; i++) {
            for (int j = i*n; j <(i+1)*n ; j++) {
                int tmp = list.get(j);
                list.set(j,tmp);
                list.set((i+1)*n-j,tmp);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }
}
