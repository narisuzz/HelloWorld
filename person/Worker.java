package com.hspedu.person;

public class Worker extends Employee {
	public Worker(String name,double salary) {
		super(name,salary);
	}
	public void work() {
		System.out.println("普通员工" + getName() + "is woring");
	}
	public double getAnnual() {//调用夫类方法
		return super.getAnnual();
	}
}