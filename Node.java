

class Node<AnyType>
{
	private AnyType Element;
	private Node<AnyType> next;
	
	public Node( ) {
		Element = null;
		next = null;
	}
	
	public Node( AnyType x ) {
		Element = x;
		next = null;
	}

	public Node( AnyType x, Node<AnyType> n ) {
		Element = x;
		next = n;
	}

	public AnyType getItem() {
		return Element;
	}

	public void setItem(AnyType x) {
		Element = x;
	}

	public void setNextNode(Node<AnyType> n) {
		next = n;
	}

	public Node<AnyType> getNextNode(){
		return next;
	}

	@Override
	public String toString() {
		if(next == null){
			return Element.toString();
		}else{
			return Element.toString()+" "+next.toString();
		}
	}
}
