import java.util.*;
import java.io.*;

public class SortNames
{
	// instance variables
	private ArrayList <String> list;
	
	// constructor
	public SortNames()
	{
		list = new ArrayList <String> ();
		
		readFile();
		
		printList();
		
		selectionSort(list);
		
		System.out.println();
		System.out.println("====================");
		System.out.println("    Sorted List");
		System.out.println("====================");
		System.out.println();
		
		printList();
	}
	
	// Sorts the ArrayList using the selection sort algorithm
	void selectionSort(ArrayList<String> objs)
	{
	  int i, j;
	  int min; 
	  String temp;

	  for (i = 0; i < objs.size()-1; i++)
	  {
	    min = i;
	    for (j = i+1; j < objs.size(); j++)
	    {
	      if (objs.get(j).compareTo(objs.get(min)) < 1)
	        min = j;
	    }
	    // swap
	    temp = objs.get(i);
	    objs.set(i, objs.get(min));
	    objs.set(min, temp);
	  }
	}
	public void readFile()
	{
		Scanner scan=null;
		try
		{
		   scan = new Scanner(new File("nameList.txt"));
		}
		catch(IOException ex)
		{
			System.out.println("File not found");
		}
		
		while(scan.hasNextLine())
		{
			String name = scan.nextLine();
			list.add(name);
		}
		
	}
	
	public void printList()
	{
		for(String s: list)
		{
			System.out.println(s);
		}
		System.out.println();
	}
	
	public static void main(String [] args)
	{
		SortNames app = new SortNames();
	}
	
	
}