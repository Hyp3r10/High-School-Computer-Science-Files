import java.util.ArrayList;

public class ArrayList104 {
	public static void main(String[] args) {
		//method remove
		//
		
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(9);
		
		System.out.println("The value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
		
		//list.remove(index);
		list.remove(0);
		
		System.out.println("\n\nThe value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
	}
}
