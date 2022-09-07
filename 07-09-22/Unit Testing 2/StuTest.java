package com.java.unit.unit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StuTest {
StudentDetails s1=new StudentDetails();
StudentBusinessLogic s2=new StudentBusinessLogic();

	@Test
	void test() {
		s1.setName("Rahul");
		s1.setMarks1(100.00);
		s1.setMarks2(100.00);
		s1.setMarks3(100.00);
		double p=s2.calpercentage(s1);
		System.out.print(p);
		assertEquals(100.00,p);
	}

}
