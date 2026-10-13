package com.linkedlist;

public class Node {

	int data;
	Node prev,next;
	
	Node(int ele)  //constructor :parameterized
	{
		data=ele;
		prev=next=null;
	}
}