package com.narisu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {
    public static void main(String[] args) {
        List<Book> col = new ArrayList<>();
        col.add(new Book("西游记","詹姆斯",23));
       col.add(new Book("史蒂芬","詹姆斯",23));
        col.add(new Book("海底星空","詹姆斯",23));
        //System.out.println("col=" + col);
        Iterator<Book> iterator = col.iterator();
        while (iterator.hasNext()) {//判断是否还有数据
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

    }
}
class Book {
    private String name;
    private String author;
    private double price;
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
