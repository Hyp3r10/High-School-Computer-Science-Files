import java.util.Scanner;

public class SlopeOfALineRunner
{
    public static void main (String argss[])
    {
        Scanner bang = new Scanner (System.in);
        SlopeOfALine octothorp = new SlopeOfALine();
        
        System.out.println("NOTE:: Data Format:(x1,y1,x2,y2)");
        System.out.print("\nPlease enter x1 :: ");
        int x1 = bang.nextInt();
        System.out.print("Please enter y1 :: ");
        int y1 = bang.nextInt();
        System.out.print("Please enter x2 :: ");
        int x2 = bang.nextInt();
        System.out.print("Please enter y2 :: ");
        int y2 = bang.nextInt();
        
        // Void Method :: 
        octothorp.slopeV(x1,y1,x2,y2);
        
        // Return Method :: 
        System.out.println("\nReturn Method :: ");
        System.out.println("The slope is :: " + octothorp.slopeR(x1,y1,x2,y2));
    }
}