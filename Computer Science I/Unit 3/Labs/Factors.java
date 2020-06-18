import java.util.Scanner;

public class Factors
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Please enter the number you want to find the factors for :: ");
        int num = bang.nextInt();
        int i = 1;
        System.out.print("\n" + num + " has factors :: ");
        System.out.println("\n");
        while(i <= num)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}