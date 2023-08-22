package com.narisu.draw.tankgaGame02;

import javax.swing.*;

public class HspTankGame02 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame01 = new HspTankGame02();
    }
    public HspTankGame02() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板 就是游戏的绘图区
        this.setSize(1300,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
