package com.recursion;

public class LinearSearch {
	static boolean linearSearch(int[] a, int i, int key) {
		if(i == a.length)
		return false;
		if(a[i] == key)
		return true;
		return linearSearch(a, ++i, key);
}
	public static void main(String[] args) {
			
		int [] a = {11, 22, 33,44, 55} ;
		int key = 33;
		boolean found=linearSearch(a,0,key);
		if(found == true)
		System.out.println(key +" = is found");
		else
		System.out.println(key +" = not found");
	
	}
	

}
