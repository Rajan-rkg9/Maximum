package com.CapG.Maximum;

import java.util.*;

public class FindMaximum<T extends Comparable<T>> {
	T n1, n2, n3;
	public FindMaximum(T n1, T n2, T n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public T findMax()
	{
		return FindMaximum.findMax(n1, n2, n3);
	}
	public static <T extends Comparable<T>> T findMax(T n1, T n2, T n3)
	{
		T max;
		if(n1.compareTo(n2) > 0 &&  n1.compareTo(n3) >  0)
			max = n1;
		else if(n2.compareTo(n3) > 0)
			max = n2;
		else
			max = n3;
		printMax(n1, n2, n3, max);
		return max;
	}
	public static <T> void printMax(T n1, T n2, T n3 ,T max) {
		System.out.println("The Maximum among " + n1 + ", " + n2 + ", " +"and " + n3 + " is : " + max  );
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers:");
		Integer In1 = sc.nextInt() , In2 = sc.nextInt() , In3 = sc.nextInt();
		System.out.println("Enter three floating numbers:");
		Float Fn1 = sc.nextFloat() , Fn2 = sc.nextFloat() , Fn3 = sc.nextFloat();
		System.out.println("Enter three Strings:");
		String Sn1 = sc.nextLine() , Sn2 = sc.nextLine() , Sn3 = sc.nextLine();
		new FindMaximum<Integer>(In1, In2, In3).findMax();
		new FindMaximum<Float>(Fn1, Fn2, Fn3).findMax();
		new FindMaximum<String>(Sn1, Sn2, Sn3).findMax();
	}
}
