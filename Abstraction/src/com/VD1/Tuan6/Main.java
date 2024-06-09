package com.VD1.Tuan6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangel rectangle = new Rectangel("blue", 3,4 );
		Triangle triangle = new Triangle("red", 2, 3, 4);
		System.out.println("rectangle: " + rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		System.out.println("triangle: " + triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}

}
