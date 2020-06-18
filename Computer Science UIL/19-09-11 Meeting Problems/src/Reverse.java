import java.util.*;
import java.io.*;

public class Reverse
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(new File("reverse.dat"));
		
		int times = s.nextInt();
		String dum = s.nextLine();
		
		for(int i = 0 ; i < times; i++)
		{
			ArrayList<String> list = new ArrayList<String>();
			
			Scanner s2 = new Scanner(s.nextLine());
			while(s2.hasNext())
			{
				list.add(s2.next());
			}
			Collections.reverse(list);
			
			for(int j = 0; j < list.size();j++)
			{
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
