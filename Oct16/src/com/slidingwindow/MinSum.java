package com.slidingwindow;

public class MinSum {

	public static void main(String[] args) {
		int[] a= {11,22,1,55,3, 77,4,99};
		int n=a.length;
		int k=3;
		int minSum=0;
		int sum;
		for(int i=0;i <= n-k;i++)
		{
		sum=0;
		for(int j=i;j<i+k;j++)
		{
		sum=sum+a[j];

		System.out.print(a[j]+"\t");
		}
		System.out.println("\tSUM="+sum);
		if(i == 0)
		minSum=sum;//first sum cal of 11,22,1,55 will be ma
		else
		{
			if(sum<minSum)
				minSum=sum;
		}

		

		}

		System.out.println(", MIN = "+minSum);
	}

}
