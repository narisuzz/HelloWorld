package com.hspedu.cba;

public class ExtendsTheory {
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.name);
		System.out.println(son.age);
		System.out.println(son.hobby);
	}
}

class GrandPa {
	String name = "大头爷爷";
	String hobby = "钓鱼";
}
class Father extends GrandPa {
	String name = "小头爸爸";
	 int age = 40;
}
class Son extends Father {
	String name = "大头儿子"; 
}