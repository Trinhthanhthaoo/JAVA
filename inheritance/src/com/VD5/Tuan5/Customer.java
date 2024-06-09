package com.VD5.Tuan5;
import java.util.Scanner;
public class Customer extends User{
	private String shippingAddress;
	public Customer(){
		super();
		this.shippingAddress = "";
	}
	public Customer(String shippingAddress, String userld, String username, String password, String email){
		super(userld, username, password, email);
		this.shippingAddress = shippingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String toString(){
		 return "Customer [userld=" + getUserld() + ", username=" + getUsername() + ", password=" + getPassword()
	                + ", email=" + getEmail() + ", shippingAddress=" + shippingAddress + "]";
	    }
	public void input(){
		 super.input();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter shipping address: ");
	        this.shippingAddress = scanner.nextLine();
	}
	}
