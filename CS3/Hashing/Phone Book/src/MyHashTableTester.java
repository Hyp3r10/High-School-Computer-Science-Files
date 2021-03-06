import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyHashTableTester {
	/**
	 * All output will also be stored in the "MyHashTable.out" file as well as the console
	 */
	public static void main(String[] args) throws IOException {
		MyHashTable<Person, PhoneNumber> tester = new MyHashTable<Person, PhoneNumber>();
		Scanner scan = new Scanner(new File("White Pages.txt"));
		while(scan.hasNextLine()) {
			String[] parts = scan.nextLine().split(",");
			Person tempP = new Person(parts[0], parts[1]);
			PhoneNumber tempN = new PhoneNumber(parts[2]);
			tester.put(tempP, tempN);
		}
		System.out.println(tester);
	}
}
