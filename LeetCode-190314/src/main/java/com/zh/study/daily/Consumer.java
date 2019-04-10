package com.zh.study.daily;

/**
 * @auther zh
 * @data 2019/4/9 18:20
 */
class Gooods{
    private String goodsName;
    private int count;
    public synchronized void set(String name) throws InterruptedException {
        while (this.count>0){
            wait();
        }
        this.goodsName = name;
        this.count += 1;
        System.out.println(toString());
        notifyAll();
    }
    public synchronized void get() throws InterruptedException {
        while (count == 0){
            wait();
        }
        this.count -= 1;
        System.out.println(toString());
        notifyAll();
    }

    @Override
    public String toString() {
        return "Gooods{" +
                "goodsName='" + goodsName + '\'' +
                ", count=" + count +
                '}';
    }
}
public class Consumer implements Runnable{
    private Gooods gooods;

    public Consumer(Gooods gooods) {
        this.gooods = gooods;
    }

    @Override
    public void run() {
        while (true){
            try {
                gooods.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
