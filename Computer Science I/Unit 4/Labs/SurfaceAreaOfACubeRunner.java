import java.util.Scanner; 

public class SurfaceAreaOfACubeRunner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        SurfaceAreaOfACube qwerty = new SurfaceAreaOfACube();
        
        System.out.print("Please enter the side length :: ");
        int operand1 = bang.nextInt();
        
        // Void Method Call
        qwerty.surfaceAreaV(operand1);
        
        // Return Method Call
        System.out.println("The surface area is :: " + qwerty.surfaceAreaR(operand1));
    }
}