package com.VD5.Tuan5;
import java.util.Scanner;
public class User {
	private String userld;
	private String username;
	private String password;
	private String email;
	public User(){
		this.userld = "";
		this.username = "";
		this.password = "";
		this.email = "";
	}
	public User(String userld,String username,String password, String email ){
		this.email = email;
		this.password = password;
		this.userld = userld;
		this.username = username;
	}
	public String getUserld() {
		return userld;
	}
	public void setUserld(String userld) {
		this.userld = userld;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(){
		return "User [ userld = " + userld + ",username = " + username + ",password" + password + ",email" + email +"]";
	}
	public void input(){
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter user ID: ");
	        this.userld = scanner.nextLine();
	        System.out.print("Enter username: ");
	        this.username = scanner.nextLine();
	        System.out.print("Enter password: ");
	        this.password = scanner.nextLine();
	        System.out.print("Enter email: ");
	        this.email = scanner.nextLine();
	}
}
