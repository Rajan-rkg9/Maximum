package com.CapG.Maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaxIntegerNumber_At1stPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=79.0f, b=34.0f, c=65.7f;
		Float maxFloat=testMax.findMaxFloat(a,b,c);
		assertEquals(a,maxFloat);
	}
	
	@Test
	public void givenMaxIntegerNumber_At2ndPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=23.7f, b=120.7f, c=48.4f;
		Float maxFloat=testMax.findMaxFloat(a,b,c);
		assertEquals(b,maxFloat);
	}
	
	@Test
	public void givenMaxIntegerNumber_At3rdPosition_ShouldReturnTheSameNumber() {
		FindMaximum testMax=new FindMaximum();
		Float a=12.8f, b=39.7f, c=120.4f;
		Float maxFloat=testMax.findMaxFloat(a,b,c);
		assertEquals(c,maxFloat);
	}

}
