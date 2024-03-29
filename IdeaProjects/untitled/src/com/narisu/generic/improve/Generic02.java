package com.narisu.generic.improve;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺旺",10));
        arrayList.add(new Dog("你在狗叫什么",1));
        arrayList.add(new Dog("喵喵",5));

        //arrayList.add(new Cat("招财猫",8));
        for (Dog dog :arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
}

