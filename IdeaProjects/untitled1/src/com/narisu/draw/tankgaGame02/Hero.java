package com.narisu.draw.tankgaGame02;

import java.util.Vector;

//自己的坦克
public class Hero extends Tank {
    Shot shot = null; //射击
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y) {
        super(x, y);
    }
    public void shortEnemyTank() {
        if(shots.size() == 5) {
            return;
        }
        switch(getDirect()){//坦克的方向
            case 0:
                shot = new Shot(getX() +20,getY(),0);
                break;
            case 1:
                shot = new Shot(getX() +60,getY() +20,1);
                break;
            case 2:
                shot = new Shot(getX() +20,getY() + 60,2);
                break;
            case 3:
                shot = new Shot(getX() ,getY() + 20,3);
                break;
        }
        shots.add(shot);
        //启动shot 线程
        new Thread(shot).start();
    }
}
