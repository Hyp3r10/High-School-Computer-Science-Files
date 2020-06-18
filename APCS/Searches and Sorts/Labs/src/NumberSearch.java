import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		Arrays.sort(numArray);
		
		int index=0;
		for(int i = 0; i < numArray.length-1; i++) {
			if(numArray[i] <= searchNum && numArray[i+1] > searchNum) {
				index = i+1;
			}
		}
		return numArray[index];
	}
}