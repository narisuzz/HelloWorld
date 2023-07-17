package com.hspedu.oopp;

public class CheckingAccount extends BankAccount {
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposit(double amount) {//存款
		// TODO Auto-generated method stub
		super.deposit(amount - 1);
	}
	@Override
	public void withdraw(double amount) {//取款
		// TODO Auto-generated method stub
		super.withdraw(amount + 1);
    }
	
}
