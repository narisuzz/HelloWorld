package com.hspedu.exception;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "哪吒";
			int a = Integer.parseInt(str);
			System.out.println("数字：" + a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally代码块被执行");
		}
		System.out.println("程序继续。。。。");

	}

}
