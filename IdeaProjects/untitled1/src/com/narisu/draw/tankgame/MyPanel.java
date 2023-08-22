package com.narisu.draw.tankgame;

import javax.swing.*;
import java.awt.*;

//坦克大战的绘图区
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形 默认黑色
        drawTank(hero.getX(),hero.getY(),g,0,0);
        //drawTank(hero.getX() + 60,hero.getY(),g,0,1);
    }
    //画出坦克  封装到方法
    // x  y  是坦克的左上角坐标
    //Graphics g  画笔
    //int direct 坦克的方向  上下左右
    //int type  坦克类型
    public void drawTank(int x,int y, Graphics g,int direct,int type) {
        //根据不同类型的坦克 设置不同颜色
        switch(type) {
            case 0: //我方坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向 来绘制坦克
        switch(direct) {
            case 0: //表示向上
                g.fill3DRect(x,y,10,60,false);//画出坦克的左边轮子
                g.fill3DRect(x + 30,y,10,60,false);//画出坦克的右边轮子
                g.fill3DRect(x + 10,y + 10,20,40,false);//画出坦克的额盖子
                g.fillOval(x + 10,y + 20,20,20);//画出坦克的圆炮台 fillOval填充了颜色
                g.drawLine(x + 20,y + 30,x + 20,y);//画出炮筒  drawLine 画线
            default:
                System.out.println("暂时没有处理");
        }
    }
}
