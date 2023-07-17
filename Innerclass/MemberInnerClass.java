package com.narisu.Innerclass;

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer08 outer08 = new Outer08();
		outer08.ti();

	}

}

class Outer08 {//外部类
	private int n1 = 10;
	public String name = "张三";
	//成员内部类 是定义在外部类的成员位置上
	
	class Inner08 {//成员内部类
		public void say() {
			//可以直接访问外部类 的所有成员 包括私有的
			System.out.println("Outer01:n1=" + n1 + "Outer01:name=" + name);
		}
	}
	public void ti() {
		//使用成员内部类
		//创建成元内部类的对象然后使用相关方法
		Inner08 inner08 = new Inner08();
		inner08.say();
	}
}
