package com.narisu.draw.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//演示通过键盘 控制小球的上下移动
//keyListener 是监听器 可以监听键盘事件
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    //构造器
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口 JFrame 对象可以监听 键盘事件 即可以监听到面板发生的事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //面板，可以画出小球
    class MyPanel extends JPanel implements KeyListener {
        int x = 10;
        int y = 10;

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.fillOval(x, y, 20, 20);//默认黑色
        }

        // 有字符输出时该方法会触发
        @Override
        public void keyTyped(KeyEvent e) {

        }

        //当某个见按下 该方法会触发
        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println((char)e.getKeyCode() + "这个被按下，，，");
            //根据用户按下的不同键 来处理小球的移动
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                y++;
            }else if (e.getKeyCode() == KeyEvent.VK_UP) {
                y--;
            }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                x--;
            }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x++;
            }
            //让面板重绘
            this.repaint();
        }

        //当某个见 松开了 该方法会触发
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}


