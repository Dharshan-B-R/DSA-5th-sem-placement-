package com.arrays;

public class InsetionSort {

	public static void main(String[] args) {
		int[] a= {11,2,1,33,4,21};
		int i,j,key;
		for(i=1;i<a.length; i++)
		{
		key=a[i];
		j=i-1;
		while(j>=0 && a[j]>key)
		{
		a[j+1]=a[j];
		j --;
	}
		a[j+1]=key;
	}
		System.out.println("Sorted array =");
		for(i=0;i<a. length; i++)
		System.out.println(a[i]);
	}

}
