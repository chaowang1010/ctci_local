// 4.3 Given a sorted (increasing order) array with unique integer elements, write an
// algorithm to create a binary search tree with minimal height.
import CtCILibrary.TreeNode;

public class Question4_3{
	public static TreeNode createBSTminH(int[] num){
		return createBSTminH(num, 0 , num.length - 1);		

	}

	public static TreeNode createBSTminH(int[] num, int start, int end){
		if (start >end) return null;

		int mid = (start + end) / 2;

		TreeNode n = new TreeNode(num[mid]);
		n.setLeftChild(createBSTminH(num, start, mid - 1));
		n.setRightChild(createBSTminH(num, mid + 1, end));

		return n;
	}
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		TreeNode root = createBSTminH(array);
		System.out.println("Root? " + root.data);
		System.out.println("Created BST? " + root.isBST());
		System.out.println("Height: " + root.height());
	}
}