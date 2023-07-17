package com.hspedu.workk;//课后作业355
//Student 类有名称name 性别 sex  年龄age 学好 
public class Student extends Person {
//属性
	
	private String stuid;
	public Student(String name, char gender, int age, String stuid) {
		super(name,gender,age);
		this.stuid = stuid;
	}
	//方法
	
	public String getStuid() { 
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public void study() {
		System.out.println(getName() +"承诺会好好学习");
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return super.play() + "足球";
	}
	//编写一个输出信息的方法 这样体现封装
	public void printInfo() {
		System.out.println("学生信息:");
		System.out.println(super.basicInfo());
		System.out.println("学号:" + stuid);
	    study();
	    System.out.println(play());
	    
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + "]" + super.toString();
	}
	
}
