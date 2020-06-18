import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class StudentRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Student[] students = new Student[5];
		//int size = 0;
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		int count = 0;
		String response = "";
		do {
			System.out.print("Enter Student " + (count+1) + "'s Name :: ");
			String name = scan.nextLine();
			System.out.print("Enter " + name + "'s GPA :: ");
			double gpa = scan.nextDouble();			
			System.out.print("Enter " + name + "'s Grade Level :: ");
			int gradeLevel = scan.nextInt();
			
			scan.nextLine();
			
			students.add(new Student(name, gpa, gradeLevel));
			
			count++;
			System.out.print("Do you want to enter another Student? <y/n> :: ");
			response = scan.nextLine();
			System.out.println();
		} while(!response.equalsIgnoreCase("n"));
		
		System.out.println("\n");
		//
		System.out.println(students);
		
		System.out.println("\n");
		//Basic For Loop
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("\n");
		//Enhanced For Loop
		for(Student stu : students) {
			System.out.println(stu);
		}
		
	}
} 
