package com.VD2.Tuan5;
import java.util.Scanner;
public class Cat extends Animal {
	private String color;
	private String breed;
	public Cat(){
		super();
		this.color = "";
		this.breed = "";
	}
	public Cat(String color, String breed, String name, int age){
		super(name, age);
		this.color = color;
		this.breed = breed;
	}
	public String toString(){
		return "Cat [name = " + super.getName() + ", age =" + super.getAge()+ ",color = " + color + ",breed = " + breed +"]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("color");
		this.color = sc.nextLine();
		super.input();
		System.out.println("breed");
		this.breed = sc.nextLine();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean equalBreed(Cat c) {
        return this.breed.equals(c.getBreed());
    }
}
