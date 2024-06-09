package com.VD2.Tuan6;
import java.util.Scanner;
public abstract class Student {
	private String masv;
	private String name;
	private int age;
	public Student(){
		this.name = "";
		this.masv = "";
		this.age = 0;
	}
	public Student(String masv, String name, int age){
		this.age = age;
		this.masv = masv;
		this.name = name;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
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
	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age
				+ "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		this.name = sc.next();
		System.out.println("masv: ");
		this.masv = sc.next();
		System.out.println("age: ");
		this.age = sc.nextInt();
	}
	public abstract float calculateAverage();
}
