package com.hspedu.oopp;

public class BankAccount {
	private double balance;//余额

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	public void deposit(double amount) {//存款
		balance += amount;
	}
	public void withdraw(double amount) {//取款
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
