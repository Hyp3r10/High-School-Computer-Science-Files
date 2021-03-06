
public class MyLinkedList<T> {
	/**
	 * A reference to the first element in the list
	 */
	public ListNode<T> head;
	/**
	 * A reference to the last element in the list
	 */
	public ListNode<T> tail;
	/**
	 * Stores the size of the LinkedList
	 */
	public int size;
	/**
	 *	A private class that handles the nodes for the list structure
	 */
	@SuppressWarnings("hiding")
	private class ListNode<T> {
		T val; //does a private inner class need private instance variables?
		ListNode<T> next;
		public ListNode(T val) { this.val = val; }
		@Override
		public String toString() { return "" + this.val.toString(); } //for printing / debug
	}
	/**
	 * Default constructor that sets head to null
	 */
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	/**
	 * Overloaded constructor that sets the head to be equal to the 
	 * passed value of val and sets the next node to be equal to null
	 * @param val	The starting value to go into the head element
	 */
	public MyLinkedList(T val) {
		this.head = new ListNode<T>(val);
		this.head.next = null;
		this.tail = this.head;
		this.size = 1;
	}
	/**
	 * Iterates through the passed set of variables and adds them to the
	 * LinkedList-like object.
	 * @param vals	The list of values to add to the LinkedList
	 */
	@SafeVarargs
	public MyLinkedList(T...vals) {
		ListNode<T> curr = new ListNode<T>(vals[0]);
		this.head = curr;
		this.size = vals.length;
		for(int i = 1; i < this.size; ++i) {
			curr.next = new ListNode<T>(vals[i]);
			curr = curr.next;
		}
		curr.next = null;
		this.tail = curr;
	}
	/**
	 * Sets the deepest next ListNode to be equal to newVal
	 * @param newVal	The item being appended to the LinkedList
	 */
	public void add(T newVal) {
		this.size++;
		ListNode<T> temp = this.head;
		if(temp == null) {
			this.head = new ListNode<T>(newVal);
			this.head.next = null;
			this.tail = this.head;
		} 
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			ListNode<T> newNode = new ListNode<T>(newVal);
			temp.next = newNode;
			this.tail = newNode;
		}
	}
	/**
	 * Iterates trough the list and checks to see if target is 
	 * contained within the list of elements
	 * @param target	The Item we are searching for
	 * @return			Whether or not target was found
	 */
	public boolean contains(T target) {
		ListNode<T> temp = this.head;
		while(temp.next != null) {
			if(temp.val == target) {
				return true;
			}
			temp = temp.next;
		}	
		return false;
	}
	/**
	 * Iterates through the list index number of positions and returns
	 * the value at the index'th position
	 * @param index	The index that we are searching for
	 * @return		The value at index
	 * @throws IndexOutOfBoundsException	Throws if the index specified is too big or too small 
	 */
	public T get(int index) throws IndexOutOfBoundsException {
		// If the index is negative or less than or equal to the size
		if(index < 0 || this.size() <= index) {
			throw new IndexOutOfBoundsException();
		}
		else {
			ListNode<T> temp = this.head;
			T value = this.head.val;
			while(index != -1) {
				index--;
				value = temp.val;
				temp = temp.next;
			}
			return value;
		}
	}
	/**
	 * Iterates through the list searching for the value target
	 * If the value of target does not exist, it returns -1
	 * @param target	The value that we are searching for
	 * @return			The index that value can be found at
	 */
	public int indexOf(T target) {
		ListNode<T> temp = this.head;
		int index = 0;
		do {
			T val = temp.val;
			if(val == target) {
				return index; 
			}
			else {
				index++;
				temp = temp.next;
			}
		} while(temp != null);
		return -1;
	}
	/**
	 * Iterates through the list index number of positions and 
	 * sets the value to be equal to newVal
	 * @param newVal	The new value to set the value at index equal to 
	 * @param index		The index to set the new value equal to
	 * @throws IndexOutOfBoundsException	Throws if the index specified is too big or too small 
	 */
	public void set(T newVal, int index) throws IndexOutOfBoundsException {
		boolean isLastElement = index == this.size-1;
		// If the index is negative or less than or equal to the size
		if(index < 0 || this.size() <= index) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<T> temp = this.head;
		while(index != 0) {
			index--;
			temp = temp.next;
		}
		temp.val = newVal;
		if(isLastElement) {
			this.tail = temp;
		}
	}
	/**
	 * Calculates and returns the size of the LinkedList
	 * @return	The size of the LinkedList
	 */
	public int size() {
		return this.sizeRecursive(this.head);
	}
	/**
	 * Recursively calls itself and tests to see if the next element is the end.
	 * @return	0 if the next element is null or 1 if it is something else
	 */
	public int sizeRecursive(ListNode<T> curr) {
		return curr == null ? 0 : sizeRecursive(curr.next) + 1;
	}
	/**
	 * The state of the LinkedList in reference to being empty
	 * @return	True if the size of the LinkedList is 0
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	/**
	 * Iterates through the List Of ListNodes and stops when we have 
	 * reached the desired value and then changes the references to 
	 * the ListNode path to be to the removed element's next element
	 * @param index	The index that we are removing from the list
	 * @return		The value at the index that we are removing
	 */
	public T remove(int index) {
		boolean isLastElement = index == this.size-1;
		this.size--;
		// Used for returning the specified element
		T val = this.get(index);
		// If we are removing the first index, change the link in header
		if(index == 0) {
			this.head = this.head.next;
		}
		// Else, find the predecessor and change its link
		else {
			// Store the current node
			ListNode<T> pred = this.head;
			ListNode<T> succ = pred.next;
			while(index != 1) {
				index--;
				succ = succ.next;
				pred = pred.next;
			}
			pred.next = succ.next;
			if(isLastElement) {
				this.tail = pred.next;
			}
		}
		return val;
	}
	/**
	 * Iterates through the LinkedList searching for the specified
	 * index and inserts in a new ListNode object in between the
	 * successor and the predecessor of the original element at 
	 * index. Has a special case if we are inserting at the first 
	 * element of the LinkedList.
	 * @param newVal	The value to insert at index
	 * @param index		The index to insert value into
	 */
	public void add(T newVal, int index) {
		this.size++;
		// If we are adding to the first index, change the link in header
		if(index == 0) {
			ListNode<T> temp = this.head;
			this.head = new ListNode<T>(newVal);
			this.head.next = temp;
		}
		// Else, find the predecessor and change its link
		else {
			// Store the current node
			ListNode<T> pred = this.head;
			ListNode<T> succ = pred.next;
			while(index != 1) {
				index--;
				succ = succ.next;
				pred = pred.next;
			}
			ListNode<T> temp = new ListNode<T>(newVal);
			temp.next = succ;
			pred.next = temp;
		}
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if(this.size() == 0) {
			output.append("[]");
		}
		else {
			output.append("[");
			ListNode<T> curr = this.head;
			while(curr != null) {
				output.append(curr.toString() + ", ");
				curr = curr.next;
			}
			output.setCharAt(output.length()-2, ']');
			output.deleteCharAt(output.length()-1);

		}
		return output.toString();
	}
} 
