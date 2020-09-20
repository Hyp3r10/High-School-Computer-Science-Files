import java.util.*;

public class Iterators102
{

	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>();

		//ArrayList fill 10 Integers [1..10]
		for (int i = 0; i < 10; i++)
		{
			list1.add((int) (Math.random() * 10) + 1);

		}
		
		System.out.println("ArrayList");
		for(Iterator<Integer> i = list1.iterator(); i.hasNext(); /*yup this empty*/ )
		{
			System.out.print(i.next() + " ");
		}
			

	}

}
