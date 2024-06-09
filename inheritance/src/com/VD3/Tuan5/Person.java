package com.VD3.Tuan5;
import java.util.Scanner;
public class Person {
	private String name;
	private int age;
	private String address;
	public Person(){
		this.name = "";
		this.age = 0;
		this.address = "";
	}
	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("name : ");
		this.name = sc.nextLine();
		System.out.println("age : ");
		this.age = sc.nextInt();
		System.out.println("address : ");
		this.address = sc.nextLine();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYearOfBirth(){
		int currentYear = java.time.Year.now().getValue();
		return currentYear - age;
	}
	public String getUpperName(){
		return name.toUpperCase();
	}
	public boolean checkAge(int n){
		return this.age >= n;
	}
}
