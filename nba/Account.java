package com.hspedu.nba;

public class Account {
	//为了封装 将3个属性设置为Private
	private String name;
	private double balance;
	private String pwr;
	
	 public Account(){
		 
	 }
	
	public Account(String name, double balance, String pwr) {
		this.setName(name);
		this.setBalance(balance);
		this.setPwr(pwr);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 4 ) {
		this.name = name;
		} else {
			System.out.println("姓名有求长度为2-4个字符（默认值 无名）");
			this.name = "无名";
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 20) {
		this.balance = balance;
		}else {
			System.out.println("余额必须大于20（默认值为 0）");
		}
	}
	public String getPwr() {
		return pwr;
	}
	public void setPwr(String pwr) {
		if(pwr.length() == 6) {
		this.pwr = pwr;
		} else {
			System.out.println("密码为6位数 （默认值为 000000）");
			this.pwr = "0000000";
		}
	}
	public void shouwInfo() {
	      System.out.println("name=" + name + "余额=" + balance + "密码=" + pwr);
    }
}