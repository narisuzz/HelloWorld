package com.hspedu.person;

public class PloyArray {
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person("jack",20);
		persons[1] = new Student("onbk",20,100);
		persons[2] = new Student("ffakyue",20,67.8);
		persons[3] = new Teacher("wwjiao",45,30000);
		persons[4] = new Teacher("jphd",35,20000);
		
		for(int i = 0; i < persons.length; i++) {
			
			System.out.println(persons[i].say());
			
			if(persons[i] instanceof Student) {//判断persons i 的运行类型是不是 Student
				((Student)persons[i]).staudy();//向下转型  如果是 就调用staudy方法
			} else if(persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach();
			} else if(persons[i] instanceof Person) {
				
			} else  {
				System.out.println("类型有误。。。。。。");
			}
		}
		
	}
}