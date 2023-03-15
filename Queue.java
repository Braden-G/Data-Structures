import java.util.LinkedList;

public class Queue<AnyType> {
	LinkedList<AnyType> stack = new LinkedList<>();
	
	public void dequeue() {
		stack.removeFirst();
	}
	
	public AnyType getFront() {
		return stack.isEmpty() ? null : stack.getFirst();
	}
	
	public AnyType getFrontAndDequeue() {
		AnyType temp = stack.getFirst();
		stack.removeFirst();
		return temp;
	}
	
	public void enqueue(AnyType t) {
		stack.add(t);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void makeEmpty() {
		stack.clear();
	}

}
