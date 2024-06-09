package com.VD4.Tuan5;
import java.util.Scanner;
public class Rectangle {
	private float width;
	private float height;
	public Rectangle(){
		this.height = 0.0f;
		this.width = 0.0f;
	}
	public Rectangle(float width, float height){
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
	public String toString(){
		return "Rectangle [ height = " + height + ",width = " + width + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter width = ");
		this.width = sc.nextFloat();
		System.out.println("enter height = ");
		this.height = sc.nextFloat();
	}
	public float getArea(){
		return width * height;
	}
	public float getPerimeter(){
		return 2 * (width + height);
	}
}
