package com.sapient.service;

public class Student {
	private int stuId;
	private String stuName;
	private double engMark;
	private double mathMark;
	private double sciMark;
	private double langMark;
	private double socialMark;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getEngMark() {
		return engMark;
	}
	public void setEngMark(double engMark) {
		this.engMark = engMark;
	}
	public double getMathMark() {
		return mathMark;
	}
	public void setMathMark(double mathMark) {
		this.mathMark = mathMark;
	}
	public double getSciMark() {
		return sciMark;
	}
	public void setSciMark(double sciMark) {
		this.sciMark = sciMark;
	}
	public double getLangMark() {
		return langMark;
	}
	public void setLangMark(double langMark) {
		this.langMark = langMark;
	}
	public double getSocialMark() {
		return socialMark;
	}
	public void setSocialMark(double socialMark) {
		this.socialMark = socialMark;
	}
	
	public double doAverage(){
		double average = doSum()/5;
		return average;
	}
	
	public double doSum(){
		double total = engMark + langMark + mathMark + sciMark + socialMark;
		return total;
	}
	
	public void display(){
		System.out.println("The Student Name is " + stuName);
		System.out.println("The Student Id is " + stuId);
		System.out.println("The English Mark is " + engMark);
		System.out.println("The Maths Mark is " + mathMark);
		System.out.println("The Language Mark is " + langMark);
		System.out.println("The Science Mark is " + sciMark);
		System.out.println("The Social Mark is " + socialMark);
		System.out.println("The Total is " + doSum());
		System.out.println("The Average is " + doAverage());
	}
}
