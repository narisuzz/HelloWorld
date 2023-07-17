package com.narisu.Innerclass;

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Outer10 { //外部类
	private int n1 = 10;
	private static String name = "k";
	static class Inner10 {//静态内部类；
		public void say() {
			System.out.println(name);
		}
	}
	public void m1() {
		Inner10 inner10 = new Inner10();
		inner10.say();
	}
}