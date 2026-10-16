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
	static int checkWinner(int[] a, int p)
	{
	int[][] win= {{0,1,2},
	{3,4,5},
	{6,7,8},
	{0,3,6},
	{1,4,7},
	{2,5,8},
	{0,4,8},
	{2,4,6}};
	
	
	int x,y,z;
	for(int[] ele :win)
	{
	x=ele[0]; //ele:{0,1,2}
	y=ele[1];
	z=ele[2];
	if(a[x] == p && a[y] == p && a[z] == p)
	return p;
	}
	return -1;
	
}
	
	public static void main(String[] args) {
		
		int[] a = new int[9];

		reset(a);
		display(a);
		Scanner sc = new Scanner(System.in);
		int p1=1,p2=2;
		int moves=1;
		int pos;
		int p;
		while(moves <= 9)
		{

		if(moves%2 == 1)
		{

		System.out.println("\nP1 play");
		do
		{

		System.out.println("Enter pos=");
		pos=sc.nextInt();
		}while(pos<0||pos>=9||a[pos] != 0);
		a[pos]=p1;
		p=p1;
		}
		else
		{
			System.out.println("\nP2 play");
			do
			{

			System.out.println("Enter pos=");
			pos=sc.nextInt();
			}while(pos<0||pos>=9||a[pos] != 0);
			a[pos]=p2;
			p=p2;
		}
		
		display(a);
		if(moves>=5)
		{
			int winner=checkWinner(a,p);
			if(winner !=- 1)
			{
			System.out.println("Winner="+p);
			break;
			}
		}	moves++;
		}
		
	if(moves>9)
		System.out.println("MATCH DRAW");
	}
}