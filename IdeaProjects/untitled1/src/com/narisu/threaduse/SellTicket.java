package com.narisu.threaduse;

public class SellTicket {
    public static void main(String[] args) {
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}
class SellTicket02 implements Runnable{
    public int ticketNum = 100;

    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束....");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() +
                    "售出一张票" + "剩余票数" + (--ticketNum));
        }
    }
}