import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList106 {
	public static void main(String[] args) {
		//method size NOT length
		//better printing

		int[] mant = {1,2,3};
		ArrayList list = new ArrayList();

		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("The lenght of the Array is :: " + mant.length + "\n");
		System.out.println(mant);
		System.out.println(Arrays.toString(mant));

		System.out.println("\n\nThe length of the ArrayList is :: " + list.size() + "\n");

		System.out.println(list);

		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		/*System.out.println();
		  for(ArrayList num : list) {
		  	System.out.print(num + " ");
		}*/
		System.out.println();
		for(Object x : list) {
			System.out.print(x+" ");
		}
	}
}
