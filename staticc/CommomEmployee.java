package com.narisu.staticc;

public class CommomEmployee extends Employee {

	public CommomEmployee(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("普通员工"+ getName() + "工作中，，，");
	}
	

}
