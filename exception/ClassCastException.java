package com.hspedu.exception;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new B();//向上转型
		B b2 = (B)b;//向下转型

	}

}

class A {}
class B extends A {}
class C extends A {}