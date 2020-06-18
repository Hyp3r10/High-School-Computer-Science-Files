import java.util.Arrays;

public class SelectionSort101 {

	public static void main(String[] args) {
		// Selection sort with primitives
		int[] nums = new int[10];
		
		// Fill the array with random ints from 5..20 inclusive
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()* 16 ) + 5;
		}
		
		// Print out the unsorted Array 
		System.out.println("Unsorted Array :: " + Arrays.toString(nums));
	
		// Sort the array
		for(int out = 0; out < nums.length-1; out++) {
			int min = out;
			for(int in = out; in < nums.length; in++) {
				if(nums[in] < nums[min]) {
					min = in;
				}
			}
			if(min != out) {
				swap(nums, min, out);
			}
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
