import java.util.*;

// Topic: ArrayList, Comparable
// Reference: AP A 2001 Question 2
// Difficulty: hard

public class Library
{
	public static void main(String[] args)
	{
		BookList library = new BookList();
		
		System.out.println(library);
		System.out.println();
		
	    library.insertOne(new Book("Little House on the Praire", "Wilder", 8, 12));
	    
	    System.out.println(library);
		System.out.println();
	    
	    ArrayList books = new ArrayList();
	    books.add(new Book("The Phantom Tollbooth", "Juster", 9, 12));
	    books.add(new Book("Invisible Man", "Ellison", 15, 99));
	    books.add(new Book("Charlotte's Web", "White", 8, 12));
	    
	    library.insertMany(books);
	    
	    System.out.println(library);
		System.out.println();
	}
}