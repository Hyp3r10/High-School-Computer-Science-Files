public class MyLinkedListGenericRunner
{
	public static void main(String[] args) 
	{
		MyLinkedList<Integer> a = new MyLinkedList<>();
		MyLinkedList<Boolean> b = new MyLinkedList<>(true);
		MyLinkedList<Double>  c = new MyLinkedList<>(3.14159, 1.0, 1.0);
		
		System.out.println(a); //test no-parameter constructor and toString() method, should be []
		System.out.println(b); //test parameterized constructor and toString() method, should be [true]
		System.out.println(c); //var args constructor test
		
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("does"); list.add("this"); list.add("work");
		System.out.println(list); //test one parameter add() method, toString() method, should be [does, this, work]
		System.out.println(list.size()); //test size() method, should be 3
		
		System.out.println(list.indexOf("work")); //test indexOf() method, should be 2
		
		list.add("I've");
		System.out.println(list.get(list.size() - 1)); //test get() method, by getting last element in the list
		
		list.add("absolutely"); list.add("no"); list.add("idea");
		System.out.println(list);
		
		list.set("positively", 4);
		System.out.println(list); //test set() method, absolutely becomes positively
		System.out.println(list.size()); //is size still working? should be 7
		
		list.remove(4); //test remove() method, should remove positively
		System.out.println(list);
		
		list.add("even", 2); //test two parameter add() method
		System.out.println(list); 
		
		while (!list.isEmpty()) { //test isEmpty() and remove() methods
			System.out.print(list.remove(0) + " "); //should print list in order
		}
		
		System.out.println("\n" + list.size()); //test size() method, should be back to 0
	}
}