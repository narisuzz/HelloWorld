package com.narisu.string;

public class String03 {
    public static void main(String[] args) {
        String price = "123456.58";
        StringBuilder s = new StringBuilder(price);


        for (int i = s.lastIndexOf(".") - 3; i > 0; i -= 3) {
            s = s.insert(i , ",");
        }
        System.out.println(s);
    }
}
