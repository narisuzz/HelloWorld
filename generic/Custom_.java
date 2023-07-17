package com.narisu.generic;

public class Custom_ {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("baoma",100);
    }
}
class Car {
    public void run() {

    }
    public<T,R> void fly(T t,R r) {//范型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R> {
    public void run() {
    }
    public<U,M>void eat(U u,M m) {

    }
}