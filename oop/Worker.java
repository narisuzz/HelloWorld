package com.hspedu.oop;

public class Worker extends Employee{
	public Worker(String name, double daysal, int workdays, double grader) {
		super(name,daysal,workdays,grader);
	}
//重写 printSal 方法
	public void printSal() {
		super.printSal();
	}
}

