package com.arrays;

public class AddArray {

	public static void main(String[] args) {
		int[] a = {11,22,33,44,55};
		int[] b = {66,77,88};

		int size=(a.length>b.length)?a.length:b. length;
		int[] c=new int[size];
		int min=(a.length<b.length)?a.length:b.length;
		for(int i=0;i<size;i++)
		{
		if(i<min)
			c[i]=a[i]+b[i];
			else if(i>=min && a.length>min)
			c[i]=a[i];
			else
			c[i]=b[i];
		}
			System.out.println("Added array =");
			for(int i=0;i<size;i++)
			System.out.println(c[i]);

			
	}

}
