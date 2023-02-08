

public class LinkedList<AnyType> {
    private Node<AnyType> header;

	public LinkedList( ) {
        header = null;
	}

    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return (header == null ? true : false);
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty( ){
        header = null;
    }


    /**
     * Insert at the front
     * @param x the item to insert.
     */
    public void insertFront( AnyType x ) {
        if(isEmpty()){
            header = new Node<AnyType>(x);
        }else{
            header = new Node<AnyType>(x,header);            
        }
    }


    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public Node<AnyType> find( AnyType x ) {
        if(header == null){
            return null;
        }
        Node<AnyType> current = header;
        while(current!= null){
            if(current.getItem().equals(x)){
                return current;
            }
            current = current.getNextNode();
        }
    	return null;
    }

    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    public void remove( AnyType x ) {
        if(header==null){
            return;
        }else if(header.getItem().equals(x)){
            header = header.getNextNode();
            return;
        }else{ 
            Node<AnyType> current = header;
            while(current.getNextNode() != null){
                if(current.getNextNode().getItem().equals(x)){//doesn't work yet
                    current.setNextNode(current.getNextNode().getNextNode());
                    break;
                }
                current = current.getNextNode();
            }
        }
    }

    /**
     * Return a string representation of the list
     */
    @Override
    public String toString() {
    	if(header == null){
            return null;
        }else{
            return header.toString();
        }
    
    }


    /**
     * Return the size of the list
     * @return
     */
    public static <AnyType> int listSize( LinkedList<AnyType> theList ) {
    	if(theList.header == null){
            return 0;
        }else{
        int size = 1;
        
        Node<AnyType> current = theList.header;
        while(current.getNextNode() != null){
            current = current.getNextNode();
            size++;
            
        }
        return size;
        }
    }

    
    
    
    
    
	//Methods for the Chapter 17 Programming assignment
    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd( AnyType x ) {
        if(header == null){
            header = new Node<AnyType>(x);
        }else{
        Node<AnyType> current = header;
        while(current.getNextNode()!= null){
            current = current.getNextNode();                
            }
            current.setNextNode(new Node<AnyType>(x));
        }
    }
    

    
    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType x) {
		Node<AnyType> previous = null;
        Node<AnyType> current = header;
        Node<AnyType> last = null;

        while(current != null){
            if(current.getItem().equals(x)){
                last = current;
            }
            previous = current;
            current = current.getNextNode();
            }
        
        previous.setNextNode(last.getNextNode());
    


        }
	
	
    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */	
	public void removeAll(AnyType x) {
        Node<AnyType> previous = null;
        Node<AnyType> current = header;
        while(current.getNextNode()!= null){
            previous = current;
            current = current.getNextNode();
            if(current.getItem().equals(x)){
                previous.setNextNode(current.getNextNode());
            }
            
        }
    	
	}
	
    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the first item in the list.
     * 
     */
	public Node<AnyType> previous(AnyType x) {
        Node<AnyType> previous = null;
        Node<AnyType> current = header;
        while (current != null && current.getItem() != x) {
            previous = current;
            current = current.getNextNode();
        }
		return previous;
	}

	/**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     * 
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
	public Node<AnyType> findAndMoveToFront(AnyType x) {
        Node<AnyType> prev = null;
        Node<AnyType> current = header;
        while (current != null && current.getItem() != x) {
            prev = current;
            current = current.getNextNode();
        }
        if (current == null) {
            // Node not found
            return null;
        }
        if (prev != null) {
            prev.setNextNode(current.getNextNode());
            current.setNextNode(header);
            header = current;
        }
        return current;
	}
    

}
