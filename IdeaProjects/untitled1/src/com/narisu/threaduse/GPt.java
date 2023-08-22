package com.narisu.threaduse;

public class GPt {
    public static void main(String[] args) throws InterruptedException {
        My my = new My();
        my.setDaemon(true);
        my.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("hoooooooooo");
            Thread.sleep(1000);
        }
    }
}
class My extends Thread {
    @Override
    public void run() {
        for ( ;  ;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hahahaha");
        }
    }
}