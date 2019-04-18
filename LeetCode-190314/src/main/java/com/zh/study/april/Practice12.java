package com.zh.study.april;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zh
 * @data 2019/4/18 18:46
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Practice12 {
    public String PrintMinNumber(int [] numbers) {
    String str = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        list.sort((o1,o2)-> (o1+""+o2).compareTo(o2+""+o1));
        for (int i = 0; i < list.size(); i++) {
            str+=list.get(i);
        }
        return str;
    }
}
