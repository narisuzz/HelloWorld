package com.narisu.threaduse;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.setLoop(false);

    }
}

class T extends Thread {
    private int count = 10;
    //设置一个私有变量来 控制
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T运行中" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
