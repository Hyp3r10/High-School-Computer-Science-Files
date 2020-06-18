import java.util.Arrays;

public class Search107 {

	public static void main(String[] args) {
		// Binary search with Objects
		int[] nums = {3,2,6,1,8,5,7};
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 4);
		if(index >= 0) {
			System.out.println("\nThe item is at index " + index + "\n");
		}
		else {
			System.out.println("\nThe item is not in the Array\n");
			System.out.println("The item should be placed at index :: " + Math.abs(index+1));
		}
	}
}



