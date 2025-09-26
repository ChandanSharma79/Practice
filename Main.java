package com.practice;
interface AtmCard {
	void insertCard();
	void deposit(int amount);
	void withdraw(int amount);
}
class HDFC implements AtmCard {
	private int balance = 5000;
	public void insertCard() {
		System.out.println("HDFC Card is Inserted.");
	}
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("Deposited: "+amount+" | Balance "+balance);
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdraw: "+amount+" | Balance Left "+balance);
		}
		else {
			System.out.println("Insufficient Balance...");
		}
	}
}
class SBI implements AtmCard {
	private int balance = 5000;
	public void insertCard() {
		System.out.println("SBI Card is Inserted.");
	}
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("Deposited: "+amount+" | Balance "+balance);
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdraw: "+amount+" | Balance Left "+balance);
		}
		else {
			System.out.println("Insufficient Balance...");
		}
	}
}
public class Main {
	public static void main(String[] args) {
		HDFC Card1 = new HDFC();
		Card1.insertCard();
		Card1.deposit(10000);
		Card1.withdraw(5000);
		SBI Card2 = new SBI();
		Card2.insertCard();
		Card2.deposit(15000);
		Card2.withdraw(10000);
	}

}
