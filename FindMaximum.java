package com.CapG.Maximum;

import java.util.Scanner;

public class FindMaximum {
	public static String findMaxString(String name1 , String name2 , String name3)
	{
		String max;
		if(name1.compareTo(name2) > 0 &&  name1.compareTo(name3) >  0)
			max = name1;
		else if(name2.compareTo(name3) > 0)
			max = name2;
		else
			max = name3;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Strings:");
		String n1 = sc.nextLine() , n2 = sc.nextLine() , n3 = sc.nextLine();
		FindMaximum.findMaxString(n1, n2, n3);
	}
}
