import java.util.ArrayList;
import java.util.Collections;

public class Search108 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);		
		nums.add(2);		
		nums.add(6);		
		nums.add(1);		
		nums.add(8);		
		nums.add(5);
		nums.add(7);
		
		System.out.println("Unsorted ArrayList :: " + nums);
		
		Collections.sort(nums);
		System.out.println("Sorted ArrayList :: " + nums);
		
		int index = Collections.binarySearch(nums, 7);
		
		if(index >= 0) {
			System.out.println("\nThe item is at index " + index + "\n");
		}
		else {
			System.out.println("\nThe item is not in the Array\n");
			System.out.println("The item should be placed at index :: " + Math.abs(index+1));
		}
	}
}




