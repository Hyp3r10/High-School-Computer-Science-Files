import java.util.Scanner;

public class Methods101Runner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        Methods101 octothorp = new Methods101();
        
        System.out.print("Please enter in a number (0-6) :: ");
        int weekday = bang.nextInt();
        
        System.out.println("Day of the week :: " + octothorp.weekdayName(weekday));
    }
}