import java.util.Scanner;

public class RectanglePerimeterRunner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        RectanglePerimeter octothorp = new RectanglePerimeter();
        
        System.out.print("Please enter the length :: ");
        int length = bang.nextInt();
        System.out.print("Please enter the width :: ");
        int width = bang.nextInt();
        
        // Void Method Call
        octothorp.perimeterV(length, width);
        
        // Return Method Call
        System.out.println("The perimeter is :: " + octothorp.perimeterR(length, width));
    }
}