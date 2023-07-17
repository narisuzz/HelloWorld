package com.hspedu.exception;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		//如果程序员认为 一段代码可能出现异常问题 可以使用try-catch 异常处理机制来解决
		//如果进行了异常处理 那么即使出现异常 程序可以继续执行
		try {
			int res = num1 / num2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程序继续运行");

	}

}

