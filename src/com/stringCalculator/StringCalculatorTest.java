package com.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void noNumberAddTest() {
		StringCalculator sc = new StringCalculator();
		int result = sc.Add("");
		assertEquals(0,result);
	}
	
	@Test
	public void oneNumberAddTest() {
		StringCalculator sc = new StringCalculator();
		int result = sc.Add("1");
		assertEquals(1,result);
	}
	
	@Test
	public void TwoNumberAddTest() {
		StringCalculator sc = new StringCalculator();
		int result = sc.Add("1,2");
		assertEquals(3,result);
	}
	
	@Test
	public void unknownNumberAddTest() {
		StringCalculator sc = new StringCalculator();
		int result = sc.Add("1,3,4,5,6");
		assertEquals(19,result);
	}
}
