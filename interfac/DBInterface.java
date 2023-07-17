package com.narisu.interfac;
//A程序员
public class DBInterface implements DbInteface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("链接DB");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭DB");
	}
		
}
	
