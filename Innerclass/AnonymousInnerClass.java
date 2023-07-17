package com.narisu.Innerclass;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer04 outer04 = new Outer04();
		outer04.method();

	}

}
class Outer04 { //外部类
	private int n1 = 10;
	public void method() { 
		//tiger的编译类型是IA
		//tiger运行类型是 Outer04$1
	IA tiger = new IA() {//基于接口的匿名内部类
		@Override
		public void cry() {
			// TODO Auto-generated method stub
			System.out.println("老虎叫唤，，，");
		}
   };
	tiger.cry();
	
	//演示基于类的匿名内部类
	//father的编译类型是Father
	//fatherde运行类型是 Outer04$2
	Father father = new Father("jack") {

		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("匿名内部类重写了test方法");
		}		
	};
	father.test();
  }
}

interface IA { //接口
	public void cry();
	//基于接口的匿名内部类
}
class Father { //其他类
	public Father(String name) {
		super();
	}
	public void test() {
		
	}
}