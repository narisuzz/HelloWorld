package com.narisu.threaduse;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        Tu2 tu2 = new Tu2();
        tu2.start();

        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程" + i + "包子");
            if (i == 5) {
                System.out.println("主线程让子线程先运行");
                tu2.join();
                System.out.println("子线程吃完了");
            }
        }
    }
}
class Tu2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程" + i + "包子");
        }
    }
}
