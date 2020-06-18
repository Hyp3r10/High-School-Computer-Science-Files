import java.util.Arrays;

public class BubbleSort103 {

	public static void main(String[] args) {
		//Bubble Sort with Objects
		Comparable[] nums = new Comparable[10];

		// Generate random numbers from 2..11 inclusive
		for(int i = 0; i < nums.length; i++) {
			nums[i] = new Integer( (int) (Math.random()*10 ) + 2);
		}

		// Print sorted Array
		System.out.println("Unsorted Array :: " + Arrays.toString(nums));

		// Sort the Array
		int count = 0;
		do {
			count = 0;
			for(int i = 0; i < nums.length-1; i++) {
				if(nums[i].compareTo(nums[i+1]) > 0) {
					swap(nums, i, i+1);
					count++;
				}
			}
		} while(count > 0);

		// Print sorted Array
		System.out.println("\nSorted Array :: " + Arrays.toString(nums));
	}
	public static void swap(Comparable[] nums, int pos1, int pos2) {
		Comparable temp = nums[pos2];
		nums[pos2] = nums[pos1];
		nums[pos1] = temp;
	}
}