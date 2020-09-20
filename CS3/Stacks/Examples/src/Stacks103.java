import java.util.Stack;

public class Stacks103
{

	public static void main(String[] args)
	{
		// Using peek() and isEmpty()
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("Michael");
		myStack.push("Raymond");
		myStack.push("David");
		myStack.push("Jackson");
		myStack.push("Gabby");
		
		System.out.println(myStack + "\n");
		
		//peek() returns the top object of the stack but does not remove it from the stack
		System.out.println("-* Peeking *-");
		System.out.println(myStack.peek());
		
		System.out.println("\n"+ myStack + "\n");
		
		//isEmpty() returns true if there is nothing in the stack
		System.out.println("-* Popping until (isEmpty() == true) *-");
		while(!myStack.isEmpty()) 
		{
			System.out.println(myStack.pop() + "\t\tEmpty Stack: " + myStack.isEmpty());
		}
		
		//Empty Stack
		System.out.println("\n" + myStack);

	}

}
