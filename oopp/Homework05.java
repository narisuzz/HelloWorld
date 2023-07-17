package com.hspedu.oopp;

public class Homework05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * CheckingAccount c = new CheckingAccount(1000); c.deposit(10); c.withdraw(9);
		 * System.out.println(c.getBalance());
		 */
     SavingsAccount s = new SavingsAccount(1000);
     s.deposit(100);
     s.deposit(100);
     s.deposit(100);
     s.deposit(100);
     System.out.println(s.getBalance());
     s.warnMonthlyInterest();
     System.out.println(s.getBalance());
	}

}
