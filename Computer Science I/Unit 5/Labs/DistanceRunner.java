//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
    public static void main( String[] args )
    {
        //add test cases
        Scanner scan = new Scanner(System.in);
        Distance testNull = new Distance();
        
        System.out.print("Enter X1 :: ");
        int x1 = scan.nextInt();
        System.out.print("Enter Y1 :: ");
        int y1 = scan.nextInt();
        System.out.print("Enter X2 :: ");
        int x2 = scan.nextInt();
        System.out.print("Enter Y2 :: ");
        int y2 = scan.nextInt();
        
        Distance test = new Distance(x1, y1, x2, y2);
        test.setCoordinates(x1, y1, x2, y2);
        test.print();
    }
}