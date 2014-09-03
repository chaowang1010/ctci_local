// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?

import CtCILibrary.AssortedMethods;
import UtiLibrary.LinkedListNode;

public class Question2_1{
	public static void deleteDup(LinkedListNode head){
		if(head == null) return;

		LinkedListNode current = head;
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){
				if
			}
		}
	}
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		LinkedListNode clone = head.clone();
		deleteDupsA(head);
		System.out.println(head.printForward());
		deleteDupsC(clone);
	}
}