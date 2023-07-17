package com.hspedu.oop;

public class Employee {
//先定属性和方法
	private String name;
	private double daysal;
	private int workdays;
	private double grader;
	public Employee(String name, double daysal, int workdays, double grader) {
		super();
		this.name = name;
		this.daysal = daysal;
		this.workdays = workdays;
		this.grader = grader;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDaysal() {
		return daysal;
	}
	public void setDaysal(double daysal) {
		this.daysal = daysal;
	}
	public int getWorkdays() {
		return workdays;
	}
	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	public double getGrader() {
		return grader;
	}
	public void setGrader(double grader) {
		this.grader = grader;
	}
	public void printSal() {
		System.out.println(name + "构工资=" + daysal * workdays * grader );
	}
	
}
