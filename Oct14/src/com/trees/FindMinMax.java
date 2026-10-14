package com.trees;

public class FindMinMax {

	static int findMin(Node root) throws Exception
	{
	if(root == null)
	throw new Exception("No elements");
	while(root.left != null)
	root=root.left;
	return root.data;
	}
	static int findMax(Node root) throws Exception
	{
		if(root == null)
			throw new Exception("No elements");
			while(root.right != null)
			root=root.right;
			return root.data;

	}
	public static void main(String[] args) {
		int[] a = {11,22,55,4,33,67,8,12};
		BST ob = new BST();
		for(int ele:a)
		ob.root=ob.insertNode(ob.root, ele);

		ob.root=null;
		System.out.println("All elements =");
		ob.inorder(ob.root);

		try {
		System.out.println("Min = "+findMin(ob.root));
		System.out.println("Max = "+findMax(ob.root));
		} catch (Exception e) {
		System.out.println("Exception  "+e.getMessage());
	}

	}}
}


