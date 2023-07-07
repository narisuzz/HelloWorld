package com.narisu.Set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("abc"));
        System.out.println(set.add("vba"));
        System.out.println(set.add("kda"));
        System.out.println(set.add("abc"));
        System.out.println(set.add("leo"));
        set.remove("kda");
        System.out.println("set=" + set);

       set = new HashSet<>();
       set.add("lucy");
        set.add("lucy");
        set.add(new Dj("杰瑞"));
        set.add(new Dj("杰瑞"));
        System.out.println("set=" + set);
        set.add(new String("张杰"));
        set.add(new String("张杰"));
        System.out.println("set=" + set);

    }
}
class Dj {
    private String name;

    public Dj(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "name='" + name + '\'' +
                '}';
    }
}
