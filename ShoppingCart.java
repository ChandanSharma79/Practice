package com.practice.shoppingcart;
class Product {
	String name;
	double price;
	int stock;
	Product(String name,double price,int stock) {
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	public String getName(String name) {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public void purchaseProduct(int quantity) {
		if(quantity>0 && quantity <= stock) {
			stock-=quantity;
			double totalcost = quantity*price;
			System.out.println(quantity+" "+name+ " purchased. Total: Rs. "+totalcost);
		} else {
			System.out.println("Purchased Failed or Insufficient Quantity!!");
		}
	}
}
public class ShoppingCart {
	public static void main(String[] args) {
		Product p = new Product("Headphone",2500,3);
		Product p1 = new Product("SmartPhone",15000,1);
		p1.purchaseProduct(1);
		p1.purchaseProduct(1);
		p.purchaseProduct(2);
	}

}
