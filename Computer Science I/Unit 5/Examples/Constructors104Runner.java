import java.util.Scanner;

public class Constructors104Runner
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number --> ");
        int number1 = scan.nextInt();
        System.out.print("Enter Second number --> ");
        int number2 = scan.nextInt();
        
        System.out.println("\n");
        
        System.out.println("Calling Constructors104(number1, number2)");
        Constructors104 con1 = new Constructors104(number1, number2);
        con1.outputValues();
        System.out.println("\n");
        
        System.out.println("Calling default Constructors104()");
        Constructors104 con2 = new Constructors104();// Defauklt constructors do not have any paramaters
        con2.outputValues();
        System.out.println("\n");
        
        System.out.println("Calling default Constructors104(number1)");
        Constructors104 con3 = new Constructors104(number1);
        con3.outputValues();
        System.out.println("\n");
    }
}