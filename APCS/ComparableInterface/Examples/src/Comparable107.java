import java.util.Arrays;


public class Comparable107 {
	public static void main(String[] args) {
		Integer[] list1 = {1000, 42, 1337, 360, 1492, 1776, 420, 1999, 9001};
						// information hiding via auto-boxing
						// {new Integer(1000), new Integer(42, new Integer(1337), ...)}
		Double[] list2 = {2.14, 3.141592, 2.535, 4.20, 6.02E23, 101.1, 9.11};
		
		Character[] list3 = {'t', '<', 'I', '@', '~', 's', '*'};
		
		String[] list4 = {"Nathan", "Ryan", "Jacob", "Lucas", "Tanner", "Dork(aka Quin)", "Teja"};
		
		Student105 s1 = new Student105(1,"Joe", 12, 3.9);
		Student105 s2 = new Student105(2,"Bob", 9, 3.7);
		Student105 s3 = new Student105(3,"Shane", 10, 3.1);
		
		Student105[] list5 = {s1, s2, s3};
		
		Comparable107.sortInteger(list1);
		Comparable107.sortDouble(list2);
		Comparable107.sortCharacters(list3);
		Comparable107.sortStrings(list4);
		Comparable107.sortStudent105s(list5);
	}
	public static void sortInteger(Integer[] intNums) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(Arrays.toString(intNums));
		
		Arrays.sort(intNums);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(intNums));
	}
	public static void sortDouble(Double[] doubleDoubles) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(Arrays.toString(doubleDoubles));
		
		Arrays.sort(doubleDoubles);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(doubleDoubles));
	}
	public static void sortCharacters(Character[] charCharacters) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(Arrays.toString(charCharacters));
		
		Arrays.sort(charCharacters);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(charCharacters));
	}
	public static void sortStrings(String[] stringStrings) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(Arrays.toString(stringStrings));
		
		Arrays.sort(stringStrings);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(stringStrings));
	}
	public static void sortStudent105s(Student105[] studentStudent105s) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(Arrays.toString(studentStudent105s));
		
		Arrays.sort(studentStudent105s);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(studentStudent105s));
	}
}
