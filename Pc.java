package com.hspedu.ntt;

public class Pc extends Computer {
	private String brand;

	public Pc(String cpu, int memory, int disk, String brand) {
		super(cpu, memory, disk);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void printInfo() {
		System.out.println("pc信息=");
		System.out.println(getDetails() + "brand=" + brand);
	}	
}