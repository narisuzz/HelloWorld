package com.narisu.list_;

import java.util.ArrayList;
import java.util.Iterator;

public class ListFor {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("abs");
        list.add("马保国");
        list.add("ubs");
        list.add("北京烤鸭");
        Iterator iterator = list.iterator();//迭代器
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);
        }
        //增强for
        for (Object o : list) {
            System.out.println("o=" + o);
        }
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i=" + list.get(i));
        }
    }
}
