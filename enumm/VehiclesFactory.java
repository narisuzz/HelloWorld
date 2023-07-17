package com.narisu.enumm;

public class VehiclesFactory {
	//创建交通工具类 有两个方法分别获得 交通工具Horse 和  Boat
	public static Horse getHorse() {
		return new Horse();
	}
	public static Bout getBoat() {
		return new Bout();
	}

}
