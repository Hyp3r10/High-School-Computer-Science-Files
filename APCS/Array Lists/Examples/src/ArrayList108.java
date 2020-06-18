import java.util.ArrayList;
public class ArrayList108 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList<ArrayList101> list2 = new ArrayList<ArrayList101>();
		
		list.add(1); //autoboxing - it automatically creates and object from the primitive
		list.add(new Integer(2)); //Objects created without assigning it into a variable is called an anonymous object.
		
		System.out.println(list);
		System.out.println(list.get(0).longValue());
		
		int num = 1;
		
		//System.out.println(num.longValue()); // 
		
		ArrayList<Double> list3 = new ArrayList<Double>();
		
		list3.add(1.5); //
		list3.add(new Double(2.5));
	}
}
