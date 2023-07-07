package com.narisu.arrays;

import java.util.Arrays;

public class Array02 {
    private static Book[] Books;

    public static void main(String[] args) {
        Books = new Book[4];
        Books[0] = new Book("红楼梦", 100);
        Books[1] = new Book("红楼梦", 200);
        Books[2] = new Book("红楼梦", 900);
        Books[3] = new Book("红楼梦", 100);

        Arrays.sort(Books, (book1, book2) -> Double.compare(book2.getPrice(), book1.getPrice()));
        System.out.println(Arrays.toString(Books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", price=" + price +
                '}';
    }
}
