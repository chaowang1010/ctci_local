// Implement an algorithm to find the kth to last element of a singly linked list.
import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question2_2{
	// This recursive method can only print, it can not return the value or node. 
	// Note: Recursive takes at least O(n) space
	public static int nthToLast1(LinkedListNode head, int n) {
		if (n == 0 || head == null) {
			return 0;
		}
		int k = nthToLast1(head.next, n) + 1;
		if (k == n) {
			System.out.println(n + "th to last node is " + head.data);
		}
		return k;
	}
	// O(n) O(1)
	public static LinkedListNode nthToLast2(LinkedListNode head, int n){
		if(n == 0 || head == null)
			return null;
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		// Move n2 to the (n-1)-th node
		for(int i = 1; i<n; ++i){
			if(n2 != null && n2.next != null)
				n2 = n2.next;
			else return null; // not long enough
		}
		// Move both n1 and n2, until n2 gets to the end of the list
		while(n2.next != null){
			n2 = n2.next;
			n1 = n1.next;
		}
		return n1;

	}

	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 2;
		int n = nthToLast1(head, nth);

		LinkedListNode node = nthToLast2(head, nth);
		if (node != null) {
			System.out.println(nth + "th to last node is " + node.data);
		} else {
			System.out.println("Null.  n is out of bounds.");
		}
	}
}