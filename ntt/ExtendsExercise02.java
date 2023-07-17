package com.hspedu.ntt;

public class ExtendsExercise02 {
	public static void main(String[] args) {
		C c = new C();
		}
}

class Aa {
	public Aa() {
		System.out.println("我是A类");
	}
}
class Bb extends Aa {
	public Bb() {
		System.out.println("我是B类的无参构造器");
	}
	public Bb(String name) {
		System.out.println(name + "我是B类的有参构造器");
	}
}
class C extends Bb {
	public C() {
		this("hello");
		System.out.println("我是C类的无参构造器");
	}
	public C(String name) {
		super("hahaha");
		System.out.println("我是C类的有参构造器");
	}
}