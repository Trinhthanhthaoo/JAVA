package com.VD2.Tuan6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentIT studentIT = new StudentIT();
		StudentBA studentBA = new StudentBA();
		System.out.println("studentIT: " + studentIT.calculateAverage());
		System.out.println("studentBA: " + studentBA.calculateAverage());
	}

}
