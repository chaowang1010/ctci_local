// Given a circular linked list, implement an algorithm which returns the node at
// the beginning of the loop.
// DEFINITION
// Circular linked list: A (corrupt) linked list in which a node's next pointer points
// to an earlier node, so as to make a loop in the linked list.
// EXAMPLE
// Input: A - > B - > C - > D - > E - > C [the same C as earlier]
// Output: C

// finding the node and finding if the loop exits are totally different.

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question2_6{
	public static LinkedListNode findLoopHead(LinkedListNode head){
		if(head == null) return null;
		LinkedListNode n1 = head; 
		LinkedListNode n2 = head; 

		while( n2 != null && n2.next != null){
			n1 = n1.next;
			n2 = n2.next.next;
			if(n1 == n2)
				break;
		}
		if(n2 == null || n2.next ==null) return null; 

		n1 = head;
		while(n1 != n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		return n1;
	}
	public static void main(String[] args) {
		int list_length = 10;
		int k = 8;  // k = [1,10] 
		
		// Create linked list
		LinkedListNode[] nodes = new LinkedListNode[list_length];
		for (int i = 0; i < list_length; i++) {
			nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
		}
		
		// Create loop;
		nodes[list_length - 1].next = nodes[list_length - k];
		
		// System.out.println(nodes[0] .printForward());	 

		LinkedListNode loophead = findLoopHead(nodes[0]);
		if (loophead == null) {
			System.out.println("No Cycle.");
		} else {
			System.out.println(loophead.data);
		}
	}
}