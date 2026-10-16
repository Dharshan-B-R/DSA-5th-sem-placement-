package com.games;
import java.util.Scanner;
public class Tictactoe {
	static void reset(int[] a)
	{

	for(int i =0;i<a.length;i++)
	a[i]=0;
	}
	static void display(int[] a)
	{
	for(int i =0;i<a.length;i++)
	{

	if(i%3 == 0)
	System.out.println();
	System.out.print(a[i]+"\t");
	}
	
}
	public static void main(String[] args) {
		
		int[] a = new int[9];

		reset(a);
		display(a);
		Scanner sc = new Scanner(System.in);
		int p1=1,p2=2;
		int moves=1;
		int pos;
		while(moves <= 9)
		{

		if(moves%2 == 1)
		{

		System.out.println("\nP1 play");
		do
		{

		System.out.println("Enter pos=");
		pos=sc.nextInt();
		}while(a[pos] != 0);
		a[pos]=p1;
		}
		else
		{
			System.out.println("\nP2 play");
			do
			{

			System.out.println("Enter pos=");
			pos=sc.nextInt();
			}while(a[pos] != 0);
			a[pos]=p2;
		}
		
		display(a);
		moves++;
		
}
}
}
