package com.narisu.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("卧龙");
        list.add("凤雏");
        list.add("张三");
        list.add("李四");
        System.out.println("list=" + list);
        System.out.println(list.get(3));
    }
}
