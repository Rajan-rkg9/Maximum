package com.CapG.Maximum;

import java.util.Scanner;

public class FindMaximum {
	public static Float findMaxFloat(Float n1 , Float n2 , Float n3)
	{
		Float max;
		if(n1.compareTo(n2) > 0 &&  n1.compareTo(n3) >  0)
			max = n1;
		else if(n2.compareTo(n3) > 0)
			max = n2;
		else
			max = n3;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three floating numbers:");
		Float n1 = sc.nextFloat() , n2 = sc.nextFloat() , n3 = sc.nextFloat();
		FindMaximum.findMaxFloat(n1, n2, n3);
	}
}
