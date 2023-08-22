package com.narisu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("美国队长赵四");
        list.add("灭霸美羊羊");
        list.add(1,"莫扎特");
        System.out.println("list=" + list);
        List list2 = new ArrayList();
        list2.add("悟空");
        list2.add("观音");
        list.addAll(1,list2);
        System.out.println("list=" + list);
        System.out.println(list.indexOf("悟空"));
        list.add("悟空");
        System.out.println(list.lastIndexOf("悟空"));
        list.remove(0);
        System.out.println("list=" + list);
        list.set(4,"玛丽");
        System.out.println("list=" + list);
        List reslist = list.subList(0, 2);
        System.out.println("reslist=" + reslist);
    }
}
