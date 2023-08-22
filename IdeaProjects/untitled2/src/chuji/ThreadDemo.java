package chuji;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        Thread thread2 = new Thread(myRun);
        thread.setName("k");
        thread2.setName("p");
        thread.start();
        thread2.start();
    }
}
