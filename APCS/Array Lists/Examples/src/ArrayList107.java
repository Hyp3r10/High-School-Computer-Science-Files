import java.util.ArrayList;

public class ArrayList107 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //ArrayLists store objects

		double count = 1;

		for(int i = 0; i < 10; i++) {
			list.add(count++);
		}
		System.out.println(list);

		double sum = (double) list.get(0) + (double) list.get(1);
		System.out.println("The sum of the first two elements is :: " + sum);
		///////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Double> betterList = new ArrayList<Double>(); //Generic create specifics
		/**
		 * Double is a wrapper class, there is a wrapper class for each corresponding primitive data type
		 * (e.g. Integer, Long, Short, Byte, etc)
		 * Wrapper classes allow values to be treated as both primitive and an object.
		 * 
		 * Side note :: Cannot cast Double to Integer, or int 
		 */
		
		count = 1;

		for(int i = 0; i < 10; i++) {
			betterList.add(count++);
		}
		System.out.println("\n\n\n" + betterList);

		sum = betterList.get(0) + betterList.get(1);
		System.out.println("The sum of the first two elements is :: " + sum);
	}
}
