package com.trees;

public class BST {
	Node root;
	BST()
	{
	root=null;
	}
	Node insertNode(Node root,int ele)
	{
	if(root == null)
	return new Node(ele);
	if(ele<root.data)
	root.left=insertNode(root.left,ele);
	else
	root.right=insertNode(root.right,ele);
	return root;

	}
	void inorder(Node root)
	{

		if(root != null)
		{

	inorder(root.left);
	System.out.println(root.data);
	inorder(root.right);
		}
	}

	void preorder(Node root)
	{
		if(root != null)
		{
	System.out.println(root.data);
	preorder(root.left);
	preorder(root.right);
		}
	}
	
	void postorder(Node root)
	{
	if(root != null)
	{

	postorder(root.left);
	postorder(root.right);
	System.out.println(root.data);
	}
	}
	
	Node findMin(Node root)
	{
	while(root.left != null)
	root=root.left;
	return root;
	}
	

	Node delete(Node root, int ele)
	{
	if(root == null)
	return null;

	if (ele<root.data)
	root.left=delete(root.left,ele);

	else if(ele>root.data)
	root.right=delete(root.right,ele);
	else
	{
		//leaf node
		if(root.left == null && root.right == null)
		return null;
		//if the node has only left child
		else if(root.right == null)
		return root. left;
		//if the node has only right child
		else if(root.left == null)
		return root.right;
		else
		{
		//if the node has both left and right child
		Node min=findMin(root.right);
		root.data=min.data;
		root.right=delete(root.right,min.data);

		}

	}return root;
	}
}
