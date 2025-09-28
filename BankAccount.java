package com.practice;
class Account {
	String accountNumber;
	double balance;
	Account(String number,double balance){
		this.accountNumber=number;
		this.balance=balance;
		}
	public void display() {
		System.out.println("Account Number "+accountNumber+" Balance "+balance);
	}
}
class SavingAccount extends Account {
	double interestRate;
	SavingAccount(String number,double balance,double interestRate){
		super(number,balance);
		this.interestRate=interestRate;
	}
	void addInterest() {
		balance+=balance*(interestRate/100);
		System.out.println("Interest Rate added new Balance "+balance);
	}
}
class CurrentAccount extends Account {
	double overdraftLimit;
	CurrentAccount(String number,double balance,double overdraftLimit){
		super(number,balance);
		this.overdraftLimit = overdraftLimit;
	}
	void useOverdraft(double amount) {
		if(amount <= overdraftLimit)
		{
			balance -= amount;
			System.out.println("Used Overdraft. New Balance: "+balance);
		} else {
			System.out.println("OverDraft limit is exceeed!!!");
		}
	}
}
public class BankAccount {
	public static void main(String[] args) {
		SavingAccount SA = new SavingAccount("BO1K",900000,7);
		SA.display();
		SA.addInterest();
		CurrentAccount CA = new CurrentAccount("C01K",9000000,93303);
		CA.display();
		CA.useOverdraft(70000);
	}

}
