// You have two numbers represented by a linked list, where each node contains a
// single digit. The digits are stored in reverse order, such that the Ts digit is at the
// head of the list. Write a function that adds the two numbers and returns the sum
// as a linked list.
// EXAMPLE
// Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is, 617 + 295.
// Output: 2 -> 1 -> 9.That is, 912.
// FOLLOW UP
// Suppose the digits are stored in forward order. Repeat the above problem.
// EXAMPLE
// Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295.
// Output: 9 -> 1 -> 2.That is, 912.

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question2_5{
	public static LinkedListNode addLists(LinkedListNode n1, LinkedListNode n2, int carry){
		if(n1 == null && n2 == null && carry == 0) return null;
		int sum = carry;
		LinkedListNode node = new LinkedListNode();
		if (n1!=null)
			sum += n1.data;
		if (n2!=null)
			sum += n2.data;
		node.data = sum % 10;
		carry = (sum >9) ? 1 : 0;
		if(n1 != null || n2 != null){
			LinkedListNode next = addLists( (n1!= null) ? n1.next : null,(n2!= null) ? n2.next : null,carry);
			node.setNext(next);
		}
		return node;
	}
	// public static LinkedListNode addListsForward(LinkedListNode n1, LinkedListNode n2, int carry){

	// }
	public static void main(String[] args) {
		LinkedListNode lA1 = new LinkedListNode(9, null, null);
		LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(9, null, lA2);
		
		LinkedListNode lB1 = new LinkedListNode(1, null, null);
		LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(0, null, lB2);	
		
		int carry = 0;  // true: forward; false: backward.
		LinkedListNode list1 = addLists(lA1, lB1, carry);
		// LinkedListNode list2 = addListsForward(lA1, lB1, carry);
		
		System.out.println("  " + lA1.printForward());		
		System.out.println("+ " + lB1.printForward());	
		System.out.println("= " + list1.printForward());			
		// System.out.println("= " + list2.printForward());

	}
}