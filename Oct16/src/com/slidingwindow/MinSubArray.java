package com.slidingwindow;

public class MinSubArray {

	public static void main(String[] args) {
		int[] a= {11,22,1,55,3,77,4,99};
		int n=a.length;
		int k=3;
		int min;
		for(int i=0;i <= n-k;i++)
		{

		min=a[i];
		for(int j=i;j<i+k;j++)
		{
		if(a[j]<min)
		min=a[j];
		System.out.print(a[j]+"\t");
		}
		System.out.println(", MIN = "+min);

		}

	}

}
