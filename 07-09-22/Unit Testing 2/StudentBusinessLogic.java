package com.java.unit.unit1;

public class StudentBusinessLogic {
double calpercentage(StudentDetails s1) {
	double percen=(s1.getMarks1()+s1.getMarks2()+s1.getMarks3())/300*100;
	return percen;
	
	}
}
