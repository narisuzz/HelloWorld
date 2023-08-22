package com.narisu.threaduse;

public class Homework01_ {
    public static void main(String[] args) {
        T3 t3 = new T3();
        Thread thread1 = new Thread(t3);
        thread1.setName("tt");
        Thread thread2 = new Thread(t3);
        thread2.setName("oo");
        thread1.start();
        thread2.start();


    }
}

class T3 implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//非公平锁
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
            }
            money -= 1000;
            System.out.println(Thread.currentThread().getName() +
                    "取出了1000当前余额 =" + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
