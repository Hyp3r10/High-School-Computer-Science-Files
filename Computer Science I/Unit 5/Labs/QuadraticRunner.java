//� A+ Computer Science  -  www.apluscompsci.com
//Name - Matthew Sheldon
//Date - 11/14/17
//Class - Com. Sci. I
//Lab  - OOP / Return – QUADRATIC FORMULA
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class QuadraticRunner
{
    public static void main( String[] args )
   {
       //add test cases
       Scanner scan = new Scanner(System.in);
       Quadratic test = new Quadratic();
       
       System.out.print("Enter a :: ");
       int a = scan.nextInt();
       System.out.print("Enter b :: ");
       int b = scan.nextInt();
       System.out.print("Enter c :: ");
       int c = scan.nextInt();
       Quadratic test2 = new Quadratic(a,b,c);
       test2.print();
       
    }
}