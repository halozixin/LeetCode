package com.zh.study.april;
//
//import java.util.Scanner;
//
///**
// * @auther zh
// * @data 2019/4/28 21:50
// */
//public class Practice31 {
//    private static int resA,resB;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            int n =sc.nextInt();
//            int[] arr= new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            resA = maxProfit(arr);
//            System.out.println(resA+" "+resB);
//        }
//    }
//    public static int maxProfit(int[] prices) {
//        for(int i = prices.length-1;i >= 0; i--){
//            if(i==0){
//                prices[0] = 0;
//                continue;
//            }
//            prices[i] = prices[i] - prices[i-1];
//        }
//        int max = 0;
//        for(int i = 1;i<prices.length;i++){
//            prices[i] = Math.max(prices[i],prices[i]+prices[i-1]);
//           if (max < prices[i]){
//               max = prices[i];
//               resB++;
//           }
//        }
//        return max;
//    }
//
//}
