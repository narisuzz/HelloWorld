package com.narisu.interfac;

public class Comera implements UsbInteface{//实现接口，就是把接口的方法实现

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("相机开始工作，，，，");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("相机停止工作，，，，");
	}

}
