import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class Zeckendorf {
	// A list of the fibonacci numbers needed for the zeckendorf sequence.
	public ArrayList<Integer> fibNumbers;
	
	/**
	 * Constructs a Zeckendorf object and instantiates the 
	 * list for the fibonacci numbers to be stored in.
	 */
	public Zeckendorf() {
		this.fibNumbers = new ArrayList<Integer>();
	}
	/**
	 * @param fileName == String name containing the location of the file 
	 * that we are reading data from
	 * @throws IOException should there be a case of a file not being 
	 * found containing the fileName.
	 * This will act as the main method that calls all helper methods to generate 
	 * a Zeckendorf sequence for each number listed in the file.
	 */
	public void zeck(String fileName) throws IOException {
		Scanner scan = new Scanner(new File(fileName));
		int size = scan.nextInt();
		int[] zeckNumbers = new int[size];
		
		// Instantiate the list of numbers to find the Zeckendorf sequence of
		// Find the highest number in the list and generate a Fibonacci sequence up to that number
		int highestNumber = 0;
		for(int i = 0; i < size; i++) {
			zeckNumbers[i] = scan.nextInt();
			if(zeckNumbers[i] > highestNumber) {
				highestNumber = zeckNumbers[i];
			}
		}
		generateFibNumbers(highestNumber);
		printZeckendorfSequence(zeckNumbers);
		scan.close();
	}
	/**
	 * @param highest == the number that will stop the fibonacci 
	 * sequence as we only need to generate numbers up until 
	 * the highest value from the zeckNumbers list.
	 */
	private void generateFibNumbers(int highest) {
		int previous = 0, next = 1;
		fibNumbers.add(previous);
		fibNumbers.add(next);
		
		// Iterative loop to generate fibonacci numbers up until the highest number
		// Exit once the highest number is less than the greatest fibonacci number generated
		int sum = previous + next;
		while(sum <= highest) {
			sum = previous + next;
			previous = next;
			next = sum;
			fibNumbers.add(sum);
		}
	}
	/**
	 * @param zeckNumbers == the list of numbers that we need to find the 
	 * Zeckendorf sequence of. Will print to the console the number in question 
	 * followed by the numbers needed to satisfy the Zeckendorf sequence.
	 */
	private void printZeckendorfSequence(int[] zeckNumbers) {
		// Loop that cycles trough all of the numbers from the input file
		for(int i = 0; i < zeckNumbers.length; i++) {
			System.out.println(getZeckendorfSequence(zeckNumbers[i]));
		}
	}
	/**
	 * @param currZeck == the number from the list of Zeckendorf numbers 
	 * that we are getting the Zeckendorf sequence of.
	 * @return a String containing the numbers necessary to create the 
	 * Zeckendorf representation of currZeck.
	 */
	private String getZeckendorfSequence(int currZeck) {
		String output = currZeck + " = ";
		boolean first = true;
		for(int i = fibNumbers.size()-1; i >= 0; i--) {
			if(currZeck - fibNumbers.get(i) >= 0) {
				// Only add a '+' if this isn't the first fib number needed to make the sequence.
				if(!first) {
					output += " + ";
				}
				else {
					first = false;
				}
				output += fibNumbers.get(i);
				currZeck -= fibNumbers.get(i);
				if(currZeck == 0) {
					break;
				}
			}
		}
		return output;
	}
}