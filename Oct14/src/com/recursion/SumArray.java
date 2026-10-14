package com.recursion;

public class SumArray {
	
	static int sum(int[] a ,int ind)
	{
		if(ind == a.length)
			return 0;
			return a[ind]+sum(a,++ind);
			}
	public static void main(String[] args) {
	int[] a = {11,22,33,44,55};
	int res= sum(a,0);
	System.out.println("Sum array = "+sum(a,0));

	}

}
