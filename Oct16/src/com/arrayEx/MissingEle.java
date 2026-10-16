package com.arrayEx;

public class MissingEle {

	public static void main(String[] args) {
		int[] a= {4,1,2,5};
		int n=a.length+1;

		int expected=(n*(n+1))/2;
		int actual=0;
		for(int ele:a)
		actual+=ele;
		System.out.println("Missing ele = "+(expected-actual));
	}

}
