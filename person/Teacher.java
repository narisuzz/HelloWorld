package com.hspedu.person;

public class Teacher extends Person {
	private double salary;

	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String say() {//重写夫类的say方法
		return super.say() + "salary=" + salary;
	} 
	public void teach() {
		System.out.println("老师" + getName() + "正在教ava");
	}
}