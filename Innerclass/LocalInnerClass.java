package com.narisu.Innerclass;

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer02 outer02 = new Outer02();
		outer02.m1();

	}

}
class Outer02 {//外部类
	private int n1 =100;
	private void m2() {//私有方法
		System.out.println("Outer02 m2()");
	}
	public void m1() {
		//局部内部类的定义在外部类的局部位置，通常在方法
		//不能添加访问修饰符，但是可以是有final 修饰哦
		final class Inner02 { //局部内部类(本质仍然是一个类)
			//可以直接访问外部类的所有成员 包括私有的
			public void f1() {
				System.out.println("n1=" + n1);
				m2();
			}
		}
		//外部类在方法中  可以创建Inner02对象，然后调用方法即可
		Inner02 inner02 = new Inner02();
		inner02.f1();
	}
}