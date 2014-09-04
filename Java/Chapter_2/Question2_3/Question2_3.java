// Implement an algorithm to delete a node in the middle of a singly linked list,
// given only access to that node.
// EXAMPLE
// Input: the node c from the linked list a->b->c->d->e
// Result: nothing is returned, but the new linked list looks like a- >b- >d->e

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question2_3{
	public static void deleteMiddleNode(LinkedListNode middleNode){
		if(middleNode == null || middleNode.next == null)
			return;
		middleNode.data = middleNode.next.data;
		middleNode.next = middleNode.next.next;
	}
	public static void main(String[] args){
		LinkedListNode head = AssortedMethods.randomLinkedList(2, 0, 10);
		System.out.println("Orignial list is:  " + head.printForward());
		deleteMiddleNode(head.next); // delete node 4
		System.out.println(head.printForward());
	}
}