package com.hasmapex;

public class QuadraticProbing {
	 int size;
	 int[] table;
	 QuadraticProbing(int size)
	 {
		this.size=size;
		table=new int[size];
	 }
	 void insertEle(int key)
	 {
		 int ind=key%size;
		 int pos;
		 for(int i=0;i<size;i++)
		 {
			 pos=(ind+(i*i))%size;
			 if(table[pos]==0)
			 {
				 table[pos]=key;
				 return;
			 }
				 
		 }
		 System.out.println("table full, can't insert");
	 }
	 
	 void display()
	 {
		 System.out.println("elements");
		 for(int i=0;i<table.length;i++)
		 {
			 if(table[i]!=0)
				 System.out.println(i+"="+table[i]);
		 }
	 }
	public static void main(String[] args) {
		QuadraticProbing ob=new QuadraticProbing(11);
		int[] a= {11,21,33,445,66};
		for(int ele:a)
		{
			ob.insertEle(ele);
			ob.display();
			System.out.println("======================");
		
		}
	}

}
