package com.hspedu.exception;

public class NullPointerException {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.length());//空指针异常
	}

}