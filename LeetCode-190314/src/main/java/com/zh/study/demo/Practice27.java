package com.zh.study.demo;

import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/10 20:15
 * 通过球面坐标和中心坐标计算半径和体积
 */
public class Practice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[6];
        for (int i = 0; i < 6; i++) {
            array[i] = sc.nextInt();
        }
        double r = Math.sqrt(Math.pow((array[3]-array[0]),2)+Math.pow((array[4]-array[1]),2)
                +Math.pow((array[5]-array[2]),2));
        double res = 4*Math.pow(r,3)*Math.acos(-1)/3;
        System.out.println(String.format("%.3f",r)+" "+String.format("%.3f",res));
    }
}
