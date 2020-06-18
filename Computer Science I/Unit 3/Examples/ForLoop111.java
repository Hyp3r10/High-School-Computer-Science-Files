import java.util.Scanner;

public class ForLoop111
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        
        //1. Start 2. End 3. Increment
        
        System.out.print("Enter a start value: ");
        long start = bang.nextLong();
        System.out.print("Enter an end value: ");
        long end = bang.nextLong();
        System.out.print("Enter an increment value: ");
        long inc = bang.nextLong();
        
        for(long i = start; i <= end; i += inc)
        {
            System.out.println(i);
        }
    }
}