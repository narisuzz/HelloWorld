package com.narisu.enumm;

public class EnumExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取到所有的枚举对象 即数组
		Week[] weeks = Week.values();
		//遍历使用增强for循环
		for (Week week : weeks) {
			System.out.println(week);
		}

	}

}

enum Week{
	//定义Week的枚举对象
	MONDAY("星期一"),MONDA("星期一"),MONDAYy("星期一"),MONDAYk("星期一");
	private String name;

	private Week(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
