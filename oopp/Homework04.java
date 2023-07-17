package com.hspedu.oopp;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker("jack",1000);
		worker.printSal();
		Peasant peasant =new Peasant("amith",20000);
		peasant.printSal();
		Teacher teacher = new Teacher("老汉",2000);
		teacher.setClassDays(360);//上课的天数
		teacher.setClassSal(1000);//课时费
		teacher.printSal();
		Scientist scientist = new Scientist("zhongnanshan",20000);
		scientist.setBonus(200000);
		scientist.printSal();
	}

}
