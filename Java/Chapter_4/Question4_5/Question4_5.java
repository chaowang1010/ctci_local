// 4.5 Implement a function to check if a binary tree is a binary search tree.
import CtCILibrary.TreeNode;

public class Question4_5{
	public static Integer last = null;

	public static boolean isBST(TreeNode root){
		if(root == null) return true;

		// Chenck the left 
		if(!isBST(root.left)) return false; 

		// Check the current
		if(last != null && last >= root.data ) return false;
		last = root.data;

		// check the right
		if(!isBST(root.right)) return false;

		return true;
	}

	public static void main(String[] args){
		int[] array = {1, 3, 5, 6, 10, 13, 15, 20};
		TreeNode node = TreeNode.createMinimalBST(array);
		// node.left.data = 5;
		// node.left.right.data = 3;
		System.out.println(isBST(node));
	}
}

