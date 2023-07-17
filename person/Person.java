package com.hspedu.person;

public class Person {//父类
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public String say() {//返回名字和年龄
		return "姓名" + name + "/" + "年龄" + age;
	} 
}