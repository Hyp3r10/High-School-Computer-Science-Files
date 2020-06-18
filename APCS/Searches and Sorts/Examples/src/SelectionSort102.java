import java.util.Arrays;

public class SelectionSort102 {

	public static void main(String[] args) {
		// Selection sort with Objects
		Comparable[] nums = new Comparable[10];

		// Generate random numbers from 5..20 inclusive
		for(int i = 0; i < nums.length; i++) {
			nums[i] = new Integer( (int) (Math.random()*16 ) + 5);
		}
		
		// Print out the unsorted Array 
		System.out.println("Unsorted Array :: " + Arrays.toString(nums));
	
		// Sort the array
		for(int out = 0; out < nums.length-1; out++) {
			int min = out;
			for(int in = out; in < nums.length; in++) {
				if(nums[in].compareTo(nums[min]) < 0) {
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
	public static void swap(Comparable[] nums, int min, int i) {
		Comparable temp = nums[min];
		nums[min] = nums[i];
		nums[i] = temp;
	}
}
