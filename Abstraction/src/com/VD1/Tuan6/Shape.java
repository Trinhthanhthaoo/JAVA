package com.VD1.Tuan6;

public abstract class Shape {
	private String color;
	public Shape(){
		this.color = "";
	}
	public Shape(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract float getArea();
    public abstract float getPerimeter();
    public abstract void input();
    @Override
    public String toString(){
    	return "Shape[color " + color + "]";
    }
}
