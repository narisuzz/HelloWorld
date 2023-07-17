package com.hspedu.work;

public class Cat01 extends Animal02 {
	public void eat() {//方法的重写
		System.out.println("猫吃蛇");
	}
	public void catchMouse() {//Cat特有的方法
		System.out.println("猫爪老鼠");
	}
}