package com.narisu.interfac;

public class IntefaceExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface AD {
	int x = 0; //接口里的 这个等价于 public static final int x = 0；
}

class BB {
	int x = 1;//普通属性
}

class CD extends BB implements AD {
	public void px() {
		System.out.println(AD.x + " " + super.x);
		//访问接口的X 就使用 AD.x
		//访问夫类的X 就使用 super.x
	}
	public static void main(String[] args) {
		new CD().px();
	}
}
