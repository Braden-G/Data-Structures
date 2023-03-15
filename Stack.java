import java.util.LinkedList;

public class Stack<AnyType> {
	private int TOS = -1;
	LinkedList<AnyType> stack = new LinkedList<>();
	public void pop() throws Exception {
		if(TOS == -1){
			throw new Exception("Array is empty");
		}else{
			TOS--;
		}
	}
	
	public AnyType top(){
		if(TOS == -1){
			return null;
		}else{
			return stack.get(TOS);
		}	
	}

	public AnyType topAndPop() {
		int temp = TOS;
		TOS--;
		return stack.get(temp);
	}

	public void push(AnyType a) {
		TOS++;
		stack.add(a);
	}
	
	public boolean isEmpty() {
		if(TOS == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public void makeEmpty() {
		TOS = -1;
	}
	
	
}
