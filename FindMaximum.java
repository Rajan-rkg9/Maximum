package com.CapG.Maximum;

import java.util.*;

public class FindMaximum<T extends Comparable<T>> {
	List<T> inputs;
	public FindMaximum(T... inputs) {
		super();
		this.inputs = Arrays.asList(inputs);
	}
	public T findMax()
	{
		return FindMaximum.findMax(inputs);
	}
	public static <T extends Comparable<T>> T findMax(List<T> inputs)
	{
		T max;
		List<T> sortedList = new ArrayList<>(inputs);
		Collections.sort(sortedList);
		max = sortedList.get(sortedList.size() - 1);
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers:");
		Integer In1 = sc.nextInt() , In2 = sc.nextInt() , In3 = sc.nextInt() ,In4 = sc.nextInt() ,In5 = sc.nextInt();
		System.out.println("Enter  five floating numbers:");
		Float Fn1 = sc.nextFloat() , Fn2 = sc.nextFloat() , Fn3 = sc.nextFloat() , Fn4 = sc.nextFloat() , Fn5 = sc.nextFloat();
		System.out.println("Enter five Strings:");
		String Sn1 = sc.nextLine() , Sn2 = sc.nextLine() , Sn3 = sc.nextLine() , Sn4 = sc.nextLine() , Sn5 = sc.nextLine();
		new FindMaximum<Integer>(In1, In2, In3 , In4 , In5).findMax();
		new FindMaximum<Float>(Fn1, Fn2, Fn3 , Fn4 , Fn5).findMax();
		new FindMaximum<String>(Sn1 , Sn2 ,Sn3 ,Sn4 ,Sn5).findMax();
	}
}
