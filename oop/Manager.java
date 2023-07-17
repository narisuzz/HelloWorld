package com.hspedu.oop;

public class Manager extends Employee {
	//特有属性
	private double bonus;
	public Manager(String name, double daysal, int workdays, double grader) {
		super(name,daysal,workdays,grader);
	}
	//重写夫类的 printSal方法
	public void printSal() {
		//因为经理的工资计算方式和Employee不一样 所以我们重写
		//super.printSal();
		System.out.println("经理" + getName() + "工资=" + (bonus + getDaysal() * 
				getWorkdays() * getGrader()));
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
