package com.narisu.enumm;

public class Homework08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color green = Color.GREEN;
		green.show();
		switch (green) {
		case YELLOW:
			System.out.println("匹配到黄色");
			break;
		case BLACK:
			System.out.println("匹配到黑色");
			break;
			default:
				System.out.println("没有匹配到");
			
		}

	}

}
interface IMyInterface {//接口
	public void show();
}
enum Color implements IMyInterface {//枚举
	RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
	private int redValoue;
	private int greenValoue;
	private int blueValoue;
	private Color(int redValoue, int greenValoue, int blueValoue) {
		this.redValoue = redValoue;
		this.greenValoue = greenValoue;
		this.blueValoue = blueValoue;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("属性值为" + redValoue 
				+ "-" + greenValoue + "-"+ blueValoue);
	}
	
}