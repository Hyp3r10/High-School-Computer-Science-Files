import java.util.Scanner;

public class WhileLoop104
{
    public static void main (String args[])
    {
        Scanner octothorp = new Scanner (System.in);
        
        int grade = 0;
        int numGrades = 0; // Counter
        int sum = 0; // Accumulator
        double average = 0;
        
        System.out.println("Enter '-1' when finished entering grades.");
        
        while(grade != -1) // -1 i called a ssentinal value or flag
        {    
            System.out.print("Enter grade " + (numGrades +1) + ": ");
            grade = octothorp.nextInt();
            
            
            if (grade != -1)
            {
                sum += grade;
                numGrades++;
            }
        }
        
        average = (double) sum / numGrades;
        System.out.println("The average is: " + average);
    }
}