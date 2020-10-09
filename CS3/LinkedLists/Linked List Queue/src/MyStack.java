import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack implements StackADT {
	/**
	 * Variable to store the stack-like data structure
	 */
	public Square[] stack;
	/**
	 * Sores the current size of the stack and is used as an index
	 * variable for remembering the index of the top of the stack
	 */
	public int size;
	/**
	 * Default constructor that instantiates the global variables
	 * to be equal to their default values
	 */
	public MyStack() {
		this.stack = new Square[1];
		this.size = -1;
	}
	/**
	 * Overloaded constructor that creates a new Stack with 
	 * size of initCap
	 * @param initCap	The size of the new Stack
	 */
	public MyStack(int initCap) {
		this();
		this.stack = new Square[initCap];
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
	public Square peek() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			Square pop = stack[size];
			return pop;
		}
	}
	/**
	 * Removes the top element and returns the value removed
	 * Throws an exception if stack.length is equal to 0
	 * @return	The top element of the stack array
	 */
	public Square pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			Square pop = stack[size];
			this.stack[size] = null;
			this.size--;
			return pop;
		}
	}
	/**
	 * Pushes an item onto the top of the stack variable.
	 * Calls the doubleCapacity method if the size is needed to be
	 * increased in order to perform the operation.
	 * @param item	The element to push onto the top of the stack
	 */
	public void push(Square item) {
		// If the stack has no elements or if the top most element is taken
		if(stack.length == 0 || stack[stack.length-1] != null)  {
			doubleCapacity();
		}
		size++;
		stack[size] = item;
	}
	/**
	 * Doubles the size of the backing array
	 */
	private void doubleCapacity() {
		this.stack = Arrays.copyOf(this.stack, (this.stack.length+1)*2);
	}
	/**
	 * Shows the state of the stack (in a stack-like way)
	 */
	@Override
	public String toString() {
		return Arrays.toString(stack);
	}
	@Override
	public int size() {
		return this.size;
	}
	@Override
	public void clear() {
		this.stack = new Square[1];
		this.size = -1;
	}
}
