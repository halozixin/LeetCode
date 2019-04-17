package com.zh.study.april;

import java.util.ArrayList;

/**
 * @auther zh
 * @data 2019/4/15 20:49
 */
public class Practice8 {

    private ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if(str == null || str.length() == 0){
            return list;
        }
        char[] chars = str.toCharArray();
        helper(chars,0);

        return list;
    }
    private void helper(char[] chars,int start){
        if(start == chars.length){
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<chars.length;i++){
                sb.append(chars[i]);
            }
            if (!list.contains(sb.toString())){
                list.add(sb.toString());
            }
        }else{
            for(int i = start;i< chars.length;i++){
                char c = chars[i];
                chars[i] = chars[0];
                chars[0] = c;
                helper(chars,start+1);
                c = chars[0];
                chars[0] = chars[start];
                chars[start] = c;
            }
        }
    }

}
