package com.narisu.draw.tankgaGame02;

import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//坦克大战的绘图区
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌人tanke
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 20;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己的坦克
        hero.setSpeed(8);
        //初始化敌人
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.isTouchEnemyTank(enemyTanks);
            enemyTank.setDirect(2);
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
    }
    public void showInfo(Graphics g){
        g.setColor(Color.black);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("累计击毁敌方坦克",1020,30);
        drawTank(1020,60,g,0,0);
        g.setColor(Color.black);
        g.drawString(Recorder.getAllEnemyTankNum() + "",1080,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形 默认黑色
        showInfo(g);
        //我方坦克 //我方坦克发射
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
       /* if (hero.shot != null && hero.shot.isLive == true) {
            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        }*/
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (hero.shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 2, 2, false);
            } else {
                hero.shots.remove(shot);
            }
        }
        //敌方
        //drawTank(hero.getX() + 60,hero.getY(),g,0,1);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

    //画出坦克  封装到方法
    // x  y  是坦克的左上角坐标
    //Graphics g  画笔
    //int direct 坦克的方向  上下左右
    //int type  坦克类型
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型的坦克 设置不同颜色
        switch (type) {
            case 0: //敌方坦
                g.setColor(Color.cyan);
                break;
            case 1: //克我方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向 来绘制对应方向的坦克
        //direct 表示方向 0是向上 1向右 2向下 3向左
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克的额盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克的圆炮台 fillOval填充了颜色
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒  drawLine 画线
                break;
            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上// 边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克的额盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克的圆炮台 fillOval填充了颜色
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒  drawLine 画线
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克的额盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克的圆炮台 fillOval填充了颜色
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒  drawLine 画线
                break;
            case 3: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上// 边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克的额盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克的圆炮台 fillOval填充了颜色
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒  drawLine 画线
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    //我方坦克击中敌方
    public void hitEnemyTank() {
        for (int j = 0; j < hero.shots.size(); j++) {

            if (hero.shot != null && hero.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }
            }
        }
    }

    public void hitTank(Shot s, EnemyTank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                   if (enemyTank instanceof EnemyTank) {
                       Recorder.addAllEnemyTankNum();
                   }
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char)e.getKeyCode() + "这个被按下，，，");
        //根据用户按下的不同键 来处理小球的移动
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLift();
            }
        }
        //如果用户按下J 就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
           /* if(hero.shot == null || !hero.shot.isLive) {
                hero.shortEnemyTank();
            }*/
            hero.shortEnemyTank();
        }
        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔100毫秒 重绘
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*if (hero.shot != null && hero.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot,enemyTank);
                }
            }*/
            this.repaint();
        }
    }
}
