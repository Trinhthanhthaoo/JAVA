package com.VD2.Tuan5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.input();
		cat2.input();
	System.out.println(cat1);
	System.out.println(cat2);
	System.out.println(cat2.getYearOfBirth());
	if (cat1.equalBreed(cat2)){
		System.out.println("the same");
	}else{
		System.out.println("different");  
	}
	}

}
