package com.narisu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("小黑", 300));
        list.add(new Dog("小黑", 100));
        for (Dog dog : list) {
            System.out.println("dog=" + dog);
        }
        System.out.println("=====使用迭代器=====");
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()) {
            Dog dog =  iterator.next();
            System.out.println("Dog= " + dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
