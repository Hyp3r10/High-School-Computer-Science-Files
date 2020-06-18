import java.util.Scanner;

public class ForLoop103
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        int sum = 0;// accumulator
        int grade = 0;
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.print("Enter a grade: ");
            grade = bang.nextInt();
            
            sum += grade; // like saying: sum = sum + grade
        }
        
        System.out.println("\nThe sum of the grades is: " + sum);
    }
}