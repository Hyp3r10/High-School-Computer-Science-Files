import java.util.ArrayList;
public class ArrayList109 {
	public static void main(String[] args) {
		//ArrayList<Object> list = new ArrayList<Object>();//Same as :: ArrayList list = new ArrayList();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Wrapper classes act as both primitives and objects because of autoboxign and unboxing
		//Autoboxing and unbocing occur only with wrapper classes.
		
		list.add(1); //autoboxing (primitive -> Object)
		list.add(2);
		list.add(0,3);
		
		System.out.println(list);
		
		// int  = Integer +     Integer
		int sum = list.get(0) + list.get(2); //unboxing (Object -> primitive)
		
		System.out.println("Sum :: " + sum);
		
		
	}
}
