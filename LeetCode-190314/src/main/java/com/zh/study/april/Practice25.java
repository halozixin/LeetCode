package com.zh.study.april;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther zh
 * @data 2019/4/27 10:21
 */
class Cow{
    int age = 1;
    public boolean produce(){
        if (this.age >=3 && this.age <=7){
            return true;
        }else {
            return false;
        }
    }
    public boolean die(){
        if (this.age > 10){
            return true;
        }
        return false;
    }
}
public class Practice25 {
    int total = 1;
    List<Cow> list = new ArrayList<>();

public void add(Cow cow){
    if (cow.produce()){
        total++;
        list.add(new Cow());
    }
}
public void sub(Cow cow){
    if (cow.die()){
        total--;
        list.remove(cow);
    }
}
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice25 practice25 = new Practice25();
        practice25.list.add(new Cow());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < practice25.list.size(); j++) {
                Cow cow = practice25.list.get(i);
                practice25.add(cow);
                practice25.sub(cow);
                cow.age++;
            }
        }
        int res = practice25.total;
        System.out.println(res);
    }
}
