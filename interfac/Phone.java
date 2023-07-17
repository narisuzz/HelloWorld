package com.narisu.interfac;

//phone 实现Usblnterface 
//phone 类需要实现 UsbLnterface接口 规定，声明方法
public class Phone implements UsbInteface{
	public void start() {
		System.out.println("手机开始工作，，，，");
	}
	public void stop() {
		System.out.println("手机停止工作，，，，");
	}

}
