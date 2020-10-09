import java.util.Stack;
import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	
	private Square[] stack;
	private  int size; //LoGicAL Size
	
	public MyStack()
	{
		size = 0;
		stack = new Square[size];			
	}
	
	public MyStack(int initCap)
	{
		size = initCap;
		stack = new Square[size];
		}
	
	/**
	 * 
	 * @return if size equals zero
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * 
	 * @return the last value in the array
	 */
	public Square peek() 
	{

		return stack[size-1];
	}
	
	/**
	 * 
	 * @return the last value in the array and removes it
	 */
	public Square pop() 
 	{
		
		Square tmp = new Square(0,0,0);
		
			if(isEmpty())
				throw new EmptyStackException();	
			else {

			tmp = stack[size - 1];
			size--;
			}
		
		
		return tmp;
 	}

	/**
	 * pushes a value onto the array and increments the size.
	 * @param item a Square to be added to the array
	 */
	public void push(Square item)
	{		
		size++;
		if(size >= stack.length)
			doubleCapacity();	
		stack[size - 1] = item;
	
	}
	
	/**
	 * double the size of the array
	 */
	private void doubleCapacity()
	{
		if(stack.length == 0)
		{
			Square[] zero = new Square[1];
			stack = zero;
		}
		
		else
		{
		
		Square[] newStack = new Square[size*2];	
		for(int i = 0; i < size-1; i++)
			newStack[i] = stack[i];
		
		stack = newStack;
		}
		
		
		
		
	}
	
	
	@Override
	public String toString()
	{
		// it is possible that the size of the stack is too large and that is why the method isnt working 
		int count = 0;
		for(int i = 0; i < stack.length; i++)
			if(stack[i] != null)
				count++;
		
		Square[] newStack = new Square[count];
		for(int i = 0; i < stack.length; i++)
			if(stack[i] != null)
				newStack[i]= stack[i];

		return Arrays.toString(newStack);
	}
}
