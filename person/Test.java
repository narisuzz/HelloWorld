package com.hspedu.person;

public class Test {
	public static void main(String[] args) {
		Worker tom = new Worker("ggg",200);
		Manager a = new Manager("milan",5000,200000);
		Test test = new Test();
		test.showEmpAnnual(tom);
		test.showEmpAnnual(a);
		test.testWork(tom);
		test.testWork(a);
	}
	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());//动态绑定机制
	}
	
	public void testWork(Employee e) {
		if (e instanceof Worker) {//判断运行类型
			((Worker)e).work();//向下转型
		}else if(e instanceof Manager) {//判断运行类型
			((Manager)e).manage();//向下转型
		}else {
			System.out.println("giao");
		}
	}
}
