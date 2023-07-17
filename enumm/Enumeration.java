package com.narisu.enumm;

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Season.AUTUMN);

	}

}

class Season {
	private String name;
	private String desc;//描述
	//定义四个对象
	public static Season SPRING = new Season("春天","温暖");
	public static Season WINTER = new Season("春天","温暖");
	public static Season AUTUMN = new Season("春天","温暖");
	public static Season SUMMER = new Season("春天","温暖");
	
	//将构造器私有化 防止直接new
    //去掉set方法 防止属性白修改
	//在 Season 内部 直接创建固定对象
	private  Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	
	}
	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
}