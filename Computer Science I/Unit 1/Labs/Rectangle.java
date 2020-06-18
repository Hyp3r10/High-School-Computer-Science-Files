import java.util.Scanner;

public class Rectangle
{
    public static void main (String[] args)
    {
        Scanner square = new Scanner (System.in);
        
        int length, width, perimiter, area;
        
        System.out.print("Enter the Length --> ");
        length = square.nextInt();
        System.out.print("Enter the Width --> ");
        width = square.nextInt();
        
        perimiter = (2*(length)) + (2*(width));
        area = length * width;
        
        System.out.println("\nPerimiter = " + perimiter);
        System.out.println("Area = " + area);
    }
}