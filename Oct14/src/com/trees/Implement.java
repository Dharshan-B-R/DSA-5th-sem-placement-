package com.trees;

public class Implement {

	public static void main(String[] args) {
		int[] a = {11,22,55,4,33,67,8,12};
		BST ob = new BST();
		for(int ele:a)
		ob.root=ob.insertNode(ob.root, ele);

		System.out.println("INORDER");
		ob.inorder(ob.root);
//		System.out.println("PREORDER");
//		ob.preorder(ob.root);
//		System.out.println("POSTORDER");
//		ob.postorder(ob.root);
		
		System.out.println("Deleting 55");
		ob.root=ob.delete(ob.root,55);

		ob.inorder(ob.root);
	}

}
