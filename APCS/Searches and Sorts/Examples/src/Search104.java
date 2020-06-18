import java.util.Arrays;

public class Search104 {

	public static void main(String[] args) {
		// Linear search with Objects
		Comparable[] list = {"Sean", "Rohit", "Teja", "Mo", "SUQ", "Vishnu"}; 
		String key = "Mo";
		int index = -1;
		for(int i = 0; i < list.length; i++) {
			if(list[i].compareTo(key) == 0) { // or list[i].equals(key)
				index = i;
				break;
			}
		}
		System.out.println(Arrays.toString(list));
		if(index > -1) {
			System.out.println("\nThe array contains " + key + " and they is found at index " + index + "\n");
		}
		else {
			System.out.println("\nThe array does not contains " + key + "\n");
		}
	}
}



