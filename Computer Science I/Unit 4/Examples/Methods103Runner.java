import java.util.Scanner;

public class Methods103Runner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        Methods103 octothorp = new Methods103();
        
        System.out.print("Please enter the first number :: ");
        int num1 = bang.nextInt();
        System.out.print("Please enter the second number :: ");
        int num2 = bang.nextInt();
        System.out.print("Please enter the third number :: ");
        int num3 = bang.nextInt();
        
        System.out.println("\nThe average of the three numbers is :: " + octothorp.averageThree(num1, num2, num3));
    }
}