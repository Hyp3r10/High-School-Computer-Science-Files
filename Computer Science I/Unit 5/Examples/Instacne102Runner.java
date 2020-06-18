import java.util.Scanner;
public class Instacne102Runner
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number --> ");
        int number1 = scan.nextInt();
        System.out.print("Enter Second number --> ");
        int number2 = scan.nextInt();
        Instacne102 con = new Instacne102();
        con.Instacne102(number1, number2);
        
        System.out.println("num1 :: " + con.num1); // Directly accessing tje isntance variables in the class Initilization102
        System.out.println("num2 :: " + con.num2); // This is a bad thing!
    }
}