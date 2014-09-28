import java.util.Stack;

public class MyQueue<T> {
	Stack<T> stack1,stack2;

	public MyQueue(){
		stack2 = new Stack<T>();
		stack1 = new Stack<T>();
	}

	public void add(T value){
		stack1.push(value);
	}

	public void shiftstacks(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}

	public T pop(){
		shiftstacks();
		return stack2.pop();
	}

	public T peek(){
		shiftstacks();
		return stack2.peek();
	}

	public int size() {
		return stack2.size() + stack1.size();
	}
}