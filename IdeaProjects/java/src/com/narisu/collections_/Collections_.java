package com.narisu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        //创建一个ArrayList集合 用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        Collections.reverse(list);
        System.out.println("list=" + list);
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println("list=" + list);
        }
    }
}
