package com.games;

public class SnakeAndLadder {
	static void reset(int[][] a)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=0;
			}
		}
	}
 static void display(int [][] a)
 {
	 for (int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
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

 }
}
