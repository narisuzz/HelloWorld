package com.hspedu.work;

public class Poly {
	public static void main(String[] args) {
		Master tom = new Master("tamu..");
		Dog dog = new Dog("大黄");
		Bone bone = new Bone("大便");
		tom.feed(dog,bone);
		
		Cat cat = new Cat("迪丽哪吒..");
		Fish fish = new Fish("古丽纳托");
		tom .feed(cat, fish);
		Pig pig = new Pig("小花");
		Rice rice = new Rice("披萨");
		tom.feed(pig, rice);
	}
}