import java.util.ArrayList;

public class ArrayList105 {
	public static void main(String[] args) {
		//return vs void
		
		ArrayList list = new ArrayList();
		
		System.out.println(list.add(2));
		System.out.println(list.add(3));
		System.out.println(list.add(4));
		
		System.out.println("\n\nThe value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
		System.out.println("The value at index 2 :: " + list.get(2));
		
		System.out.println("\n\n" + list.remove(1));
		
		System.out.println("\n\nThe value at index 0 :: " + list.get(0));
		System.out.println("The value at index 1 :: " + list.get(1));
	}
}
