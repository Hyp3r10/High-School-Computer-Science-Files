import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets102
{

	public static void main(String[] args)
	{
		//Parsing words from a String to set via an Array and Collection (ArrayList)
		
		String[] words = "memes are dreams".split(" ");
		
		Set<String> set = new TreeSet<String>(Arrays.asList(words));
		System.out.println(set + "\n");
		
		//Print the set using an Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		
		for(String d : set)
			System.out.println(d);
		

	}

}
