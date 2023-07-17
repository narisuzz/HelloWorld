package com.narisu.staticc;

public class Manager extends Employee {
	
	private double bouns;

	public Manager(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("经理"+ getName() + "工作中，，，");
		
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	

}
