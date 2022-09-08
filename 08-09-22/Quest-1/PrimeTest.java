package com.java.unit.unit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeTest {
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	@ParameterizedTest
	@ValueSource(ints= {5,6,10,25})
	void test(int a) {
		for(int i=2;i<a/2;i++) {
			assertFalse(a%i==0);
			
		}
		
	}

}
