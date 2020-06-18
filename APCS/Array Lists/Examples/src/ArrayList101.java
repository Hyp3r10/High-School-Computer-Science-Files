import java.util.ArrayList;

public class ArrayList101 {
	public static void main(String[] args) {
		//method add(x) and add(x,y)
		//no simple array equivalent
		//method get()
		
		ArrayList list = new ArrayList();
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println("The value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
		
		list.add(1,9); // Overloaded
		list.add(3,8);
		list.add(7);
		
		System.out.println("\nThe value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
		System.out.println("The value at index 3 :: " + list.get(3));
		System.out.println("The value at index 4 :: " + list.get(4));
		System.out.println("The value at index 5 :: " + list.get(5));
	}
}
