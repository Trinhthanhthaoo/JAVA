package com.QuanLySach.GK;

import java.util.Scanner;

public class HardcoverBook1 extends Book{
	private String coverMaterial;
	private int numberOfPages;
	public HardcoverBook1(){
		super();
		this.coverMaterial = "";
		this.numberOfPages = 0;
	}
	public HardcoverBook1(String coverMaterial, int numberOfPages, int bookID, String title, String author, long price){
		super(bookID, title, author, price);
		this.coverMaterial = coverMaterial;
		this.numberOfPages = numberOfPages;
	}
	public String getCoverMaterial() {
		return coverMaterial;
	}
	public void setCoverMaterial(String coverMaterial) {
		this.coverMaterial = coverMaterial;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString(){
		return "HardcoverBook1[bookID = " + super.getBookID() + ",title = " + super.getTitle() + ",author = " + super.getAuthor() + 
				"price = " + super.getPrice() + ",coverMaterial = " + coverMaterial + ",numberOfPages = " + numberOfPages + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("chat lieu sach : ");
		this.coverMaterial = sc.nextLine();
		System.out.println("so trang sach : ");
		this.numberOfPages = sc.nextInt();
	}
}

