import java.util.ArrayList;

public class ArrayList103 {
	public static void main(String[] args) {
		//method isEmpty
		//finds if an ArrayList is empty
		
		ArrayList list = new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(123);
		list.add(12);
		list.add(1);
		
		System.out.println("\n" + list.isEmpty());
	}
}
