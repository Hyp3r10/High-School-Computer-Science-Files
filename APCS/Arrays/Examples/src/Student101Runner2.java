import java.util.Scanner;
public class Student101Runner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student101[] students = new Student101[100]; // Physical size == 100 elemens
		int size = 0;
		String ans = "";
		
		
		do {
			System.out.print("Enter the name of the Student :: ");
			String name = scan.nextLine();
			System.out.print("Enter the grade level of the Student :: ");
			int gradeLevel = scan.nextInt();
			System.out.print("Enter the GPA of the Student :: ");
			double gpa = scan.nextDouble();
			String dummy = scan.nextLine();
			
			Student101 tmp = new Student101(name, gradeLevel, gpa);
			students[size] = tmp;
			
			size++;
			
			System.out.print("\nDo you want to enter another student? <y/n> :: ");
			ans = scan.nextLine();
			System.out.println("");
		} while(!ans.equalsIgnoreCase("n"));
		
		//Enhanced for loop BAD -- Uses the physical version
		/*for(Student101 stu : students) {
			System.out.println(stu);
		}*/
		
		//Basic for loop GOOD -- uses the logical version
		for(int index = 0; index < size; index++) {
			System.out.println(students[index]);
		}
		
	}
}
