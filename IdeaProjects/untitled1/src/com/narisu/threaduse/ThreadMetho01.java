package com.narisu.threaduse;

public class ThreadMetho01 {
    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        tt.setName("哪吒");
        tt.setPriority(Thread.MIN_PRIORITY);
        tt.start();

        for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("hi" + i);
        }
        tt.interrupt();
    }
}
class TT extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println((Thread.currentThread().getName() + "吃饱了" + i));
            }
            try {
                System.out.println((Thread.currentThread().getName() + "休眠中"));
                Thread.sleep(20000);
            } catch (InterruptedException e) {

                System.out.println((Thread.currentThread().getName() + "被interrupt了"));
            }
        }
    }
}