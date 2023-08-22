package chuji;
//使用多线程 模拟三个窗口同时售票
public class SellTicket {
    public static void main(String[] args) {
       /* SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();*/
        SellTicket02 sellTicket02 = new SellTicket02();//实现接口的方式
        new Thread(sellTicket02).start();//一号窗口
        new Thread(sellTicket02).start();//二号窗口
        new Thread(sellTicket02).start();//三号窗口
    }
}
class SellTicket01 extends Thread {
    private static int tickeNum = 100;
    public void run() {
        while (true) {
            if (tickeNum <= 0) {
                System.out.println("售空");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName()
                    + "售出一张票" + "剩余票数" + (--tickeNum));
        }
    }
}

class SellTicket02 implements Runnable {//实现接口的方式
    private  int tickeNum = 100;
    public void run() {
        while (true) {
            if (tickeNum <= 0) {
                System.out.println("售空");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName()
                    + "售出一张票" + "剩余票数" + (--tickeNum));
        }
    }
}