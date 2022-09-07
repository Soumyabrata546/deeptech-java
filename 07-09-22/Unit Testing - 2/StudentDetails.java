package com.java.unit.unit1;
//Create a class having student details like name,marks in 3 subjects and a percentage variable
//create a student business logic which should return the percentage of three subjects
//and then test the business logic using junit

public class StudentDetails {
	private String name;
	private int marks1,marks2,marks3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public double getParcentage() {
		return parcentage;
	}
	
}
