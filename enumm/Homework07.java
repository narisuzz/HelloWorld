package com.narisu.enumm;

public class Homework07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化不同的car对象
		Car2 car = new Car2(60);
		car.getAir().flow();
		Car2 car2 = new Car2(-20);
		car2.getAir().flow();
		Car2 car3 = new Car2(18);
		car3.getAir().flow();

	}

}
class Car2 {
	private double temperature;
	public Car2(double temperature) {//构造器
		this.temperature = temperature;
	}
	//Air成员内部类
	class Air {
		public void flow() {
			if(temperature > 40) {
				System.out.println("温度大于40 空调吹冷空气");
			} else if(temperature < 0) {
				System.out.println("温度小于0 空调吹暖气");
			} else {
				System.out.println("温度正常 关闭空调");
			}
		}
	}
	//返回一个Air对象
	public Air getAir() {
		return new Air();
	}
}