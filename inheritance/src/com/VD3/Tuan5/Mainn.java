package com.VD3.Tuan5;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.input();
		System.out.println(student1);
		boolean isoldEnough = student1.checkAge(18);
		if(isoldEnough){
			System.out.println("du 18");
		}else{
			System.out.println("chua du 18");
		}
		System.out.println("ten viet hoa : " + student1.getUpperName());
		boolean hasValidStudentId = student1.checkStudentld(); 
		if (hasValidStudentId){
			System.out.println("hs 23IT");
		}else{
			System.out.println("k phai hs 23IT");
		}
	}

}
