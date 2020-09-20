import java.util.Set;
import java.util.TreeSet;

public class Sets101
{
	
	// Set One = [3, 6, 5, 9]
	// Set Two = [7, 9, 1, 6]

	public static void main(String[] args)
	{
		Set<Integer> setOne  = new TreeSet<Integer>();
		setOne.add(3);
		setOne.add(6);
		setOne.add(5);
		setOne.add(9);
		System.out.println("Set One: " + setOne);
		
		Set<Integer> setTwo  = new TreeSet<Integer>();
		setTwo.add(7);
		setTwo.add(9);
		setTwo.add(1);
		setTwo.add(6);
		System.out.println("Set Two: " + setTwo);
		
		// setThree = setOne U setTwo
		
		
		Set<Integer> setThree  = new TreeSet<Integer>();
		setThree.addAll(setOne);
		setThree.addAll(setTwo);
		System.out.println("Set Three (Union): " + setThree); // set union (no repeat)
		
		setThree.clear();
		setThree.addAll(setOne);
		setThree.retainAll(setTwo);
		System.out.println("Set Three (Intersection): " + setThree); // set intersection (common elements)
		
		
		setThree.clear();
		setThree.addAll(setOne);
		setThree.removeAll(setTwo);
		System.out.println("Set Three (Difference): " + setThree); // set difference (common elements removed from setOne)

	}

}
