import java.util.ArrayList;
import java.util.ListIterator;

public class Temp {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("3");
		a.add(0, "0");
		a.add("2");
		ListIterator<String> iterator = a.listIterator();
		iterator.add("dog");
		iterator.add("cat");
		System.out.println(a);
		
	}
}
