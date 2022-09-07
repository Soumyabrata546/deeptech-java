package com.java.unit.unit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StuTest {
StudentDetails s1=new StudentDetails();
StudentBusinessLogic su=new StudentBusinessLogic();

	@Test
	void test() {
		s1.setName("Rahul");
		s1.setMarks1(20);
		s1.setMarks2(20);
		s1.setMarks3(20);
		double p=su.calpercentage(s1);
		assertEquals(20,p);
	}

}
