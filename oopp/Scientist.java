package com.hspedu.oopp;

public class Scientist extends Employee {
	//特有属性
	//年终奖 donus
	private double bonus;

	public Scientist(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	//重写年工资方法
	public void printSal() {
		System.out.println();
		System.out.print("教授");
		System.out.print(getName() + "年工资是：" + (getSal() * getSalMonth() + bonus));
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
