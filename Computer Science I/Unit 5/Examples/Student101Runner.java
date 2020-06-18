import java.util.Scanner;
public class Student101Runner
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        Student101 test = new Student101();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter your Name :: ");
        String name = scan.nextLine();
        System.out.print("Enter your Grade Level :: ");
        int gradeLevel = scan.nextInt();
        System.out.print("Enter your GPA :: ");
        double gpa = scan.nextDouble();
        scan.nextLine(); // Dummy String
        System.out.print("Student's Secret :: ");
        String secretInfo = scan.nextLine();
        System.out.println();
        Student101 student1 = new Student101(name, gradeLevel, gpa, secretInfo);
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.print("Enter your Name :: ");
        name = scan.nextLine();
        System.out.print("Enter your Grade Level :: ");
        gradeLevel = scan.nextInt();
        System.out.print("Enter your GPA :: ");
        gpa = scan.nextDouble();
        scan.nextLine(); // Dummy String
        System.out.print("Student's Secret :: ");
        secretInfo = scan.nextLine();
        System.out.println();
        Student101 student2 = new Student101(name, gradeLevel, gpa, secretInfo);
        
        System.out.println();
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        ////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}