import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * All exceptions ultimately derive from the Throwable class.
 * The immediate subclasses of Throwable are Error and Exception.
 * Exceptions are IOException and RunTimeException.
 * IOExceptions are used for Exceptions beyond your control (e.g. the disk is full).
 * RunTimeException indicate programmer error (e.g. you tried to write past the end of an array).
 */
public class Exceptions102 {
	/*
	 * IOExceptions are considered "checked exceptions." 
	 * "Checked" refers to the fact that the compiler will check to ensure
	 * that the exception is caught. 
	 * Checked exceptions are not monitored by a try/catch block.
	 * 
	 * You must mark your method to indicate that it throws this exception.
	 */
	public static void readFile1() throws IOException {
		File file = new File("mystery.txt");
		Scanner scan = new Scanner(file);
		
	}
	public static void readFile2() {
		try {
			File file = new File("mystery.txt");
			Scanner scan = new Scanner(file);
		} catch (IOException e) {
			System.out.println("There be no file here matey!");
		}
	}
	
	public static void main(String[] args) throws IOException {
		//readFile1();
		readFile2();
	}
}
