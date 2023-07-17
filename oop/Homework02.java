package com.hspedu.oop;

public class Homework02 {

	public static void main(String[] args) {
		Porfessor porfessor = new Porfessor("giao",25,"pordessor",30000,1.3);
		porfessor.introduce();
	}

}

//要求有属性姓名name  年龄age 职称 post 基本工资 salary
//编写方法 introduce  实现输出一个教师的信息
 class Teacher {
	private String name;
	private int age;
	private String post;
	private double salary;
	private double grade;
	public Teacher(String name, int age, String post, double salary, double grade) {
		super();
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public void introduce() {
		System.out.println("name:" + name + "age:" + age + "Post:" + post + "salary:"
				+ salary + "grade:" + grade);
	}
}
