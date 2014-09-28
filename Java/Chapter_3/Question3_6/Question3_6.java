// 3.6
// Write a program to sort a stack in ascending order (with biggest items on top).
// You may use at most one additional stack to hold items, but you may not copy
// the elements into any other data structure (such as an array). The stack supports
// the following operations: push, pop, peek, and isEmpty.

import java.util.Stack;

import CtCILibrary.AssortedMethods;


public class Question3_6{
	public static Stack<Integer> sortStack(Stack<Integer> st){
		Stack<Integer> st1 = new Stack<Integer>();
		while(!st.isEmpty()){
			int min = st.pop();
			while(!st1.isEmpty() && min < st1.peek()){
				st.push(st1.pop());
			}
			st1.push(min);
		}
		return st1;
	}
	public static void main(String[] args){
		// for (int k = 1; k < 100; k++) {
			Stack<Integer> s = new Stack<Integer>();
			for (int i = 0; i < 10; i++) {
				int r = AssortedMethods.randomIntInRange(0,  1000);
				s.push(r);
				System.out.println(r);
			}
			s = sortStack(s);
			System.out.println("The sorted stack is :");
			while(!s.isEmpty()) {
				System.out.println(s.pop());
			}
		//}
	}
}