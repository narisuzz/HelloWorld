package com.narisu.Innerclass;

public class InnerClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Outer { //外部类
	private int n1 = 100; //属性

	public Outer(int n1) {//构造器
		super();
		this.n1 = n1;
	}
	public void m1() {//方法
		System.out.println("m1()");
	}
	{//  代码块
		System.out.println("代码块，，，");
	}
	class Inner {// 内部类，在Outer类的内部
		
	}
}