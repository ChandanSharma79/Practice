package com.practice;
interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
}
interface Loan {
	void ApplyLoan(int amount);
}
public class Customer implements Bank,Loan {
	private int balance = 5000;
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("Deposited: "+amount+" | Balance"+balance);
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdraw "+amount+" | Balance Left "+balance);
			
		}
		else {
			System.out.println("Insufficient Amount");
		}
		
	}
	public void applyLoan(int amount) {
		System.out.println("Loan of "+amount+ " has been applied successfully.");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.deposit(5000);
		c.withdraw(3000);
		c.applyLoan(40000);
	}
	

}
