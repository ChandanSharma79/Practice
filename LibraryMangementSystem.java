package com.practice.abstract1;
abstract class LibraryItem {
	String title;
	String author;
	int itemId;
	LibraryItem(String title,String author,int itemId){
		this.title=title;
		this.author=author;
		this.itemId=itemId;
	}
	abstract void displayItem();
	abstract int getBorrowsDays(int Days);
	void CommonInfo() {
		System.out.println("Library Item ID:"+itemId);
	}
}
class Book extends LibraryItem {
	int pages;
	Book(String title,String author,int itemId,int pages){
		super(title,author,itemId);
		this.pages = pages;
	}
	public void displayItem() {
		System.out.println("Book Details Title:"+title+"|Author:"+author+"|Item ID:"+itemId+"|Pages:"+pages);
	}
	public int getBorrowsDays(int Days) {
		return Days;
	}
}
class Magazine extends LibraryItem {
	int no_Of_Magazine;
	Magazine(String title,String author,int itemId,int no_of_Magazine){
		super(title,author,itemId);
		this.no_Of_Magazine=no_of_Magazine;
	}
	public void displayItem() {
		System.out.println("Magazine Details: Title: "+title+"|Author:"+author+"|Item ID:"+itemId+"|Number of Magazine "+no_Of_Magazine);
	}
	public int getBorrowsDays(int Days) {
		return Days;
	}
}
public class LibraryMangementSystem {
	public static void main(String[] args) {
		LibraryItem l1 = new Book("Java","James Gosling",007,500);
		LibraryItem l2 = new Magazine("Sports","BCCI",03,5);
		l1.displayItem();
		System.out.println("Book Borrowed for "+l1.getBorrowsDays(7)+" days");
		l2.displayItem();
		System.out.println("Magazine Borrowed for "+l2.getBorrowsDays(25)+" days");
	}

}
