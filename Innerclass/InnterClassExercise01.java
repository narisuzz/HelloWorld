package com.narisu.Innerclass;

public class InnterClassExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1(new IL() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("这是一副名画");
				
			}
			
		});

	}
	public static void f1(IL il) {
		il.show();
	}

}
//接口
interface IL {
	void show();
}
