package com.VD5.Tuan5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Mainnnn {
	private static List<User> userList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm User");
            System.out.println("2.In ra User");
            System.out.println("3.SX User");
            System.out.println("4.Đăng nhập ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    sortUsers();
                    break;
                case 3:
                    sortUsers();
                    break;
                case 4:
                    login();
                    break;
                case 0: 
                	System.out.println("end");
                break;
            default:
                System.out.println("lua chon khong hop le ");
                break;
        }
        System.out.println();
    } while (choice != 0);
	}
	private static void addUser() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int userType;

	        System.out.println("1. thêm Customer");
	        System.out.println("2. thêm Admin");
	        System.out.print("thêm type: ");
	        userType = scanner.nextInt();
	        scanner.nextLine();

	        User user;
	        if (userType == 1) {
	            user = new Customer();
	        } else if (userType == 2) {
	            user = new Admin();
	        } else {
	        	  System.out.println("Loại User k hợp lệ");
	              return;
	          }

	          user.input();
	          userList.add(user);
	          System.out.println("User đã được thêm thành công");
	}
	public static void printUsers() {
        if (userList.isEmpty()) {
            System.out.println("không tìm thấy user");
        } else {
            System.out.println("DS User");
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }
	private static void sortUsers() {
		// TODO Auto-generated method stub
		Collections.sort(userList, (u1, u2) -> {
            if (u1 instanceof Admin && !(u2 instanceof Admin)) {
                return -1;
            } else if (!(u1 instanceof Admin) && u2 instanceof Admin) {
                return 1;
            } else {
                return 0;
            }
        });

        System.out.println("Users sorted successfully.");
	}
	private static void login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                System.out.println("Logged in user: " + user);
                return;
	}
}
        System.out.println("tên đăng hoặc mật khẩu k hợp lệ");
	}
	
}
