import java.util.Arrays;

/**
 * @author MatthewSheldon
 *	Selection Sort:
 *	Best: O(n^2) -- Average: O(n^2) -- Worst: O(n^2)
 *	Sorts by finding the minimum element in the array and moves it to its correct spot
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] array1 = {4,2,7,3,9,0,5,1,6,8};
		System.out.println(Arrays.toString(selectionSort(array1)) + "\n\n");
		
		int[] array2 = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(selectionSort(array2)) + "\n\n");
		
		int array3[] = {9,8,7,6,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(selectionSort(array3)) + "\n\n");
	}
	public static int[] selectionSort(int[] array) {
		int n = array.length;
		
		// Goes through the entire array searching to see if it is sorted
		for(int i = 0; i < n-1; i++) {
			//Find the minimum element
			int min_index = i;
			for(int j = i+1; j < n; j++) {
				if(array[j] < array[min_index]) {
					min_index = j;
				}
			}
			
			//Swap the elements
			int temp = array[min_index];
			array[min_index] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
}
