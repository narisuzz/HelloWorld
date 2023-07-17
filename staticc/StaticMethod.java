package com.narisu.staticc;

public class StaticMethod {
	public static void main(String[] args) {
		Stu tom = new Stu("tom");
		tom.payFee(100);
		Stu mary = new Stu("mary");
		mary.payFee(200);
		//输出当前的总学费
		Stu.showFee();
	}

}

class Stu {
	private String name;//普通成员
	//定义一个静态变量 来累计学生的学费
	private static double fee = 0;
	public Stu(String name) {
		super();
		this.name = name;
	}
	//当方法 使用了static修饰之后 该方法就是静态方法
	//静态方法就可以访问静态属性 
	public static void payFee(double fee) {//收学费
		Stu.fee += fee;
	}
	public static void showFee() {//总学费
		System.out.println("总学费" + Stu.fee);
		
	}
}
