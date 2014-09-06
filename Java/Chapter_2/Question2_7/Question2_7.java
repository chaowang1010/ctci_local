//Implement a function to check if a linked list is a palindrome


import CtCILibrary.LinkedListNode;

import java.util.Stack;

public class Question2_7{
	public static boolean isPalindrome(LinkedListNode head){
		if(head == null) return false;
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(n2 != null && n2.next != null){
			stack.push(n1.data);
			n1 = n1.next;
			n2 = n2.next.next;
		}
		if(n2.next == null) 
			n1 = n1.next; //even number of nodes
		while(n1 != null){
			if(stack.pop() != n1.data) 
				return false;
			n1 = n1.next;
		}
		return true;
	}
	public static void main(String[] args) {
		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}
		
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
		
	}
}
