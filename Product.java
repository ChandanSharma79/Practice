package com.practice;
import java.util.ArrayList;
import java.util.List;
class ProductDetail {
	int productNo;
	String productName;
	int productPrice;
	ProductDetail(int p,String pn,int pp){
		this.productNo=p;
		this.productName=pn;
		this.productPrice=pp;
		
	}
}
public class Product {
	public static void main(String[] args) {
		List<ProductDetail> prd = new ArrayList<ProductDetail>();
		prd.add(new ProductDetail(1,"HPLaptop",35000));
		prd.add(new ProductDetail(2,"AsusLaptop",45000));
		prd.add(new ProductDetail(3,"DellLaptop",55000));
		prd.add(new ProductDetail(4,"LenovoLaptop",65000));
		prd.add(new ProductDetail(5,"MacLaptop",95000));
		prd.stream().filter(p -> p.productPrice > 50000).forEach(pr -> System.out.println(pr.productNo+" "+pr.productName+" "+pr.productPrice));
		
	}

}
