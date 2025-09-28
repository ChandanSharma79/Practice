package com.practicebank;
class BankAccount {
	private String accountNumber;
	private double balance;
	private String password;
	BankAccount(String number,double balance,String password){
		this.accountNumber=number;
		this.balance=balance;
		this.password=password;
	}
	public double getBalance() {
		return balance;
	}
	public void setPassword(String oldPassword,String newPassword) {
		if(oldPassword.equals(this.password)) {
			this.password=newPassword;
			System.out.println("Password Updated successfully");
		} else {
			System.out.println("Incorrect old password");
		}
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited Rs."+amount);
		} else {
			System.out.println("Invalid Amount");
		}
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn Rs. "+amount);
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}
}
public class BankTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("BAI23",5000,"12345");
		System.out.println("CurrentBalance Rs."+account.getBalance());
		account.deposit(5000);
		account.withdraw(2000);
		account.setPassword("12345", "chandan124");
		account.setPassword("12344","chandan123");
	}

}
