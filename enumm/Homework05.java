package com.narisu.enumm;

public class Homework05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new  A();
		a.f1();

	}

}

class A {
	private String name = "hell";
	public void f1() {
		class B {//局部内部类
			private final String NAME = "韩顺平大爷";
			public void show() {
				System.out.println("NAME=" + NAME + "外部类的name=" + A.this.name);
			}
		}
		B b = new B();
		b.show();
	}
}
