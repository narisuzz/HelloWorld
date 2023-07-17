package com.hspedu.work;

public class DynamicBinding {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//A  a是编译类形  B运行类型
		A a = new B();
		System.out.println(a.sum());
		System.out.println(a.sum1());
	}
}

class A {//父类
	public int i = 10;
	public int sum() {
		return getI() + 10;
	}
	public int sum1() {
		return i + 10;
	}
	public int getI() {
		return i;
	}
}

class B extends A {
	public int i = 20;
	/*public int sum() {
		return i + 20;
	}*/
	public int getI() {
		return i;
	}
//	public int sum1() {
//		return i + 10;
//	}
}