package com.narisu.Innerclass;

public class AnonymousInnerClassDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer05 outer05 = new Outer05();
		outer05.f1();

	}

}

class Outer05 {
	private int n1 = 99;
	public void f1() {
		//创建一个基于类的匿名内部类
		Person p = new Person() {
			@Override
			public void hi() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类重写了hi方法");
			}
		};
		p.hi();
		new Person() {
			@Override
			public void hi() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类重写了hi方法hahahaha");
			}

			@Override
			public void ok(String str) {
				// TODO Auto-generated method stub
				super.ok(str);
			}
			
		}.ok("jack");
	}
}

class Person {
	public void hi() {
		System.out.println("person hi()");
	}
	public void ok(String str) {
		System.out.println("Person ok()" + str);
	}
}