package com.narisu.collection;
import java.util.ArrayList;
import java.util.List;
public class Collwction¥ {
    public static void main(String[] args) {
      List list  = new ArrayList<>();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);
        list.remove(2);
        System.out.println("list=" + list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("list=" + list);
        ArrayList list2 = new ArrayList();
        list2.add("哪吒");
        list2.add("迪丽哪吒");
        list2.add("古丽哪吒");
        list.addAll(list2);
        System.out.println("list=" + list);
        System.out.println(list.containsAll(list2));
        list.add("欧阳辣辣");
        list.removeAll(list2);
        System.out.println("list=" + list);//


    }
}
