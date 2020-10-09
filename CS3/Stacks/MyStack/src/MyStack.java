import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	/**
	 * Variable to store the stack-like data structure
	 */
	public Integer[] stack;
	/**
	 * Sores the current size of the stack and is used as an index
	 * variable for remembering the index of the top of the stack
	 */
	public int size;
	/**
	 * Variable to store the list of smallest elements in the stack
	 */
	private Integer[] smallest;
	/**
	 * Variable to store the current size of the smallest stack. Also
	 * used as an index for the top element in the stack.
	 */
	private int smallestSize;
	/**
	 * Default constructor that instantiates the global variables
	 * to be equal to their default values
	 */
	public MyStack() {
		this.stack = new Integer[1];
		this.smallest = new Integer[1];
		this.size = -1;
		this.smallestSize = -1;
	}
	/**
	 * Overloaded constructor that creates a new Stack with 
	 * size of initCap
	 * @param initCap	The size of the new Stack
	 */
	public MyStack(int initCap) {
		this();
		this.stack = new Integer[initCap];
	}
	/**
	 * Returns true if the stack is currently empty
	 * @return	True if the stack is empty
	 */
	public boolean isEmpty() {
		return size == -1 || stack.length == 0 || stack[0] == null;
	}
	/**
	 * Returns the top element without removing that element
	 * Throws an exception is stack.length is equal to 0
	 * @return	The top element of the stack array
	 */
	public Integer peek() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			Integer pop = stack[size];
			return pop;
		}
	}
	/**
	 * Removes the top element and returns the value removed
	 * Throws an exception if stack.length is equal to 0
	 * @return	The top element of the stack array
	 */
	public Integer pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			Integer pop = stack[size];
			this.stack[size] = null;
			this.size--;
			// If the popped item is the smallest item in the stack
			if(this.smallest[this.smallestSize] != null && pop == this.smallest[this.smallestSize]) {
				this.smallest[this.smallestSize] = null;
				this.smallestSize--;
			}
			return pop;
		}
	}
	/**
	 * Pushes an item onto the top of the stack variable.
	 * Calls the doubleCapacity method if the size is needed to be
	 * increased in order to perform the operation.
	 * @param item	The element to push onto the top of the stack
	 */
	public void push(Integer item) {
		// If the stack has no elements or if the top most element is taken
		if(stack.length == 0 || stack[stack.length-1] != null)  {
			doubleCapacity();
		}
		// If the smallest stack has no elements or the top most element is taken
		if(this.smallestSize == -1 || this.smallest[this.smallest.length-1] != null) {
			
			doubleSmallest();
			this.smallestSize++;
		}
		// If the pushing element is smaller than the top of the smallest array
		if(this.smallest[this.smallestSize] == null || item < this.smallest[this.smallestSize]) {
			this.smallestSize++;
			this.smallest[this.smallestSize] = item;
		}
		size++;
		stack[size] = item;
	}
	/**
	 * Finds the smallest item in the stack in constant time of O(1)
	 * Uses the smallest stack object to find this element;
	 * @return	The smallest Integer in the stack at the current time
	 */
	public Integer getMin() {
		return this.smallest[this.smallestSize];
	}
	/**
	 * Doubles the size of the backing array
	 */
	private void doubleCapacity() {
		/*
		 * Integer[] temp = new Integer[(stack.length+1)*2]; for(int i = 0; i <= size;
		 * i++) { temp[i] = stack[i]; } this.stack = temp;
		 */
		this.stack = Arrays.copyOf(this.stack, (this.stack.length+1)*2);
	}
	/**
	 * Doubles the size of the backing array
	 */
	private void doubleSmallest() {
		/*
		 * Integer[] temp = new Integer[(this.smallest.length+1)*2]; for(int i = 0; i <=
		 * this.smallestSize; i++) { temp[i] = this.smallest[i]; } this.smallest = temp;
		 */
		this.smallest = Arrays.copyOf(this.smallest, (this.smallest.length+1)*2);
	}
	/**
	 * Shows the state of the stack (in a stack-like way)
	 */
	@Override
	public String toString() {
		return Arrays.toString(stack);
	}
}
