package com.CapG.Maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaxIntegerNumber_At1stPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Integer a=79, b=34, c=65;
		Integer maxInt=testMax.findMaxInteger(a,b,c);
		assertEquals(a,maxInt);
	}
	
	@Test
	public void givenMaxIntegerNumber_At2ndPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Integer a=10, b=20, c=15;
		Integer maxInt=testMax.findMaxInteger(a,b,c);
		assertEquals(b,maxInt);
	}
	
	@Test
	public void givenMaxIntegerNumber_At3rdPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Integer a=10, b=15, c=20;
		Integer maxInt=testMax.findMaxInteger(a,b,c);
		assertEquals(c,maxInt);
	}

}
