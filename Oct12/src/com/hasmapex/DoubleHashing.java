package com.hasmapex;

public class DoubleHashing {
	
	int size;
	 int[] table;
	 DoubleHashing(int size)
	 {
		this.size=size;
		table=new int[size];
	 }
	 void insertEle(int key)
	 {
		 int hash1=key%size;
		 int hash2=7-(key%7);
		 int pos;
		 for(int i=0;i<size;i++)
		 {
			 pos=(hash1+(i*hash2))%size;
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
		
		
		DoubleHashing ob = new DoubleHashing(11);
		int[] a = {11,2,33,4,56,77};
		for(int ele:a)
		{

		ob.insertEle(ele);
		ob.display();
		}
	}

}
