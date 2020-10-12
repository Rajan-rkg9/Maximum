package com.CapG.Maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenThreeIntegers_At1stPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax = new FindMaximum();
		Integer a = 224, b = 150, c = 17;
		Integer maxInt = testMax.findMax(a, b, c);
		assertEquals(a, maxInt);
	}

	@Test
	public void givenThreeIntegers_At2ndPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax = new FindMaximum();
		Integer a = 101, b = 264, c = 76;
		Integer maxInt = testMax.findMax(a, b, c);
		assertEquals(b, maxInt);
	}

	@Test
	public void givenThreeIntegers_At3rdPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax = new FindMaximum();
		Integer a = 764, b = 87, c = 876;
		Integer maxInt = testMax.findMax(a, b, c);
		assertEquals(c, maxInt);
	}
	@Test
	public void givenThreeFloatingNumbers_At1stPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=79.0f, b=34.0f, c=65.7f;
		Float maxFloat=testMax.findMax(a,b,c);
		assertEquals(a,maxFloat);
	}
	
	@Test
	public void givenThreeFloatingNumbesr_At2ndPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=23.7f, b=120.7f, c=48.4f;
		Float maxFloat=testMax.findMax(a,b,c);
		assertEquals(b,maxFloat);
	}
	
	@Test
	public void givenThreeFloatingNumbers_At3rdPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=12.8f, b=39.7f, c=120.4f;
		Float maxFloat=testMax.findMax(a,b,c);
		assertEquals(c,maxFloat);
	}

	@Test
	public void givenThreeStrings_At1stPosition_ShouldReturnTheSame() {
		FindMaximum testMax = new FindMaximum();
		String a = "Woman", b = "Have", c = "Beauty";
		String maxString = testMax.findMax(a, b, c);
		assertEquals(a, maxString);
	}

	@Test
	public void givenThreeStrings_At2ndPosition_ShouldReturnTheSame() {
		FindMaximum testMax = new FindMaximum();
		String a = "Ear", b = "Xerox", c = "Append";
		String maxString = testMax.findMax(a, b, c);
		assertEquals(b, maxString);
	}
	
	@Test
	public void givenThreeStringsAt3rdPosition_ShouldReturnTheSame() {
		FindMaximum testMax = new FindMaximum();
		String a = "Laptop", b = "Computer", c = "Xbox";
		String maxString = testMax.findMax(a, b, c);
		assertEquals(c, maxString);
	}
}
