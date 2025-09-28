package com.practice;
class Food {
	String name;
	double price;
	Food(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println("Food "+name+", Price "+price);
	}
}
class Pizza extends Food {
	Pizza(String name,double price) {
		super(name,price);
	}
	void addToppings() {
		System.out.println("Extra cheese added to "+name);
	}
}
class Burger extends Food {
	Burger(String name,double price) {
		super(name,price);
	}
	void addPatty() {
		System.out.println("Extra patty added to" +name);
	}
}
class Pasta extends Food {
	Pasta(String name,double price){
		super(name,price);
	}
	void addSauce() {
		System.out.println("Extra sauce added to " +name);
	}
}
public class FoodDeliveryTest {
	public static void main(String[] args) {
		Food[] order = {new Pizza("Veg Pizza",250),new Burger("Veg Burger",75),
				new Pasta("White Sauce Pasta",500) };
		double total = 0;
		for(Food f : order) {
			f.display();
			total += f.price;
			if(f instanceof Pizza) {
				((Pizza)f).addToppings();
			} else if(f instanceof Burger) {
				((Burger)f).addPatty();
			} else if(f instanceof Pasta) {
				((Pasta)f).addSauce();
			}
			System.out.println();
		}
		System.out.println("Total Bill = Rs."+total);
	}

}
