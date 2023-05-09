package com.hspedu.nba;
public class Encapsu{
public static void main(String[] args) {
	Person person = new Person();
	person.setName("jack");
	person.setAge(30);
	person.setSalary(3000);
	System.out.println(person.info());
	System.out.println(person.getSalary());
	
	}
}
class Person {
	public String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 6) {
		this.name = name;
		} else {
			 System.out.println("名字过长或过短（2-6）字符");
			 this.name = "无名";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 1 && age <= 120) {
		this.age = age;
	   } else {
		   System.out.println("年龄需要在1-120");
		   this.age = 18;
	   }
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private double salary;
	
	public String info() {
		return "name=" + name + "age=" + age + "salary=" + salary;
	}
}
