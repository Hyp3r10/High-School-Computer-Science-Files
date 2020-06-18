//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner; 
import java.lang.Math.*;
public class Triangle
{
    private int sideA, sideB, sideC;
    private double perimeter;
    private double theArea;
    public Triangle()
    {
       setSides(0,0,0);
       perimeter=0;
       theArea=0;
    }
    public Triangle(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }
    public void setSides(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
        calcPerimeter();
    }
    public void calcPerimeter()
    {
        double perimeter = sideA + sideB + sideC;
        calcArea(perimeter);
    }
    public void calcArea(double perimeter)
    {
        double s = perimeter / 2;
        theArea = Math.sqrt(s * ( s - sideA ) * ( s - sideB ) * ( s - sideC ) );
    }
    public void print()
    {
        System.out.println("\n" +
                           sideA + " " + sideB + " " + sideC + 
                           "\nArea == " + theArea + 
                           "\n\n");
    }
}