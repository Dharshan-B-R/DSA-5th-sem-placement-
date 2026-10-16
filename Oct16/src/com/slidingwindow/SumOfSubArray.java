package com.slidingwindow;

public class SumOfSubArray {

	public static void main(String[] args) {
		int [] a= {11,22,44,55,66,77,88,99};
		int n=a.length;
		int k=3;
		int sum=0;
		for(int i=0;i<n-k;i++)
		{
			sum=0;
			for(int j=i;j<=i+k;j++)
			{
				sum=sum+a[j];
				System.out.print(a[j]+"+");
			}
			System.out.println("="+sum+"avg="+((float)sum/(float)k));
		}
	}

}
