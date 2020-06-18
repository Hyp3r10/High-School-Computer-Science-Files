import java.util.Scanner;

public class PythagoreanTheorem
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        double c = 0;
        
        System.out.print("Enter side 1 --> ");
        a = keyboard.nextInt();
        System.out.print("Enter side 2 --> ");
        b = keyboard.nextInt();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println();
        System.out.println("The hypotenuse of the triangle = " + Math.round(c));
    }
}