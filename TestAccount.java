package com.hspedu.nba;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account();
		account.setName("jack");
		account.setBalance(60);
		account.setPwr("666666");
		
		account.shouwInfo();
	}
}