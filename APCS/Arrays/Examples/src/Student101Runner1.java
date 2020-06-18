
public class Student101Runner1 {
	public static void main(String[] args) {
		Student101 stu1 = new Student101("Mohamad", 10, 3.1);
		Student101 stu2 = new Student101("Matthew", 9, 1.2);
		Student101[] students = new Student101[2];
		
		// ALL object class objects have an initial default value of null.
		// We cannot perform any manipulative operations with null object -> runtime error: null point exception
		System.out.println(students[0] + "\n" + students[1]);
		System.out.println("\n");
		
		students[0] = stu1;
		students[1] = stu2;
		
		System.out.println(students[0] + "\n\n" + students[1]);
		
		int sum = students[0].getGradeLevel() + students[1].getGradeLevel();
		System.out.print("\n\nThe sum of the grade levels is :: " + sum);
	}
}
