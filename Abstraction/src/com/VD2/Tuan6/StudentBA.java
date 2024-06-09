package com.VD2.Tuan6;

public class StudentBA extends Student {
	private float scorePm;
	private float scoreBA;
	public StudentBA(){
		super();
		this.scoreBA = (float) 0.0;
		this.scorePm = (float) 0.0;
	}
	public StudentBA(String masv, String name, int age, float scorePm, float scoreBA){
		super(masv, name, age);
		this.scorePm = scorePm;
		this.scoreBA = scoreBA;
	}
	public float getScorePm() {
		return scorePm;
	}
	public void setScorePm(float scorePm) {
		this.scorePm = scorePm;
	}
	public float getScoreBA() {
		return scoreBA;
	}
	public void setScoreBA(float scoreBA) {
		this.scoreBA = scoreBA;
	}
	@Override
	public float calculateAverage() {
		// TODO Auto-generated method stub
		float calculateAverage = (scorePm + scoreBA)/2;
		return 0;
	}
	
}
