import java.util.Scanner;

public class ForLoopRunner
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Start: ");
        int start = bang.nextInt();
        System.out.print("Stop: ");
        int end = bang.nextInt();
        System.out.print("Increment");
        int inc = bang.nextInt();
        
        for(int i = start; i <= end; i += inc)
        {
            System.out.print(i + " ");
        }
    }
}