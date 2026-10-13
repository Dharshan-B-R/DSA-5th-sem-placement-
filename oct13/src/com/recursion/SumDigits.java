package com.recursion;

public class SumDigits {
	static int sumD(int n)
	{
	if(n == 1)
	return 1;
	return (n%10)+sumD(n/10);

	}
	public static void main(String[] args) {
		System.out.println("Sum of dig = "+sumD(1234));
	}

}
