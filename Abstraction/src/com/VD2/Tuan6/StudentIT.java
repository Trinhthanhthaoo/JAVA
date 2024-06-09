package com.VD2.Tuan6;
import java.util.Scanner;
public class StudentIT extends Student{
	private float scoreCpp;
	private float scoreJava;
	public StudentIT(){
		super();
		this.scoreCpp = (float) 0.0;
		this.scoreJava = (float) 0.0;
}
	public StudentIT(String name, String masv, int age, float scoreCpp, float scoreJava){
		super(name, masv, age);
		this.scoreCpp = scoreCpp;
		this.scoreJava = scoreJava;
	}
	public float getScoreCpp() {
		return scoreCpp;
	}
	public void setScoreCpp(float scoreCpp) {
		this.scoreCpp = scoreCpp;
	}
	public float getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(float scoreJava) {
		this.scoreJava = scoreJava;
	}
	@Override
	public String toString() {
		return "StudentIT [scoreCpp=" + scoreCpp + ", scoreJava=" + scoreJava
				+ "]";
	}
	@Override
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("scoreCpp: ");
		this.scoreCpp = sc.nextFloat();
		System.out.println("scoreJava: ");
		this.scoreJava = sc.nextFloat();
	}
	@Override
	public float calculateAverage() {
		// TODO Auto-generated method stub
		float calculateAverage = (scoreCpp + scoreJava)/2;
		return 0;
	}
}
