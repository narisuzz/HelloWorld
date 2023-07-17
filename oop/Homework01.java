package com.hspedu.oop;

public class Homework01 {

	public static void main(String[] args) {
		//初始化Person 对象数组  有3个Person对象
           Person[] person = new Person[3];
           person[0] = new Person("jack",20,"java");
           person[1] = new Person("tom",40,"工程士");
           person[2] = new Person("mary",30,"hr");
           
           //输出当前对象数组
           for(int i = 0; i < person.length; i++) {
        	   System.out.println(person[i]);//默认对象的 toString()
           }
           //使用冒泡排序
           Person tmp = null; //临时变量
           for(int i = 0; i < person.length - 1; i++) {//外层循环
        	   for(int j = 0; j < person.length - 1 -i; j++) {//内层循环
        		   //并按照 age 从大到小 进行排序 如果前面的人的age < 后面人的年龄 就交换
        		   if(person[i].getAge() < person[i + 1].getAge()) {
        			   tmp =person[i];
        			   person[i] = person[i + 1];
        			   person[i +1] = tmp;
        					   
        		   }
        		   
        	   }
           }
           System.out.println("------排序后的顺序-----");
           for(int i = 0; i < person.length; i++) {
        	   System.out.println(person[i]);//默认对象的 toString()
           }
	}

}
//定义一个Person类{name，age，job} 初始化Person 对象数组  有3个Person对象
//并按照 age 从大 到小 进行排序 提示 使用冒泡排序

class Person {
	
	private String name;
	private int age;
	private String job;
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
}