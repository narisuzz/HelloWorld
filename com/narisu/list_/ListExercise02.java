package com.narisu.list_;

import java.util.ArrayList;
import java.util.List;
public class ListExercise02 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Book("123","321",1000));
        list.add(new Book("123","321",100));
        list.add(new Book("123","321",900));
        list.add(new Book("123","321",300));

        for (Object o : list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("=====排序后=====");
        for (Object o :list) {
            System.out.println(o);
        }


    }
    public static void sort(List list) {
        int listSize = list.size();
        for(int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
