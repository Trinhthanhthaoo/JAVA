package com.QuanLySach.GK;
import java.util.Scanner;
public class Mainnnnnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        BookManage bookManager = new BookManage();

	    while (true) {
	            System.out.println("1.DS sach");
	            System.out.println("2.them sach");
	            System.out.println("3.tim sach");
	            System.out.println("4. xoa sach theo ID");
	            System.out.println("5.loai sach ");
	            System.out.println("6. tong gia");
	            System.out.println("7. tong kich thuoc");
	            System.out.println("8. Exit");
	            System.out.println("lua chon ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	     switch (choice) {
	            case 1:
	                    bookManager.displayBooks();
	                    break;
	            case 2:
	                    System.out.println("loai sach");
	                    System.out.println("1. sach bia cung");
	                    System.out.println("2. Ebook");
	                    int bookType = scanner.nextInt();
	                    scanner.nextLine();

	                    Book newBook;
	                    if (bookType == 1) {
	                        newBook = new HardcoverBook1();
	                    } else if (bookType == 2) {
	                        newBook = new EBook();
	                    } else {
	                        System.out.println("loai sach khong hop le.");
	                        continue;
	                    }

	                    newBook.input();
	                    bookManager.addBook(newBook);
	                    System.out.println("them sach thanh cong");
	                    break;
	            case 3:
	                    System.out.println("tim kiem sach:");
	                    System.out.println("1. Title");
	                    System.out.println("2. Book ID");
	                    int searchType = scanner.nextInt();
	                    scanner.nextLine();

	                    if (searchType == 1) {
	                        System.out.println("nhap title: ");
	                        String title = scanner.nextLine();
	                        bookManager.searchBook(title);
	                    } else if (searchType == 2) {
	                        System.out.println("nhap bookID: ");
	                        int bookID = scanner.nextInt();
	                        bookManager.searchBook(bookID);
	                    } else {
	                        System.out.println("khong hop le");
	                    }
	                    break;
	             case 4:
	                    System.out.println(" nhap ID de xoa");
	                    int bookID = scanner.nextInt();
	                    bookManager.removeBook(bookID);
	                    break;
	             case 5:
	                    System.out.println("SX sach:");
	                    System.out.println("1. gia (tang dan)");
	                    System.out.println("2. kieu ");
	                    int sortType = scanner.nextInt();
	                    scanner.nextLine();

	                    if (sortType == 1) {
	                        bookManager.sortBooksByPrice();
	                    } else if (sortType == 2) {
	                        bookManager.sortBooksByType();
	                    } else {
	                        System.out.println("khong hop le");
	                    }
	                    break;
	              case 6:
	                    long totalPrice = bookManager.calculateTotalPrice();
	                     }
                  }
     	}
}
