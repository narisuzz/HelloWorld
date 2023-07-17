package com.narisu.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",20));
        students.add(new Student("mary",19));

        for (Student student :students) {
            System.out.println(student);
        }
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("milan",new Student("milan",34));
        hm.put("smith",new Student("smith",67));
        hm.put("hsp",new Student("hsp",98));

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());

        }
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}