package com.practice.abstract1;
abstract class Payment {
	double amount;
	Payment(double amount){
		this.amount=amount;
	}
	abstract  void pay();
}
class CreditCardPayment extends Payment {
	String cardNumber;
	CreditCardPayment(double amount,String cardNumber){
		super(amount);
		this.cardNumber=cardNumber;
	}
	public void pay() {
		System.out.println(amount+" is paid using Credit Card: "+cardNumber);
	}
}
class UpiPayment extends Payment {
	String upiID;
	UpiPayment(double amount,String upiID){
		super(amount);
		this.upiID=upiID;
	}
	public void pay() {
		System.out.println(amount+" is paid using UPI ID: "+upiID);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Payment p = new CreditCardPayment(5000,"CBAHF990");
		p.pay();
		Payment p1 = new UpiPayment(5000,"34xyaachand");
		p1.pay();
	}

}
