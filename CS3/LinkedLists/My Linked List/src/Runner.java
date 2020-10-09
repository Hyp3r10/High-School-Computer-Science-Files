public class Runner
{
	public static void main(String[] args)
	{
		MyLinkedList a = new MyLinkedList();
		MyLinkedList b = new MyLinkedList(20);
		
		System.out.println(a); //test no-parameter constructor and toString() method, should be []
		System.out.println(b); //test parameterized constructor and toString() method, should be [20]
		
		MyLinkedList list = new MyLinkedList();
		list.add(4); list.add(5); list.add(6);
		System.out.println(list); //test one parameter add() method, toString() method, should be [4, 5, 6]
		
		System.out.println(list.contains(3)); //test contains() method, should be false
		System.out.println(list.contains(4)); //test contains() method, should be true
		
		System.out.println(list.indexOf(6)); //test indexOf() method, should be 2
		
		list.add(10);
		System.out.println(list.get(list.size() - 1)); //test get() method, by getting last element in the list, should be 10
		
		list.add(7); list.add(8); list.add(9);
		list.set(100, 4);
		System.out.println(list); //test set() method
		System.out.println(list.size()); //test size method, should be 7
		
		list.remove(1); //test remove() method, removes at index 1, not the first value 1
		System.out.println(list);
		
		list.add(1000, 2); //test two parameter add() method
		System.out.println(list); 
		
		while (!list.isEmpty()) { //test isEmpty() and remove() methods
			System.out.print(list.remove(0) + " "); //should print list in order
		}
		
		System.out.println("\n" + list.size); //test size() method, should be back to 0
	}
}
