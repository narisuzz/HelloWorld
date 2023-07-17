package com.narisu.interfac;

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建手机 相机
		Comera comera = new Comera();
		Phone phone = new Phone();
		//建设计算器
		Computer computer = new Computer();
		computer.work(phone);//把手机接入到计算机
		System.out.println("===========");
		computer.work(comera);

	}

}
