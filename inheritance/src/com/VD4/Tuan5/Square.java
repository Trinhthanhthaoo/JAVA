package com.VD4.Tuan5;
import java.util.Scanner;
public class Square extends Rectangle{
	private float side;
	public Square(){
		super();
		this.side = 0.0f;
	}
	public Square(float side, float width, float height){
		super (width, height);
		this.side = side ;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
		super.setHeight(side);
		super.setWidth(side);
	}
	@Override
	public String toString(){
		return "Square [ side = " + side + "]" ;
	}
	@Override
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side");
		this.side = sc.nextFloat();
	}
}
