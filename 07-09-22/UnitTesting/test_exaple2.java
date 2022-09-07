package com.java.unit.unit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_exaple2 {

	@Test
	void test() {
		Max ob=new Max();
		int arr[]= {60,30,70,10};
		int actual=ob.maximum(arr);
		int expected=70;
		assertEquals(expected,actual);
		
	}

}
