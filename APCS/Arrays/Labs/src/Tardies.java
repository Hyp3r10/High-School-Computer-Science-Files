import java.util.*;
  
public class Tardies
{
    // instance variables
    private Student[] students;    // list of students
    private int numStudents;
    private Scanner scan = new Scanner(System.in);
    // logical size of the array
	
    // constructor
    public Tardies()  {
        students = new Student[50];   // instantiate array
        numStudents = 0;               
    }
	
    /** precondition: none
     *  postcondition: students array has been populated with
     *     Student objects from keyboard input. numStudents has 
     *     been updated to reflect the logical size of the 
     *     array student.
     */
    public void enterData() {
    	System.out.println("==================");
    	System.out.println("Enter Student Data");
    	System.out.println("==================");
    	String response = "";
    	do {
    		System.out.print("Enter the Student's Last Name :: ");
    		String last = scan.nextLine();
    		System.out.print("Enter the Student's First Name :: ");
    		String first = scan.nextLine();
    		System.out.print("Enter the Student's Number of Tarties :: ");
    		int tarties = scan.nextInt();
    		
    		scan.nextLine();
    		students[numStudents] = new Student(last,first,tarties);
    		
    		System.out.print("\nWould you like to enter another student? <y/n> :: ");
    		response = scan.nextLine();
    		
    		numStudents++;
    		
    		System.out.println();
    	}while(numStudents < 50 && response.equalsIgnoreCase("y"));
    }
    /* @return the total number of tardies for all students
     *    in the class.
     */
    public int getTotalTardies() {
    	int sum = 0;
    	for(int i = 0; i < numStudents; i++) {
    		sum += students[i].getTardies();
    	}
    	return sum;
    }
    /** precondition: none
     *  postcondition: a summary report has been printed which includes
     *     the total number of tardies for the entire class and a
     *     list of names and tardies for every student in the class.
     */
    public void summaryReport() {
    	System.out.println("\n==================================");
    	System.out.println("Class Summary - Tardy Total = " + getTotalTardies());
    	System.out.println("==================================");
    }
    @Override
    public String toString() {
    	String output = "";
    	for(int i = 0; i < numStudents; i++) {
    		output += students[i].getLastName() + ", " + students[i].getFirstName() + ", " + students[i].getTardies() + "\n";
    	}
    	return output;
    }
    public static void main(String[] args)
    {
        Tardies app = new Tardies();
        app.enterData();
        app.summaryReport();
        System.out.println(app);
    }
}