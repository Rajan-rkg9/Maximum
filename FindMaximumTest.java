package com.CapG.Maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenThreeStrings_At1stPosition_ShouldReturnTheSame() {
		FindMaximum testMax=new FindMaximum();
		String a="Zebra", b="Pour", c="Eggs";
		String maxString=testMax.findMaxString(a,b,c);
		assertEquals(a,maxString);
	}
	
	@Test
	public void givenThreeStrings_At2ndPosition_ShouldReturnTheSame() {
		FindMaximum testMax=new FindMaximum();
		String a="Grapes", b="Zebra", c="Cinema";
		String maxString=testMax.findMaxString(a,b,c);
		assertEquals(b,maxString);
	}
	
	@Test
	public void givenThreeStrings_At3rdPosition_ShouldReturnTheSame() {
		FindMaximum testMax=new FindMaximum();
		String a="Apple", b="Bat", c="Zebra";
		String maxString=testMax.findMaxString(a,b,c);
		assertEquals(c,maxString);
	}

}
