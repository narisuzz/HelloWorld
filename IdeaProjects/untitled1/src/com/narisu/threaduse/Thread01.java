package com.narisu.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}
class Cat extends Thread{//当一个类继承了Thread 该类就可以当作线程使用
    int times = 0;
    @Override
    public void run() {// 写上自己的逻辑
        while (true) {
            System.out.println("miaomaio"+(++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times ==8) {
                break;
            }
        }
    }
}
