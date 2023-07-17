package com.hspedu.oopp;

public class SavingsAccount extends BankAccount {
	
	//新增属性
	private int count = 3;
	private double rate = 0.01;
	public SavingsAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public void deposit(double amount) {//存款
		//
		if(count > 0) {
			super.deposit(amount);
		} else {
			super.deposit(amount - 1);
		}
		count--;
		super.deposit(amount);
	}
	@Override
	public void withdraw(double amount) {//取款
		//
		if(count > 0) {
			super.withdraw(amount);
		} else {
			super.withdraw(amount + 1);
		}
		count--;
		super.withdraw(amount);
	}
	public void warnMonthlyInterest() { //每个月初统计上个月的利息 同时将 count= 3
		count = 3;
		super.deposit(getBalance() * rate);
	}
}
