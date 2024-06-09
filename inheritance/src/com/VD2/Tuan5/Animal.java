package com.VD2.Tuan5;
import java.util.Scanner;
public class Animal {
	private String name;
	private int age;
	public Animal(){
		this.name = " ";
		this.age = 0;
	}
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void input(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("name : ");
		this.name = sc.nextLine();
		System.out.println("age : ");
		this.age = sc.nextInt();
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
	public int getYearOfBirth(){
	  int currentYear = java.time.Year.now().getValue();
		return currentYear - age;
	}
}
