import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
//import java.packageName.className
public class Comparable106 {
	public static void main(String[] args) {
		// sssort by multiple conditions
		/*Student105 s1 = new Student105(1,"Joe", 12, 3.5);
		Student105 s2 = new Student105(2,"Bob", 9, 3.5);*/
		
		Student105 s1 = new Student105(1,"Joe", 12, 3.9);
		Student105 s2 = new Student105(2,"Bob", 9, 3.7);
		Student105 s3 = new Student105(3,"Shane", 10, 3.1);

/*		Student105[] students = {s1,s2,s3};
		
		System.out.println("Unsorted Array :: ");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		
		System.out.println("Sorted Array :: ");
		System.out.println(Arrays.toString(students));*/
		
		ArrayList<Student105> students2 = new ArrayList<Student105>();
		
		students2.add(s1);
		students2.add(s2);
		students2.add(s3);
		
		System.out.println("Unsorted Array :: ");
		System.out.println(students2);
		
		Collections.sort(students2); // Use the Collections class to sort ArrayLists.
		
		System.out.println("Sorted Array :: ");
		System.out.println(students2);
	}
}
