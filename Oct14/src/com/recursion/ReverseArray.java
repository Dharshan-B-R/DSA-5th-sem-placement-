package com.recursion;

public class ReverseArray {
static void reverseArray(int[] a, int ind)
{

if(ind>a.length-1-ind)
return;
int temp = a[ind];
a[ind]=a[a.length-1-ind];
a[a.length-1-ind]=temp;
reverseArray(a, ++ind);
}
public static void main(String[] args) {
int[] a = {11,22,33,44,55};
reverseArray(a,0);
System.out.println("reversed array");
for(int ele:a)
System.out.println(ele);
}
}