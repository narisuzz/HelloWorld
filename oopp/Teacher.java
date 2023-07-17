package com.hspedu.oopp;

public class Teacher extends Employee{
	// 特有属性
	private int classDays;//一年上课次数
	private double classSal;//课时费
	public Teacher(String name, double sal) {
		super(name, sal);
	}
	public int getClassDays() {
		return classDays;
	}
	public void setClassDays(int classDays) {
		this.classDays = classDays;
	}
	public double getClassSal() {
		return classSal;
	}
	public void setClassSal(double classSal) {
		this.classSal = classSal;
	}
	public void printSal() {
		System.out.print("老师");
		System.out.print(getName( )+ "年薪是：" + (getSal() * getSalMonth() +
				classDays * classSal));
	}
}
