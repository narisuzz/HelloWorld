package com.narisu.utils;

/*
工具类的作用
处理各种情况下的用户输入，并且能够按照程序猿的要求 得到用户的控制台输入
*/
import java.util.*;
public class Utility {
//静态属性
	private static Scanner scanner = new Scanner(System.in);
	public static char readChar() {
	    String input = scanner.nextLine();
	    if (input.length() > 0) {
	        return input.charAt(0);
	    } else {
	        throw new NoSuchElementException("No input found");
	    }
	}
	public static String readString(int i) {
	    String input = scanner.nextLine();
	    if (input.length() <= i) {
	        return input;
	    } else {
	        throw new IllegalArgumentException("String length exceeds the specified limit");
	    }
	}

	public static int readInt() {
	    while (!scanner.hasNextInt()) {
	        System.out.print("Invalid input. Please enter an integer: ");
	        scanner.next();
	    }
	    int input = scanner.nextInt();
	    scanner.nextLine(); // Consume the newline character
	    return input;
	}
	public static boolean readConfirmSelection() {
	    String input = scanner.nextLine().trim().toLowerCase();
	    while (!input.equals("y") && !input.equals("n")) {
	        System.out.print("Invalid input. Please enter Y for Yes or N for No: ");
	        input = scanner.nextLine().trim().toLowerCase();
	    }
	    return input.equals("y");
	}

}
