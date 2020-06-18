import java.util.Scanner;

public class DigetAdder
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Please enter the number you want to find the sum of :: ");
        int num = bang.nextInt();
        int temp = num;
        int sum = 0;
        
        while(temp > 0)
        {
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.print("\n" + sum + " is the sum of " + num);
    }
}