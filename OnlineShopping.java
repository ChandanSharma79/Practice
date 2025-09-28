

class Product {
	String productName;
	double productPrice;
	Product(String name,double price){
		this.productName=name;
		this.productPrice=price;
	}
	public void display() {
		System.out.println("Product Name "+productName+" ProductPrice "+productPrice);
	}
}
class Electronics extends Product {
	int warrantyYear;
	Electronics(String name,double price,int warrantyYear){
		super(name,price);
		this.warrantyYear=warrantyYear;
	}
	public void warrantyPeriod() {
		System.out.println(productName+ " has " +warrantyYear+ " years warranty");
	}
}
class Clothing extends Product {
	char size;
	Clothing(String name,double price,char size){
		super(name,price);
		this.size=size;
	}
	public void size() {
		System.out.println("Size "+size+ " is available");
	}
}
public class OnlineShopping {
	public static void main(String[] args) {
		Electronics e = new Electronics("Fan",1500,5);
		e.display();
		e.warrantyPeriod();
		Clothing c = new Clothing("T-Shirt",4000,'M');
		c.display();
		c.size();
	}
}
