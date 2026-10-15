package com.arrays;

public class ConcateArray {

	public static void main(String[] args) {
		int[] a = {11,22,33,44, 55};
		int[] b = {66,77,88};

		int size=a.length+b.length;
		int[] c=new int[size];
		for(int i=0;i<size;i++)
		{

		if(i<a.length)
		c[i]=a[i];
		else
		c[i]=b[(i-a.length)];
		}
		System.out.println("Concatenated array =");
		for(int i=0;i<size;i++)
		System.out.println(c[i]);
	}

}
