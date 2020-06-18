import java.util.Arrays;

public class InsertionSort101 {
	public static void main(String[] args) {
		// Insertion sort with primitives
		int[] nums = new int[10];
		
		// Fill the array with random ints from 3..21 inclusive
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()* 19 ) + 3;
		}
		
		// Print out the unsorted Array 
		System.out.println("Unsorted Array :: " + Arrays.toString(nums));
	
		// Sort the array
		for(int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int j = i;
			while(j > 0 && nums[j-1] > temp) {
				nums[j] = nums[j-1];
				j--;
			}
			nums[j]=temp;
		}
		
		// Print out the sorted Array 
		System.out.println("Sorted Array :: " + Arrays.toString(nums));
	}
	public static void swap(int[] nums, int min, int i) {
		int temp = nums[min];
		nums[min] = nums[i];
		nums[i] = temp;
	}
}
