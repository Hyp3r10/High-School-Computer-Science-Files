//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner; 
import java.lang.Math.*;
public class TriangleRunner  //this class is used to test Triangle
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        //ask for user input
        System.out.print("Enter side A ::  ");
        int a = keyboard.nextInt();
        System.out.print("Enter side B ::  ");
        int b = keyboard.nextInt();
        System.out.print("Enter side C ::  ");
        int c = keyboard.nextInt();
        
        // Test Triangle 1
        Triangle test = new Triangle(a, b, c);
        test.setSides(a, b, c);
        test.print();
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //ask for user input
        System.out.print("Enter side A ::  ");
        a = keyboard.nextInt();
        System.out.print("Enter side B ::  ");
        b = keyboard.nextInt();
        System.out.print("Enter side C ::  ");
        c = keyboard.nextInt()  ;

        // Test Triangle 2
        test.setSides(a, b, c);
        test.print();
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //add one more input section
        System.out.print("Enter side A ::  ");
        a = keyboard.nextInt();
        System.out.print("Enter side B ::  ");
        b = keyboard.nextInt();
        System.out.print("Enter side C ::  ");
        c = keyboard.nextInt();

        // Test Triangle 3
        test.setSides(a, b, c);
        test.print();
    }
}