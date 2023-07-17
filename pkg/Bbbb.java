package com.hspedu.pkg;

class Bbbb extends Aaa {
	public void hi() {
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
	}
	public void cal() {
		System.out.println("B类的cal（）");
	}
	public void sum() {
		System.out.println("B类的som（）");
		super.cal();
	}
	public void ko() { //super的运用
		super.test100();
		super.test200();
		super.test300();
	}
	public Bbbb(){
		super();
	}
}