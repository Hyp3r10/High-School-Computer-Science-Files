//� A+ Computer Science  -  www.apluscompsci.com
//Name - Matthew Sheldon
//Date - 11/14/17
//Class - Com. Sci. I
//Lab  - OOP / Return – QUADRATIC FORMULA
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class Quadratic
{
    private int a, b, c;
    private double rootOne;
    private double rootTwo;
    //Constructor
    public Quadratic()
    {
        int quadA = 0;
        int quadB = 0;
        int quadC = 0;
    }
    //Mutators
    public Quadratic(int quadA, int quadB, int quadC)
    {
        a = quadA;
        b = quadB;    
        c = quadC;
        setEquation(a,b,c);
    }
    public void setEquation(int quadA, int quadB, int quadC)
    {
        double discriminant = (Math.pow(b,2)) - (4*(a)*(c));
        double denominator = 2 * a;
        calcRoots(discriminant, denominator);
    }
    public void calcRoots(double discriminant, double denominator)
    {
        // +
        rootOne = ((-b) + Math.sqrt(discriminant)) / denominator;
        // - 
        rootTwo = ((-b) - Math.sqrt(discriminant)) / denominator;
    }
    //Accessor
    public void print( )
    {
        System.out.println("\n\nRoot One :: " + rootOne);
        System.out.println("Root Two :: " + rootTwo);
    }
}