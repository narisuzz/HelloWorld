package com.hspedu.oopp;

public class Worker extends Employee {

	public Worker(String name, double sal) {
		super(name, sal);
	}
	//方法
	public void printSal() {//打印全年工资
		System.out.print("工人");
    	super.printSal();//使用了夫类的方法
    }
}
