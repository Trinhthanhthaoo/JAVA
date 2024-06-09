package com.QuanLySach.GK;

import java.util.Scanner;

public class Book {
	private int bookID;
	private String title;
	private String author;
	private long price;
	public Book(){
		this.author = "";
		this.bookID = 0;
		this.price = 0;
		this.title = "";
	}
	public Book(int bookID, String title, String author, long price){
		this.author = author;
		this.bookID = bookID;
		this.price = price;
		this.title = title;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String toString(){
		return "Book[bookID = " + bookID + ",title = " + title + ",author = " + author + "price = " + price + "]";
		
	}
	public void input (){
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma sach: ");
		this.bookID = sc.nextInt();
		System.out.println("nhap tieu de: ");
		this.title = sc.nextLine();
		System.out.println("tac gia cua sach: ");
		this.author = sc.nextLine();
		System.out.println("gia sach: ");
		this.price = sc.nextLong();
	}
}

