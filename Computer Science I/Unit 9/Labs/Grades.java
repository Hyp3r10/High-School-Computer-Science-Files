import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many grades would you like to enter? ");
        int numGrades = scan.nextInt();
        System.out.println("");
        double[] grades = new double[numGrades];
        double grade = 0;
        for(int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + " :: ");
            grade = scan.nextDouble();
            String dummy = scan.nextLine();
            grades[i] = grade;
        }
        double average = 0.0;
        double temp = 0.0;
        for(int i = 0; i < grades.length; i++) {
            temp += grades[i];
            if(i == grades.length-1) {
                average = temp / (i + 1);
            }
        }
        System.out.println("\nThe average is :: " + average);
    } 
}
