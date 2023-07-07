package com.narisu.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("123");
        set.add("1234");
        set.add("123");
        set.add("1235");
        set.add("1238");
        set.add("1239");
        set.add(null);
        set.add(null);
        System.out.println("set=" + set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
        for (Object o : set) {
            System.out.println("o=" + o);
        }

    }

}
