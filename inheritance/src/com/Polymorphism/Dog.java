package com.Polymorphism;

public class Dog extends Animal{

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("woof!");
	}
	public void greeting(Dog another){
		System.out.println("woooooof!");
	}
}
