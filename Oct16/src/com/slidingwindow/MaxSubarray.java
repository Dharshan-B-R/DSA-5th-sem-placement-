package com.slidingwindow;

public class MaxSubarray {

	public static void main(String[] args) {
		
		int[] a= {11,22,1,55,3,77,4,99};
		int n=a.length;
		int k=3;
		int max;
		for(int i=1;i <= n-k;i++)
		{
		max=a[i];
		for(int j=i;j<i+k;j++)
		{
		if(a[j]>max)
		max=a[j];
		System.out.print(a[j]+"\t");
		}
		System.out.println(", MAX = "+max);
	}
	}
}
