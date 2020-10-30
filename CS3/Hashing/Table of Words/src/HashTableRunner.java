
import java.io.File;
import java.util.Scanner;

public class HashTableRunner {
	public static void main ( String[] args ) {
		try{
			//make a new table			
			HashTable tester = new HashTable();
			//read from the file			
			Scanner scan = new Scanner(new File("words.dat"));
			//load stuff into the table			
			int numElements = scan.nextInt(); scan.nextLine();
			for(int i = 0; i < numElements; i++) {
				tester.add(new Word(scan.nextLine().trim()));
			} 
			//print out the table
			System.out.println(tester);
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
	}
}