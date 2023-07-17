package com.hspedu.work;
//debug对象创造过程  加深对调试的理解
public class DebugExercise {
	public static void main(String[] arge) {
		Person jack = new Person("jack",20);
		System.out.println(jack);
	}
}
class Person {
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}