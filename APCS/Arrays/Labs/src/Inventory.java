import java.util.*;

public class Inventory {
    // instance variables
    private Book[] books;     // declare array variable
    private int numBooks;     // logical size of array
    // constructor
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }

    /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks() {
        Scanner keyboard = new Scanner(System.in);
        books = new Book[20];
        int len = books.length;
        String response = "";
        
        System.out.println("************************");
        System.out.println("*       addBooks       *");
        System.out.println("************************");  
        
        do {
        	System.out.print("Student Name --> ");
        	String name = keyboard.nextLine();
        	System.out.print("Book Number --> ");
        	String number = keyboard.nextLine();
        	
        	books[numBooks] = new Book(name, number);
        	
        	numBooks++;
        	
        	System.out.print("\nEnter another book? <y/n> :: ");
        	response = keyboard.nextLine();
        	
        	System.out.println();
        } while(numBooks < len && response.equalsIgnoreCase("y"));
        keyboard.close();
    }

    /* This method displays the student name and book number for each 
     * Book in the array.
     */
    public void printBooks() {
    	System.out.println("************************");
        System.out.println("*      printBooks      *");
        System.out.println("************************");
        
        for(int i = 0; i < numBooks; i++) {
    		System.out.println(books[i] + "\n");
    	}
    }

    public static void main(String[] args) {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
}