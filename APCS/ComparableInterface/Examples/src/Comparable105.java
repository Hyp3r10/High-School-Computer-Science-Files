public class Comparable105 {
	public static void main(String[] args) {
		// sssort by multiple conditions
		/*Student105 s1 = new Student105(1,"Joe", 12, 3.5);
		Student105 s2 = new Student105(2,"Bob", 9, 3.5);*/
		
		Student105 s1 = new Student105(1,"Joe", 12, 3.5);
		Student105 s2 = new Student105(2,"Bob", 12, 3.5);

		System.out.println("compareTo return:: " + s1.compareTo(s2));
		
		int result = s1.compareTo(s2);
		
		if(result < 0) {
			System.out.println(s1.getName() + " is less than " + s2.getName());
			System.out.println(s1.getName() + " comes before " + s2.getName());
		}
		else if(result > 0) {
			System.out.println(s1.getName() + " is greater than " + s2.getName());
			System.out.println(s1.getName() + " comes after " + s2.getName());
		}
		else {
			System.out.println(s1.getName() + " is equal to " + s2.getName());
			System.out.println(s1.getName() + " is the same as " + s2.getName());
		}
	}
}
