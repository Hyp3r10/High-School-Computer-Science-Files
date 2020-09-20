import java.util.*;

public class Iterators101
{

	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Double> list2 = new LinkedList<Double>();
		Set<Integer> list3 = new HashSet<Integer>();
		Set<Double> list4 = new TreeSet<Double>();
		
		//ArrayList fill 10 Integers [1..10]
		for (int i = 0; i < 10; i++)
		{
			list1.add((int) (Math.random() * 10) + 1);

		}
		
		//LinkedList fill 10 Doubles [0.0 .. 0.99]
		for (int i = 0; i < 10; i++)
		{
			list2.add((int) (Math.random() * 100) / 100.00);
		}
		
		// HashSet fill 10 Integers [2..12] (As long as there are no duplicates)
		for (int i = 0; i < 10; i++)
		{
			list3.add((int) (Math.random() * 11) + 2);

		}

		// TreeSet fill 10 Doubles [1.0 .. 1.99] (As long as there are no duplicates)
		for (int i = 0; i < 10; i++)
		{
			list4.add(((int) (Math.random() * 100) / 100.00) + 1);
		}
		
		Iterator<Integer> here1 = list1.iterator(); //ArrayList Iterator
		Iterator<Double> here2 = list2.iterator(); //LinkedList Iterator
		Iterator<Integer> here3 = list3.iterator(); //HashSet Iterator
		Iterator<Double> here4 = list4.iterator(); //TreeSet Iterator
		
		System.out.println("ArrayList:");
		while(here1.hasNext())
		{
			System.out.print(here1.next() + " ");
		}
		
		System.out.println("\n\nLinkedList:");
		while(here2.hasNext())
		{
			System.out.print(here2.next() + " ");
		}
		
		System.out.println("\n\nHashSet:");
		while(here3.hasNext())
		{
			System.out.print(here3.next() + " ");
		}
		
		System.out.println("\n\nTreeSet:");
		while(here4.hasNext())
		{
			System.out.print(here4.next() + " ");
		}
		

	}

}
