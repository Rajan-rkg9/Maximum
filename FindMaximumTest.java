package com.CapG.Maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenThreeIntegers_At1stPosition_ShouldReturnTheSameNumber() {
		Integer a = 224, b = 150, c = 17;
		FindMaximum<Integer> testMax = new FindMaximum<Integer>(a , b , c);
		Integer maxInt = (Integer)testMax.findMax();
		assertEquals(a, maxInt);
	}

	@Test
	public void givenThreeIntegers_At2ndPosition_ShouldReturnTheSameNumber() {
		Integer a = 101, b = 264, c = 76;
		FindMaximum<Integer> testMax = new FindMaximum<Integer>(a , b , c);
		Integer maxInt = (Integer)testMax.findMax();
		assertEquals(b, maxInt);
	}

	@Test
	public void givenThreeIntegers_At3rdPosition_ShouldReturnTheSameNumber() {
		Integer a = 764, b = 87, c = 876;
		FindMaximum<Integer> testMax = new FindMaximum<Integer>(a, b, c);
		Integer maxInt = (Integer)testMax.findMax();
		assertEquals(c, maxInt);
	}
	@Test
	public void givenThreeFloatingNumbers_At1stPosition_ShouldReturnTheSameNumber() {
		Float a=79.0f, b=34.0f, c=65.7f;
		FindMaximum<Float> testMax=new FindMaximum<Float>(a , b , c);
		Float maxFloat=(Float)testMax.findMax();
		assertEquals(a,maxFloat);
	}
	
	@Test
	public void givenThreeFloatingNumbesr_At2ndPosition_ShouldReturnTheSameNumber() {
		Float a=23.7f, b=120.7f, c=48.4f;
		FindMaximum<Float> testMax=new FindMaximum<Float>(a , b , c);
		Float maxFloat=(Float)testMax.findMax();
		assertEquals(b,maxFloat);
	}
	
	@Test
	public void givenThreeFloatingNumbers_At3rdPosition_ShouldReturnTheSameNumber() {
		Float a=12.8f, b=39.7f, c=120.4f;
		FindMaximum<Float> testMax=new FindMaximum<Float>(a , b , c);
		Float maxFloat=(Float)testMax.findMax();
		assertEquals(c,maxFloat);
	}

	@Test
	public void givenThreeStrings_At1stPosition_ShouldReturnTheSame() {
		String a = "Woman", b = "Have", c = "Beauty";
		FindMaximum<String> testMax = new FindMaximum<String>(a , b , c);
		String maxString =(String)testMax.findMax();
		assertEquals(a, maxString);
	}

	@Test
	public void givenThreeStrings_At2ndPosition_ShouldReturnTheSame() {
		String a = "Ear", b = "Xerox", c = "Append";
		FindMaximum<String> testMax = new FindMaximum<String>(a , b , c);
		String maxString = (String)testMax.findMax();
		assertEquals(b, maxString);
	}
	
	@Test
	public void givenThreeStrings_At3rdPosition_ShouldReturnTheSame() {
		String a = "Laptop", b = "Computer", c = "Xbox";
		FindMaximum<String> testMax = new FindMaximum<String>(a , b , c);
		String maxString = (String)testMax.findMax();
		assertEquals(c, maxString);
	}
	
	@Test
	public void givenMultipleIntegers_WithMaxIntegerNumber_At1stPosition_ShouldReturnTheSameNumber() {
		Integer a = 256, b = 104, c = 13, d = 75, e = 87, f = 23;
		FindMaximum<Integer> testMax = new FindMaximum<Integer>(a, b, c, d, e, f);
		Integer maxInt = testMax.findMax();
		assertEquals(a, maxInt);
	}

	@Test
	public void givenMultipleFloatingNumbers_WithMaxFloatNumber_At2ndPosition_ShouldReturnTheSameNumber() {
		Float a = 24.5f, b = 101.0f, c = 13.5f, d = 28.0f, e = 13.8f, f = 22.3f;
		FindMaximum<Float> testMax = new FindMaximum<Float>(a, b, c, d, e, f);
		Float maxFloat = testMax.findMax();
		assertEquals(b, maxFloat);
	}

	@Test
	public void givenMultipleStrings_WithMaxString_At4thPosition_ShouldReturnTheSameString() {
		String a = "Peach", b = "Banana", c = "Apple", d = "Zebra", e = "Guava", f = "Orange";
		FindMaximum<String> testMax = new FindMaximum<String>(a, b, c, d, e, f);
		String maxString = testMax.findMax();
		assertEquals(d, maxString);
	}
}
