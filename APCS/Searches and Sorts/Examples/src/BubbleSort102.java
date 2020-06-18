
public class BubbleSort102 {

	public static void main(String[] args) {
		//Different implementation of Bubble Sort with primitives
		int[] nums = new int[10];

		// Generate random numbers from 2..11 inclusive

		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*10 ) + 2;
		}

		// Print sorted Array
		System.out.println("Unsorted Array :: "); 
		for(int num : nums) {
			System.out.print(num + " ");
		}

		// Sort the Array
		for(int out = 0; out < nums.length-1; out++) { // Controls number of passes through the array
			for(int in = 0; in < nums.length-1; in++) { // Controls elements in current pass of array
				if(nums[in] > nums[in+1]) {
					swap(nums, in, in+1);
				}
			}
		}

		// Print sorted Array
		System.out.println("\nSorted Array :: "); 
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	public static void swap(int[] nums, int pos1, int pos2) {
		int temp = nums[pos2];
		nums[pos2] = nums[pos1];
		nums[pos1] = temp;
	}
}
