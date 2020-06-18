import java.util.Scanner;
public class IESTriangleRunner
{
	public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        IESTriangle tri = new IESTriangle();

        System.out.print("Enter Side 1 --> ");
        int side1 = scan.nextInt();
        System.out.print("Enter Side 1 --> ");
        int side2 = scan.nextInt();
        System.out.print("Enter Side 1 --> ");
        int side3 = scan.nextInt();

		tri.setSides(side1,side2,side3);

        System.out.println("\nThis triangle is an " + tri.getTriangleType());
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter Side 1 --> ");
        side1 = scan.nextInt();
        System.out.print("Enter Side 1 --> ");
        side2 = scan.nextInt();
        System.out.print("Enter Side 1 --> ");
        side3 = scan.nextInt();

		tri.setSides(side1,side2,side3);

        System.out.println("\nThis triangle is an " + tri.getTriangleType());
     }
}