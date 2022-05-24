package com.classex;

public class Account {
	
	private String name;
	private long balance;
	
	public Account() {
		
	}
	
	public Account(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
	
	
	public long getBalance() {
		return balance;
	}
	
	// 입금기능
	public void deposit(long amount) {
		balance += amount;
	}

	// 출금기능
	public void withdraw(long amount) {
		
		if(balance < amount) {
			System.out.println("잔액 부족");
		} else {
			balance -= amount;
		}
		
	}
	
}
