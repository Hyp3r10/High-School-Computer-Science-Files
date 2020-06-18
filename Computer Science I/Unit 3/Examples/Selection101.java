import java.util.Scanner;

public class Selection101
{
    public static void main (String[] args)
    {
        Scanner candy = new Scanner (System.in);
        
        System.out.print("What is you grade on the exam: ");
        int grade = candy.nextInt();
        
        // One-Way Selection
        // < <= > >= == !=1
        
        if(grade == 100) //if(boolean conditional), boolean conditional returns true or false, NO SEMICOLIONS!!!!
        {
            // if the boolean conditional is true, these statements are executed.
            System.out.println("You get a peice of candy!!!!");
            System.out.println("You are an awesome person!! =) ");
        }
        
        System.out.println("Your grade is: " + grade);
    }
}