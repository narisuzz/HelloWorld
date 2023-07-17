package com.hspedu.work;

public class PolyDetail {
	public static void main(String[] args) {
		//向上转型：夫类的引用指向了子类对象
		Animal02 animal = new Cat01();
		animal.eat();
		animal.run();
		animal.show();
		animal.sleep();
		
		//向下转型
		Cat01 cat =(Cat01) animal;
		cat.catchMouse();
	}
}