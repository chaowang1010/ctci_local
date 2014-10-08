// 4.6 Write an algorithm to find the'next'node (i.e., in-order successor) of a given node
// in a binary search tree. You may assume that each node has a link to its parent.

import CtCILibrary.TreeNode;

public class Question4_6{

	public static TreeNode inorderSucc(TreeNode root){
		if(root == null) return null;

		if(root.parent == null || root.right != null){
			return leftMostChild(root.right);
		}else{
			TreeNode q = root;
			TreeNode x = q.parent;
			// Go up until we’re on left instead of right
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}

	public static TreeNode leftMostChild(TreeNode n) {
		if (n == null) {
			return null;
		}
		while (n.left != null) {
			n = n.left; 
		}
		return n; 
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		for (int i = 0; i < array.length; i++) {
			TreeNode node = root.find(array[i]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
		}
	}
}