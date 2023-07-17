package com.hspedu.oopp;

public class Peasant extends Employee{

	public Peasant(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	public void printSal() {
		System.out.print("农民");
		super.printSal();
	}
}
