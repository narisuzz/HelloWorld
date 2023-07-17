package com.hspedu.exception;
import java.util.Scanner;

public class Tey01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String inputStr = "";
		while (true) {
			System.out.println("请输入一个整数：");
			inputStr = scanner.next();
			try {
				num = Integer.parseInt(inputStr);//这里可能会抛出异常
				break;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("你输入的不是一个整数");
			}
		}
		System.out.println("你输入的数字是" + num);
	}

}
