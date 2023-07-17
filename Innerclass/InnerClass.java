package com.narisu.Innerclass;

public class InnerClass {
	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		cellphone.alarmClouck(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("起床了");
			}
			
		});
		cellphone.alarmClouck(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("上课啦");
			}
			
		});
	}

}
interface Bell {//接口
	void ring();//方法
}
class Cellphone {
	public void alarmClouck(Bell bell) {//形参是Bell接口类型
		bell.ring();
	}
}
