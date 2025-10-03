package com.practice.abstract1;
abstract class User {
	String userName;
	String userEmail;
	User(String userName,String userEmail){
		this.userName=userName;
		this.userEmail=userEmail;
	}
	abstract void showRole();
}
class Customer extends User {
	Customer(String name,String userEmail) {
		super(name,userEmail);
	}
	public void showRole() {
		System.out.println("Role:Customer | Name "+userName+" | Email : "+userEmail);
	}
}
class Admin extends User {
	Admin(String name,String userEmail) {
		super(name,userEmail);
	}
	public void showRole() {
		System.out.println("Role:Admin | Name "+userName+" | Email : "+userEmail);
	}
}
abstract class Order {
	String orderId;
	double amount;
	User user;
	Order(String orderId,double amount,User user){
		this.orderId=orderId;
		this.amount=amount;
		this.user = user;
	}
	abstract void orderDetails();
}
class OnlineOrder extends Order {
	String address;
	OnlineOrder(String orderId,double amount,User user,String address){
		super(orderId,amount,user);
		this.address=address;
	}
	void orderDetails() {
		System.out.println("Order Id:"+orderId+" Amount"+amount+"Customer "+user.userName+" Customer Address "+address);
	}
}
class InStoreOrder extends Order {
	String location;
	InStoreOrder(String orderId,double amount,User user,String location){
		super(orderId,amount,user);
		this.location=location;
	}
	void orderDetails() {
		System.out.println("Order Id:"+orderId+" Amount"+amount+"Customer "+user.userName+" Customer Location "+location);
	}
}
abstract class Payment {
	double amount;
	
	Payment(double amount){
		this.amount=amount;
		
	}
	abstract void processPayment();
}
class CreditCardPayment extends Payment {
	String cardNumber;
	CreditCardPayment(double amount,String cardNumber){
		super(amount);
		this.cardNumber=cardNumber;
	}
	public void processPayment() {
		System.out.println("Paid "+amount+":via Credit Card: "+cardNumber);
	}
}
 class CashOnDelivery extends Payment {
	 CashOnDelivery(double amount){
		 super(amount);
	 }
	 public void processPayment() {
		 System.out.println("Payment of "+amount+" will be collected at the time of Delivery");
	 }
 }
public class OrderMangement {
	public static void main(String[] args) {
		User customer1 =new Customer("Alish","chandan@gmail.com");
		User admin1 = new Admin("Rahul","Rahul@gmail.com");
		Order order = new OnlineOrder("O045",500,customer1,"Bangalore");
		Payment payment = new CreditCardPayment(500,"TRANS03");
		customer1.showRole();
		admin1.showRole();
		order.orderDetails();
		payment.processPayment();
	
	}

}
