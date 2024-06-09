package com.QuanLySach.GK;
import java.util.Scanner;
import java.util.ArrayList;
public class BookManage {
	private ArrayList<Book> books;

    public BookManage() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the given title.");
        }
    }

    public void searchBook(int bookID) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No books found with the given bookID.");
        }
    }

    public void removeBook(int bookID) {
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("No books found with the given bookID.");
        }
    }

    public void sortBooksByPrice() {
        books.sort((b1, b2) -> Long.compare(b1.getPrice(), b2.getPrice()));
        System.out.println("Books sorted by price:");
        displayBooks();
    }

    public void sortBooksByType() {
        books.sort((b1, b2) -> b1.getClass().getSimpleName().compareTo(b2.getClass().getSimpleName()));
        System.out.println("Books sorted by type:");
        displayBooks();
    }

    public long calculateTotalPrice() {
        long totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public double calculateTotalSize() {
        double totalSize = 0;
        for (Book book : books) {
            if (book instanceof EBook) {
                EBook eBook = (EBook) book;
                totalSize += eBook.getFileSizeMB();
            }
        }
        return totalSize;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
