package com.VD1.Tuan6;
import java.util.Scanner;
public class Triangle extends Shape{
	private float sideA;
	private float sideB;
	private float sideC;
	public Triangle(){
		super();
		this.sideA = (float) 0.0;
		this.sideB = (float) 0.0;
		this.sideC = (float) 0.0;
	}
	public Triangle(String color, float sideA, float sideB, float sideC){
		super (color);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public float getSideA() {
		return sideA;
	}
	public void setSideA(float sideA) {
		this.sideA = sideA;
	}
	public float getSideB() {
		return sideB;
	}
	public void setSideB(float sideB) {
		this.sideB = sideB;
	}
	public float getSideC() {
		return sideC;
	}
	public void setSideC(float sideC) {
		this.sideC = sideC;
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		float area = (sideA + sideB + sideC)/2;
		return area;
	}
	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		float perimeter = sideA + sideB + sideC;
		return perimeter;
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("sideA = ");
		this.sideA = sc.nextFloat();
		System.out.println("sideB = ");
		this.sideB = sc.nextFloat();
		System.out.println("sideC = ");
		this.sideC = sc.nextFloat();
	}
	 @Override
	 public String toString(){
		 return "Triangle [ color = " + super.getColor() + "sideA = " + sideA + "sideB = " + sideB + "sideC = " + sideC + "]";
	 }
}
