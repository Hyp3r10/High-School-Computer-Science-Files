import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 * Given n random integers, print the distinct (unique) integers in sorted order.
 */
public class CompProgProblem4 {
	public static void main(String[] args ) {
		int n = 20;
		int[] array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = (int) (Math.random()*15)+1;
		}
		
		System.out.println("Before: " + Arrays.toString(array) + "\nSize: " + array.length);
		
		array = Arrays.stream(array).distinct().toArray();
		Arrays.sort(array);
		
		System.out.println("After: " + Arrays.toString(array) + "\nSize: " + array.length);
	}
}
