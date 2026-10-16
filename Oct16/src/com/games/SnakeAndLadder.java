package com.games;

import java.util.Scanner;

public class SnakeAndLadder {
	static void reset(int[][] a)
	{

	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length; j++)
	{
	a[i][j]=0;

	}
   }
}


	static void display(int[][] a)
	{
	  for(int i=0;i<a.length;i++)
	{
        for(int j=0;j<a[i].length; j++)
 	{
       System.out.print(a[i][j]+"\t");
	}
	     System.out.println();
	}
}
	public static void main(String[] args) {
	    int[][] a = new int[6][6];

	reset(a);
	display(a);
	int cr=0,cc=0;
	int dice;
	Scanner sc = new Scanner(System. in);
	int nr,nc;
	a[cr] [cc]=1;
	System.out.println("===========");
	display(a);
	
	int count=1;
	
	while(true)
	{

	System.out.println("Enter dice = ");
	dice=sc.nextInt();
	nr=cr;
	nc=cc;
	if(count+dice>36)
		System.out.println("you cant move please throw dice again");
		else if(count+dice==36)
		{
			System.out.println("u reached home");
		}
		else
	{
	while(dice>0)
	{
	if(nr%2 == 0) //even rows
	{
		if(nc<5)
		nc++;
		else {
			nr++;
			nc=5;
		}
	}
	else
	{
		if(nc>0)
			nc --;
			else

			{
			nr++;
			nc=0;
	}
	}
	
	
	dice --;
	count++;
	a[cr][cc]=0;
	a[nr][nc]=1;
	cr=nr;
	cc=nc;
	display(a);
	System.out.println("==========");

	}

	}
	}
}
}