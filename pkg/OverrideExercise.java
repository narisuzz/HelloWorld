package com.hspedu.pkg;

public class OverrideExercise {
	public static void main(String[] args) {
		Person person = new Person("nini",20);
		System.out.println(person.say());  
		Student shimi = new Student("shimi",20,123456,99.3);
		System.out.println(shimi.say());  
		
	}
}