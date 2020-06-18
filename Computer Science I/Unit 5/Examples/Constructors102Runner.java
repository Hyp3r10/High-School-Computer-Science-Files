import java.util.Scanner;

public class Constructors102Runner
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        //Because this has no paramaters it calls the unseen default constructor
        //Constructors102 con = new Constructors102; // Default contstuctor call (no paramaters)
        
        System.out.print("Enter First number --> ");
        int number1 = scan.nextInt();
        System.out.print("Enter Second number --> ");
        int number2 = scan.nextInt();
        
        /**
         * Becasue this class constructor call has paramaters, java knows to call 
         * the method we created and not hte default constructor that does
         * not have any paramaters.
         */
        
        Constructors102 con = new Constructors102(number1, number2);
        
        con.outputValues(); 
    }
}