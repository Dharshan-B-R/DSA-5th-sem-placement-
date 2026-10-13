package com.recursion;

public class Descendingorder_1 {

	
	static void fun(int n)
	{
	if(n == 0)
	return;
	System.out.println(n);
	fun(n-1);
}
	public static void main(String[] args) {
		fun(5);
	}

}
