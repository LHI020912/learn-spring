package com.spiring_aop.xml2;

public class Evaluation {
	private int ko;
	private int eng;
	private int math;
	
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void showEvlResult() {
		int total = ko+eng+math;
		double avg = total/3;

		System.out.println("세 과목의 총점: "+total);
		System.out.println("세 과목의 총점: "+avg);
	}
}
