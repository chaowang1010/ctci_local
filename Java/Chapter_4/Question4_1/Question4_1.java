// 4.1 Implement a function to check if a binary tree is balanced. For the purposes of
// this question, a balanced tree is defined to be a tree such that the heights of the
// two subtrees of any node never differ by more than one.

import CtCILibrary.TreeNode;

import CtCILibrary.AssortedMethods;

public class Question4_1{
	public static boolean isBalanced(TreeNode root){
		if (root == null) return true;

		int diff = getHeight(root.left) - getHeight(root.right);

		if (Math.abs(diff) > 1) return false;
		else 
			return isBalanced(root.left) && isBalanced(root.right);
	}

	

	public static int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		return (getHeight(root.left) >= getHeight(root.right) ? getHeight(root.left) : getHeight(root.right) ) + 1;
	}


	public static void main(String[] args){
		// Create balanced tree
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Is balanced? " + isBalanced(root));
		
		// Could be balanced, actually, but it's very unlikely...
		TreeNode unbalanced = new TreeNode(10);
		for (int i = 0; i < 10; i++) {
			unbalanced.insertInOrder(AssortedMethods.randomIntInRange(0, 100));
		}
		System.out.println("Root? " + unbalanced.data);
		System.out.println("Is balanced? " + isBalanced(unbalanced));
	}
}