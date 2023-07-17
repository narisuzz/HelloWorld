package com.hspedu.nba;
//夫类
//创建一个夫类 是Pupil 和 Graduate的夫类
public class Student {
	//把Pupil 和 Graduate类的共同属性和方法写下来
	public String name;
	public int age;
	private double score;//成绩
	
	public void setScore(double score) {
		this.score = score;
	}
	public void showInfo() {
		System.out.println("学生名" + name + "年龄" + age + "成绩" + score);
	}
}