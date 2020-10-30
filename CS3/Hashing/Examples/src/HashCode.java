
public class HashCode {

	public static void main(String[] args) {
		Character c = new Character('a');
		System.out.println(c.hashCode());
		
		c = new Character('O');
		System.out.println(c.hashCode());
		
		c = 'A';
		System.out.println(c.hashCode());
		
		Integer num = 45;
		System.out.println(num.hashCode());
		
		num = 101;
		System.out.println(num.hashCode());
		
		String s = "a";
		System.out.println(s.hashCode());
		
		s = "ab";
		System.out.println(s.hashCode());
		
		Double doub = Math.PI;
		System.out.println(doub.hashCode());
	}
}
