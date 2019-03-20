package com.zh.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 连续最大子串
 * @auther zh
 * @data 2019/3/17 19:26
 */
public class Practice9 {
     static int i = 0;
    public static void main(String[] args) {

        Thread thread = new Thread(()-> {while (true){System.out.println("i" + i++);}});
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,5,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor.execute(thread);

//        Scanner sc = new Scanner(System.in);
//        String pFirstStr = sc.next();
//        String pSecondStr = sc.next();
//        int len1 = pFirstStr.length();
//        int len2 = pSecondStr.length();
//        int[][] arr = new int[len1+1][len2+1];
//        for (int i = 1; i < len1; i++) {
//            for (int j = 1; j < len2; j++) {
//                if (pFirstStr.charAt(i-1) == pSecondStr.charAt(j-1)){
//                    arr[i][j] = arr[i-1][j-1] +1;
//                }else {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//        int max = 0;
//        for (int i = 0; i <= len1; i++) {
//            for (int j = 0; j < len2 + 1; j++) {
//                if (max < arr[i][j]){
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);
    }
}
