package com.narisu.generic.improve;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("哪吒");
        person.show();
    }
}
class Person<E> {
    E s;//该数据类型 在定义 Person对象的时候指定 记载编辑期间确定E是什么类型

    public Person(E s) {//E也可以是参数
        this.s = s;
    }
    public E f() {//E也可以在返回类型使用
        return s;
    }
    public void show() {
        System.out.println(s.getClass());
    }
}
