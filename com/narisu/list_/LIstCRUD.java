package com.narisu.list_;

import java.util.LinkedList;

public class LIstCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);
        linkedList.remove(); //默认删除第一个节点
        System.out.println("linkedList=" + linkedList);
        linkedList.set(1,999);
        System.out.println("linkedList=" + linkedList);
        Object o = linkedList.get(1);
        System.out.println(o);
    }
}
