package com.narisu.enumm;

public class Ho¥mework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.shout();
		dog.shout();

	}

}

abstract class Animal {//抽象类
	public abstract void shout();
}
class Cat extends Animal {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("小猫喵喵叫");
	}
}
class Dog extends Animal {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("狗汪汪叫");
	}
}