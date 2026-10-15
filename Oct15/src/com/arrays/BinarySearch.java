package com.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {11,22,33,44,55,66};
		int n=a.length;
		int l=0,h=n-1;
		int m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter key = ");
		int key=s.nextInt();
		while(l <= h)
		{

		m=(l+h)/2;
		if(a[m] == key)
		{
		System.out.println("Found key at = "+m);
		break;
		}
		else if(a[m]<key)
			l=m+1;
			else
			h=m-1;
		}
		if(l>h)
			System.out.println("key not found");

	}

}
