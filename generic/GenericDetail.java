package com.narisu.generic;

import java.util.ArrayList;

public class GenericDetail {
    public static void main(String[] args) {
        //给范型指向数据类型时 要求是引用类习 不能是基本leixing
        ArrayList<Integer> integers = new ArrayList<>();
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig1 = new Pig<A>(new B());
        aPig1.f();
    }
}
class A{}
class B extends A {}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(e.getClass());
    }
}
