package com.hspedu.workk; //课后作业355

public class Person {

	private String name;
	private char gender;
	private int age;
	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String play() { //把共有的输出内容写到夫类
		return name + "爱玩";
	}
	public String basicInfo() {
		return "名前：" + name + "\n" + "年齢：" + age + "\n" + "性別：" + gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
