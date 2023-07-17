package com.hspedu.oop;

public class Homework03 {

	public static void main(String[] args) {
		Manager manager =new Manager("jack",1000,15,1.2);
		//设置奖金
		manager.setBonus(3000);
		//打印经历的工资情况
		manager.printSal();
		
		Worker worker = new Worker("guan",230,15,1.0);
		worker.printSal();
	}

}
