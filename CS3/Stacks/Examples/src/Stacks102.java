import java.awt.Color;
import java.util.Stack;

public class Stacks102
{

	public static void main(String[] args)
	{
		// Java 5+ prefers, but does not require, that you specify the type of things on the stack (just like you did with ArrayLists):

		Stack<String> myStack = new Stack<String>();
		//myStack.push(Color.RED); //Error!
		myStack.push("Michael");
		myStack.push("Raymond");
		myStack.push("David");
		myStack.push("Jackson");
		myStack.push("Gabby");
		
		System.out.println("\nPrinting stack with loop:");
		for(int i = 0; i < myStack.size(); i++)
			System.out.println(i+ ". " + myStack.get(i));
		System.out.println();
		
		System.out.println(myStack); //get does not pop from stack.
		
		System.out.println("-*Popping 1 element from top of stack*-\n");
		myStack.pop();
		
		System.out.println("\nPrinting stack with loop:");
		for(int i = 0; i < myStack.size(); i++)
			System.out.println(i+ ". " + myStack.get(i));
		System.out.println();
		
		System.out.println("Popping " + myStack.pop() + " from top of stack");
		System.out.println("Popping " + myStack.pop() + " from top of stack");
		
	
		System.out.println("\nPrinting stack with loop:");
		for(int i = 0; i < myStack.size(); i++)
			System.out.println(i+ ". " + myStack.get(i));
		System.out.println();
	}

}
