package com.VD3.Tuan5;
import java.util.Scanner;
public class Student extends Person {
	private String studentld;
	private String nameSchool;
	private String studentid;
	public Student(){
		super();
		this.studentld = "";
		this.nameSchool = "";
	}
	public Student(String name, String address, int age, String studentld, String nameSchool){
		super(name, age, address);
		this.nameSchool = nameSchool;
		this.studentld = studentld;
	}
	public String toString(){
		return "Student [ name = " + super.getName() + ", age = " + super.getAge() + ",address = " + super.getAddress() + ",studentld = " + studentld + ",nameSchool = " + nameSchool + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Studentld = ");
		this.studentld = sc.nextLine();
		System.out.println("NameSchool = ");
		this.nameSchool = sc.nextLine();
	}
	public String getStudentld() {
		return studentld;
	}
	public void setStudentld(String studentld) {
		this.studentld = studentld;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	public Student(String studentid){
		this.studentid = studentid;
	}
	public boolean checkStudentld(){
		return studentid.startsWith("23IT");
	}
	
}
