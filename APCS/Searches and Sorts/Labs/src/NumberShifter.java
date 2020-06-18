import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] nums = new int[size];
		for(int j = 0; j < nums.length; j++) {
			nums[j] = (int) (Math.random()*10 ) +1;
		}
		return nums;
	}
	public static void shiftEm(int[] array)
	{
		System.out.println("Unsorted :: " + Arrays.toString(array));
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 7) {
				for(int j = i; j > 0; j--) {
					swap(j, j-1, array);
				}
			}
		}
		System.out.println("Sorted   :: " + Arrays.toString(array));
	}
	public static void swap(int i , int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}