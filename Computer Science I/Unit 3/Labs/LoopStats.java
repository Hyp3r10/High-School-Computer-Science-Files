import java.util.Scanner;

public class LoopStats
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter the first integer :: ");
        int num1 = bang.nextInt();
        System.out.print("Enter the second integer :: ");
        int num2 = bang.nextInt();
        int i = 1;
        int total = 0;
        int odd = 0;
        int even = 0;
        
        //total::
        if(num1 < num2)
        {
           for(i = num1; i <= num2; i++)
           {
               total = total + i;
               if((i) % 2 == 0)
               {
                   even++;
               }
               else if((i) % 2 == 1)
               {
                   odd++;
               }
           }
        }
        else if(num1 > num2)
        {
           for(i = num2; i <= num1; i++)
           {
               total = total + i;
               if((i) % 2 == 0)
               {
                   even++;
               }
               else if((i) % 2 == 1)
               {
                   odd++;
               }
           }
        }
        System.out.println("\ntotal :: " + total);
        System.out.println("even count :: " + even);
        System.out.println("odd count :: " + odd);
        
    }
}