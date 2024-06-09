package com.VD1.Tuan6;
import java.util.Scanner;
public class Rectangel extends Shape {
	private float width;
	private float height;
	public Rectangel(){
		super();
		this.height = (float) 0.0;
		this.width = (float) 0.0;
	}
	public Rectangel (String color, float width, float height){
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		float area = height * width;
		return area ;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		float perimeter = 2*(height + width);
		return perimeter ;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("height: ");
		this.height = sc.nextFloat();
		System.out.println("width: ");
		this.width = sc.nextFloat();
		
	}
	public String toString(){
		return "Rectangle[color = " + super.getColor() + ",width = " + width + ",height = " + height + "]"; 
	}
	
}
