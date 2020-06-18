import java.util.Scanner;

public class RepeatMenu
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner(System.in);
        
        System.out.println("      Menu");
        System.out.println("   ==========");
        System.out.println("1.  Dr. Pepper");
        System.out.println("2.  Coke");
        System.out.println("3.  Sprite");
        System.out.println("4.  7-UP");
        System.out.println("5.  Diet Coke");
        
        System.out.print("\nPlease enter your selection :: ");
        int selection = bang.nextInt();
        
        System.out.println("\nSelection :: " + selection);
        do
        {
            if(selection > 5)
            {
                System.out.println("\nYou entered an invalid selection, please try again.");
            }
            System.out.println("\n      Menu");
            System.out.println("   ==========");
            System.out.println("1.  Dr. Pepper");
            System.out.println("2.  Coke");
            System.out.println("3.  Sprite");
            System.out.println("4.  7-UP");
            System.out.println("5.  Diet Coke");
        
            System.out.print("\nPlease enter your selection :: ");
            selection = bang.nextInt();
        }while(selection > 5);
        if(selection == 1)
        {
            System.out.println("\nYou have chosen :: Dr. Pepper");
        }
        else if(selection == 2)
        {
            System.out.println("\nYou have chosen :: Coke");
        }
        else if(selection == 3)
        {
            System.out.println("\nYou have chosen :: Sprite");
        }
        else if(selection == 4)
        {
            System.out.println("\nYou have chosen :: 7-UP");
        }
        else if(selection == 5)
        {
            System.out.println("\nYou have chosen :: Diet Coke");
        }
        
    }
}