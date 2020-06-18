import java.util.ArrayList;

public class ArrayList102 {
	public static void main(String[] args) {
		//method set
		//array[n] = 1
		
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("The value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
		
		//list.set(index, element);
		list.set(0,7);
		list.set(1,8);
		list.set(2,9);
		
		System.out.println("\n\nThe value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
	}
}
