import java.util.Arrays;

public class Search101 {

	public static void main(String[] args) {
		// Linear (aka Sequential) search (with primitives)
		int[] list = {3,1,4,1,5,9};

		boolean found = false;
		int key = 4;

		System.out.println("Elements Checked :: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			if(list[i] == key) {
				found = true;
			}
		}
		System.out.println("\n" + Arrays.toString(list));
		if(found) {
			System.out.println("\nThe array contains " + key + "\n");
		}
		else {
			System.out.println("\nThe array does not contains " + key + "\n");
		}
	}
}
