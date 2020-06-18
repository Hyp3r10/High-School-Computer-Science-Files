import java.util.*;
import java.io.*;

public class Pairs
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(new File("pairs.dat"));
		
		int times = s.nextInt();
		String dum = s.nextLine();
		
		for(int i = 0; i < times; i++)
		{
			String line = s.nextLine();
			Scanner s2 = new Scanner(line);
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(s2.hasNextInt())
			{
				list.add(s2.nextInt());
				
			}
			//System.out.println(line);
			
			if(list.size() % 2 == 1)
				list.remove(list.size()-1);
			
			int k = 0;
			while(k < list.size())
			{
				if(list.get(k) > list.get(k+1))
				{
					list.remove(k);
					list.remove(k);
					
				}
				else
					k+=2;
			}
			
			for(int j = 0; j < list.size(); j++)
			{
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
			
		}
	}
}
