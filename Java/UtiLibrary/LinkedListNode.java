package UtiLibrary;

public class LinkedListNode{
	//
	public LinkedListNode prev;
	public LinkedListNode next;
	public LinkedListNode last;

	public int data;

	// Construct
	public LinkedListNode(){

	}

	// Construct with data
	public LinkedListNode(int nodedata, LinkedListNode n, LinkedListNode p){
		data = nodedata;
		setNextNode(n);
		setPrevNode(p);
	}

	// 
	public void setPrevNode(LinkedListNode p){
		prev = p;
		if(p != null && p.next != this)
			p.setNextNode(this);
	}

	public void setNextNode(LinkedListNode n){
		next = n;
		// Do not forget
		if (this == last) {
			last = n;
		}
		if(n.prev != this && n != null)
			n.setPrevNode(this);
	}
}