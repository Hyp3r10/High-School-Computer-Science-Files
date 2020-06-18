import java.util.Arrays;

public class Search105 {

	public static void main(String[] args) {
		// Binary search with primitives
		int[] list = {3,1,4,1,5,9};
		
		Arrays.sort(list);
		
		int key = 3;
		int index = -1;
		
		int min = 0;
		int max = list.length-1;
		while(min <= max) {
			int middle = (min + max) / 2;
			if(list[middle] == key) {
				index = middle;
				break;
			}
			else {
				if(key < list[middle]) {
					max = middle-1;
				}
				else {
					min = middle+1;
				}
			}
		}
		System.out.println("Sorted :: " + Arrays.toString(list));
		if(index > -1) {
			System.out.println("\nThe array contains " + key + " and it was found at index " + index + "\n");
		}
		else {
			System.out.println("\nThe array does not contains " + key + "\n");
		}
	}
}



