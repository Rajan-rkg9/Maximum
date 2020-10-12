package com.CapG.Maximum;

import java.util.Scanner;

public class FindMaximum {
	public static Integer findMaxInteger(Integer n1 , Integer n2 , Integer n3)
	{
		Integer max;
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
		System.out.println("Enter three integers:");
		Integer n1 = sc.nextInt() , n2 = sc.nextInt() , n3 = sc.nextInt();
		FindMaximum.findMaxInteger(n1, n2, n3);
	}
}
