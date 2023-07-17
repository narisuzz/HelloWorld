package com.narisu.enumm;

public class Person {
	private String name;
	private Vehicles vehicles;
	public Person(String name, Vehicles vehicles) {
		super();
		this.name = name;
		this.vehicles = vehicles;
	}
	//实例化Person对象 唐僧 要求一般情况下用 Horse 作为交通工具 遇到大河是用 
	//Boat 作为交通工具//
	//可以把具体的要求封装成方法
	public void passRiver() {
		//先得到船
		if(!(vehicles instanceof  Bout)) {
			vehicles = VehiclesFactory.getBoat();
		}
		vehicles.work();
	}
	public void common() {
		//得到马
		if(vehicles == null) {
			vehicles = VehiclesFactory.getHorse();
		}
		vehicles.work();
	}

}
