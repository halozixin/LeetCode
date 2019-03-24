package com.zh.study.daily;

import java.util.*;

/**
 * @auther zh
 * @data 2019/3/24 20:28
 */
class Person{
    String name;
    int gard;

    @Override
    public String toString() {
        return name+" "+gard;
    }
}
class MyComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.gard-o2.gard;
    }

}
public class Practice12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        int x = 0;
        while (x++ < 2){
            Person person = new Person();
            person.name = sc.next();
            person.gard = sc.nextInt();
            list.add(person);
        }
        Collections.sort(list,new MyComparator());
        System.out.println("从高到低 成绩");
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("从低到高");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }





}


//    public boolean[] chkSubStr(String[] p, int n, String s) {
//        // write code here
//        boolean[] arr = new boolean[n];
//        for (int i = 0; i < p.length; i++) {
//            if (s.contains(p[i])){
//                arr[i] = true;
//            }else {
//                arr[i] = false;
//            }
//        }
//        return arr;
//    }

