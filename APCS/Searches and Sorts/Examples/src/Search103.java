import java.util.Arrays;

public class Search103 {

	public static void main(String[] args) {
		// Linear (aka Sequential) search (with primitives)
		int[] list = {3,1,4,1,5,9};

		int index = -1;
		int key = 4;

		System.out.println("Elements Checked :: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			if(list[i] == key) {
				index = i;
				break;
			}
		}
		System.out.println("\n" + Arrays.toString(list));
		if(index > -1) {
			System.out.println("\nThe arraty contains " + key + " and it is found at index " + index + "\n");
		}
		else {
			System.out.println("\nThe array does not contains " + key + "\n");
		}
	}
}
