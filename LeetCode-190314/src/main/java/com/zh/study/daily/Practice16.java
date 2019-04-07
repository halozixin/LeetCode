package com.zh.study.daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther zh
 * @data 2019/4/7 16:30
 */

public class Practice16 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split(" ");
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.print(array[array.length-1-i]);
            }else{
                System.out.print(array[array.length-1-i]+" ");
            }
        }
        //br.close;
    }
}
