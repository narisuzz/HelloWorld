package com.hspedu.exception;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 180;
		//要求范围在 18 - 120 之间 否则抛出一个自定义异常
		if(!(age >= 18 && age <= 120)) {
			throw new AgeException("年龄需要在18到20之间");
		}
		System.out.println("你的年龄范围正确");
	}

}

class AgeException extends RuntimeException{

	public AgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
