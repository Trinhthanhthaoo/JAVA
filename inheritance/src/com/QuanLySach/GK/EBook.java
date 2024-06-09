package com.QuanLySach.GK;
import java.util.Scanner;
public class EBook extends Book{
	private String format;
	private double fileSizeMB;
	public EBook(){
		super();
		this.format = "";
		this.fileSizeMB = 0.0;
	}
	public EBook(int bookID,String title,String author,long price,String coverMaterial, int numberOfPages, String format, 
			double fileSizeMB){
		super (bookID, title, author, price);
		this.fileSizeMB = fileSizeMB;
		this.format = format;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public double getFileSizeMB() {
		return fileSizeMB;
	}
	public void setFileSizeMB(double fileSizeMB) {
		this.fileSizeMB = fileSizeMB;
	}
	@Override
	public String toString(){
		return "EBook[bookID = " + super.getBookID() + ",title = " + super.getTitle() + ",author = " + super.getAuthor() 
				+ "price =" + super.getPrice() + ",format" + format + ",fileSizeMB" + fileSizeMB +"]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("dinh dang sach: ");
		this.format = sc.nextLine();
		System.out.println("do lon sach: ");
		this.fileSizeMB = sc.nextDouble();
	}
	public boolean isBigBook(){
		return fileSizeMB > 200;
	}
}
