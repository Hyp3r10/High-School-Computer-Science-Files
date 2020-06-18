import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparable110 {
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
		
		ArrayList<Comparable> list6 = new ArrayList<Comparable>(Arrays.asList(list1));
		ArrayList<Comparable> list7 = new ArrayList<Comparable>(Arrays.asList(list2));
		ArrayList<Comparable> list8 = new ArrayList<>(Arrays.asList(list3));
		ArrayList<Comparable> list9 = new ArrayList<>(Arrays.asList(list4));
		ArrayList<Comparable> list10 = new ArrayList<>(Arrays.asList(list5));
		
		Comparable110.sortComparables(list6);
		Comparable110.sortComparables(list7);
		Comparable110.sortComparables(list8);
		sortComparables(list9);
		sortComparables(list10);
	}
	public static void sortComparables(ArrayList<Comparable> any) {
		System.out.println("\nUnsorted Array :: ");
		System.out.println(any);
		
		Collections.sort(any);
		
		System.out.println("Sorted Array :: ");
		System.out.println(any);
	}
}
