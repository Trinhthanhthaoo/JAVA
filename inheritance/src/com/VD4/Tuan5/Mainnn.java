package com.VD4.Tuan5;
import java.util.Scanner;
public class Mainnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.setSide(10);
		System.out.println("thong tin " + square.toString());
		System.out.println("Area " +square.getArea());
		System.out.println("Perimeter " + square.getPerimeter());
	}
}
