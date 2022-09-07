package com.java.unit.unit1;

public class StudentBusinessLogic {
double calpercentage(StudentDetails s1) {
	double percen;
	percen=(s1.getMarks1()+s1.getMarks2()+s1.getMarks3())/3;
	s1.setParcentage(percen);
	return percen;
	
	}
}
