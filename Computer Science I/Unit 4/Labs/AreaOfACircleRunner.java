import java.util.Scanner;

public class AreaOfACircleRunner
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        AreaOfACircle qwerty = new AreaOfACircle();
        
        System.out.print("Enter the radius --> ");
        double r = bang.nextDouble();
        System.out.print("\n");
        
        // Void Method Call
        qwerty.areaCircleV(r);
        
        // Return Method Call
        System.out.println("The area is :: " + qwerty.areaCircleR(r));
    }
}