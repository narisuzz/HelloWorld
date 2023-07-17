package com.hspedu.workk; //课后作业355
//写一个Teacher类 名称name 性别 sax 年龄age  工龄workage
public class Teacher extends Person {
//属性
	
	private int workage;
	public Teacher(String name, char gender, int age, int workage) {
		super(name,gender,age);
		this.workage = workage;
	}
	
	public int getWorkage() {
		return workage;
	}
	public void setWorkage(int workage) {
		this.workage = workage;
	}
	public void teach() {
		System.out.println(getName() + "承诺我会认真教学");
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return super.play() + "象棋";
	}
	public void printinfo() {
		System.out.println("老师的信息:");
		System.out.println(super.basicInfo());
		System.out.println("工龄:" + workage);
		teach();
	    System.out.println(play());
	}

	@Override
	public String toString() {
		return "Teacher [workage=" + workage + "]" + super.toString();
	}
	
}
