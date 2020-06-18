import java.util.Arrays;

public class Search106 {

	public static void main(String[] args) {
		// Binary search with Objects
		Comparable[] list = {"Sean", "Rohit", "Teja", "Mo", "SUQ", "Vishnu"}; 
		String key = "Teja";
		int index = -1;
		
		System.out.println("Unsorted Array :: \n" + Arrays.toString(list) + "\n");
		
		Arrays.sort(list);
		System.out.println("Sorted Array :: \n" + Arrays.toString(list));
		
		int min = 0;
		int max = list.length-1;
		while(min <= max) {
			int middle = (max+min)/2;
			if(list[middle].equals(key)) {
				index = middle;
				break;
			}
			else {
				if(list[middle].compareTo(key) < 0) {
					min = middle+1;
				}
				else {
					max = middle-1;
				}
			}
		}	if(index > -1) {
			System.out.println("\nThe array contains " + key + " and it was found at index " + index + "\n");
		}
		else {
			System.out.println("\nThe array does not contains " + key + "\n");
		}
	}
}



