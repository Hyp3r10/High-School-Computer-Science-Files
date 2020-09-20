public class StackRunner 
{
	public static void main(String[] args)
	{
		MyStack m = new MyStack();
		
		System.out.println(m.isEmpty() + "\n"); //test with empty stack
		
		try { m.pop(); } catch (Exception e) { System.out.println("Attempting to pop an empty stack works!"); }
		
		m.push(4); m.push(6); m.push(3); m.push(7); //test push() method
		
		System.out.println("\nIn the stack:\n\n" + m); //test toString() method
				
		System.out.print("\n" + m.pop() + " "); //test peek() and pop()
		System.out.print(m.peek() + " "); 
		System.out.print(m.pop() + " ");
		System.out.println(m.peek());
		
		m.push(20); m.push(12); m.push(6);
				
		m.pop(); m.pop(); m.pop();
		
		System.out.println("\n" + m.isEmpty()); //test with non-empty stack
	}
}