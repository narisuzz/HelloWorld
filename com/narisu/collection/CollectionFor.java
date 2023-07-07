package com.narisu.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List<Book> col = new ArrayList<>();
        col.add(new Book("西游记","詹姆斯",23));
        col.add(new Book("史蒂芬","詹姆斯",23));
        col.add(new Book("海底星空","詹姆斯",23));
        //使用增强for循环
        for(Object book : col) {
            System.out.println("book=" + book);
        }
    }
}
