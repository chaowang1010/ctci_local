// Write code to partition a linked list around a value x, such that all nodes less than
// x come before all nodes greater than or equal to x.

import CtCILibrary.LinkedListNode;
public class Question2_4{
	public static LinkedListNode partition(LinkedListNode head, int x){
		if(head == null) return head;

		LinkedListNode lessNodehead =  null;
		LinkedListNode lessNodelast =  null;
		LinkedListNode moreNodehead =  null;
		LinkedListNode moreNodelast =  null;

		while(head != null){
			LinkedListNode current = head.next;
			head.next = null;
			if(head.data < x){
				if(lessNodehead == null){
					lessNodehead = head;
					lessNodelast = head;
				}
				else{
					lessNodelast.next = head;
					lessNodelast = lessNodelast.next;
				}
			}
			else{
				if(moreNodehead == null){
					moreNodehead = head;
					moreNodelast = head;
				}
				else{
					moreNodelast.next = head;
					moreNodelast = moreNodelast.next;
				}

			}
			head = current;
		}
		if(lessNodehead == null)
			return moreNodehead;
		lessNodelast.next = moreNodehead;
		return lessNodehead;
	}
	public static void main(String[] args){
		int x = 0;
		/* Create linked list */
		int[] vals = {1, 3, 7, 5, 2, 9, 4};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		
		// Partition
		LinkedListNode h = partition(head, x);
		
		System.out.println(h.printForward());
	}	
}