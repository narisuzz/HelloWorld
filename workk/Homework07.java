package com.hspedu.workk;  //课后作业355

public class Homework07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("小明",'男',20,"0000231956");
		student.printInfo();//封装,
		Teacher teacher = new Teacher("大黄",'女',30,6);
		teacher.printinfo();
		
		//定义多态数组 2个学生 两个人老师 要求按年龄从高到底排序
		Person[] persons = new Person[4];
		 persons[0] = new Student("jack",'男',25,"0002324");
	     persons[1] = new Student("mary",'女',22,"03824524");
		 persons[2] = new Teacher("tomy",'男',30,6);
		 persons[3] = new Teacher("jumi",'女',35,1);
		 
		 //创建对象
		 Homework07 homework07 = new Homework07();
		 homework07.bubbleSort(persons);
		 //输出排序后的数组
		 System.out.println("------排序后的数组------");
		 for(int i = 0; i < persons.length; i++) {
			 System.out.println(persons[i]);
		 }
		 System.out.println("=====================");
		 for(int i = 0; i < persons.length; i++) {
			 homework07.test(persons[i]);
		 }
	}
	//定义方法 形参为Person 类型 功能 调用学生的study或教师 teach方法
	//分析这里使用 向下转型 和 类型判断
	public void test(Person p) {
		if(p instanceof Student) {//p 的运行类型是如果是Studeent
			((Student)p).study();//向下转型 输出 study（）方法
		} else if (p instanceof Teacher) {//同上
			((Teacher)p).teach();//同上
		}else {
			System.out.println("do noting...");
		}
	}
	//完成年龄从高到底排序
	public void bubbleSort(Person[] persons) {
		Person temp = null;
		for(int i = 0; i < persons.length; i++) {
			for(int j = 0; j < persons.length - 1 -i; j++) {
				//判断条件 这个条件根据需求可以变化
				if(persons[j].getAge() < persons[j + 1].getAge()) {
					temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
			}
		}
	}
}
