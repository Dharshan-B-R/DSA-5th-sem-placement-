package com.recursion;

public class StingVowelCont {
	
	static int count(String s, int i) {
		if(i == s.length())
		return 0;
		if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
		return 1+count(s,++i);
		else
		return 0+count(s,++i);
	}
	
	public static void main(String[] args) {
		
		String s="this SEssion is BORING";
		int cnt=count(s.toLowerCase(),0);
		System.out.println("Vowel count - "+cnt);
	}

}
