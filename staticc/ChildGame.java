package com.narisu.staticc;

public class ChildGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child("哪吒");
		child1.join();
		child1.count++;
		Child child2 = new Child("杨戬");
		child2.join();
		child2.count++;
		Child child3 = new Child("女娲");
		child3.join();
		child3.count++;
		//类变量可以通过类名来访问
		System.out.println("共有" + Child.count +"小孩加入游戏");
		System.out.println("child1.join" + child1.count );
		System.out.println("child2.join" + child2.count );
		System.out.println("child3.join" + child3.count );

	}

}

class Child { //类
	private String name;
	//定义一个变量cound 是个类变量 也叫静态变量
	//该变量最大的特点是会被Child 类的所有的实例共享
	public static int count = 0;
	public Child(String name) {
		this.name = name;
	}
	public void join() {
		System.out.println(name + "加入了游戏");
	}
}
