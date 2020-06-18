import java.util.Scanner;

public class DistanceFormula
{
    public static void main (String[] args)
    {
        Scanner cordinates = new Scanner (System.in);
        
        System.out.print("Enter truck A’s X coordinate :: ");
        int x1 = cordinates.nextInt();
        System.out.print("Enter truck A’s Y coordinate :: ");
        int y1 = cordinates.nextInt();
        System.out.print("Enter truck B’s X coordinate :: ");
        int x2 = cordinates.nextInt();
        System.out.print("Enter truck B’s Y coordinate :: ");
        int y2 = cordinates.nextInt();
        
        double distance1 = Math.sqrt((Math.pow((x1 - 0), 2) + (Math.pow((y1 - 0), 2))));
        double distance2 = Math.sqrt((Math.pow((x2 - 0), 2) + (Math.pow((y2 - 0), 2))));
        
        if(distance1 < distance2)
        {
            System.out.println("\nA is closer to (0,0).");
        }
        if(distance1 > distance2)
        {
            System.out.println("\nB is closer to (0,0).");
        }
        if(distance1 == distance2)
        {
            System.out.println("\nA and B are equally close to (0,0).");
        }
    }
}