import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearchRunner
{
	public static void main( String args[] ) throws IOException
	{
			int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int find1 = 5;
			out.println(Arrays.toString(array1));
			out.println("The next largest value after " + find1 + " is " + NumberSearch.getNextLargest(array1, find1) + "\n");

			//add more case
			int[] array2 = {10, 30, 20, 40, 50, 15};
			int find2 = 12;
			out.println(Arrays.toString(array2));
			out.println("The next largest value after " + find2 + " is " + NumberSearch.getNextLargest(array2, find2) + "\n");

			int[] array3 = {3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65};
			int find3 = 25;
			out.println(Arrays.toString(array3));
			out.println("The next largest value after " + find3 + " is " + NumberSearch.getNextLargest(array3, find3) + "\n");

			int[] array4 = {100, 110, 1000, 25000, 65535};
			int find4 = 32767;
			out.println(Arrays.toString(array4));
			out.println("The next largest value after " + find4 + " is " + NumberSearch.getNextLargest(array4, find4) + "\n");

	}
}


