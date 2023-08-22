package com.narisu.draw.tankgaGame02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Recorder {
    private static int allEnemyTankNum = 0;
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static String recordFile = "/Users/su/Downloads/";
    public static void keepRecord() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemgTankNum) {
        Recorder.allEnemyTankNum = allEnemgTankNum;
    }
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
