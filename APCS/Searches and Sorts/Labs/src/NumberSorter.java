import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for(int num = number; number > 0; number/=10) {
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int count = 0;
		
		for(int num = number; num > 0; num/=10) {
			sorted[count] = num%10;
			count++;
		}
		
		// Practice Sort == Insertion Sort
		for(int out = 0; out < sorted.length-1; out++) {
			int min = out;
			for(int in = out; in < sorted.length; in++) {
				if(sorted[in] < sorted[min]) {
					min = in;
				}
			}
			if(min != out) {
				int temp = sorted[min];
				sorted[min] = sorted[out];
				sorted[out] = temp;
			}
		}
		
		// Pre-made Sort (Fall Back)
		//fArrays.sort(sorted);
		
		return sorted;
	}
}