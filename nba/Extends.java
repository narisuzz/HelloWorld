package com.hspedu.nba;

public class Extends {
	public static void main(String[] args) {
		com.hspedu.nba.Pupil pupil = new Pupil();
		pupil.name = "哪吒";
		pupil.age = 10;
		pupil.testing();
		pupil.setScore(80);
		pupil.showInfo();
		
		System.out.println("==========");
		com.hspedu.nba.Grsduate grsduate  = new Grsduate();
		grsduate.name = "唐僧";
		grsduate.age = 80;
		grsduate.testing();
		grsduate.setScore(0);
		grsduate.showInfo();
	}
	
}