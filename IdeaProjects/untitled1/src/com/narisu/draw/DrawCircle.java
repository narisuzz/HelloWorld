package com.narisu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {//JFrame对应窗口 可以理解成画框
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //ba面板放入到窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
//先定义一个 MyPanel 继承Jpanel类 画图形 就在面板上
class MyPanel extends JPanel {
    //MyPanel对象是一个花瓣
    //Graphics g 把 g理解成画笔
    @Override
    public void paint(Graphics g) {//绘图的方法
        super.paint(g);
        //g.drawOval(10,10,100,100);

        //演示绘制不同的图形
        //g.setColor(Color.red);
        //g.fillRect(10,10,100,100);
        Image image = Toolkit.getDefaultToolkit().getImage(DrawCircle.class.getResource("/dd.png"));
        g.drawImage(image,10,10,360,250,this);
    }
}