import java.util.Scanner;

public class ForLoop104
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        
        //1. Start 2. End 3. Increment
        
        System.out.print("Enter a start value: ");
        int start = bang.nextInt();
        System.out.print("Enter an end value: ");
        int end = bang.nextInt();
        System.out.print("Enter an increment value: ");
        int inc = bang.nextInt();
        
        for(int i = start; i <= end; i += inc)
        {
            System.out.println("The number is: " + i);
            System.out.println("How long can this go on?");
        }
    }
}