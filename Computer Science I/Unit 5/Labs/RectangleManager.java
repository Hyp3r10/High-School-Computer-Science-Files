import java.util.*;

public class RectangleManager
{
   // instance variables
   private MyRectangle rect;
   private Scanner keyboard;

   public RectangleManager()
   {
      keyboard = new Scanner(System.in);
      rect = null;
   }
   public void inputDimensions()
   {
       System.out.print("Enter the Length :: ");
       int len = keyboard.nextInt();
       System.out.print("Enter the Width :: ");
       int wid = keyboard.nextInt();
       
       rect = new MyRectangle(len, wid);
   }
   public void changeDimensions()
   {
       System.out.print("Enter the Length :: ");
       int len = keyboard.nextInt();
       System.out.print("Enter the Width :: ");
       int wid = keyboard.nextInt();
       
       rect.setLength(len);
       rect.setWidth(wid);
   }
   public void print()
   {
       System.out.println(rect.toString());
   }
   public static void main(String[] args)
   {
       RectangleManager app = new RectangleManager();

       System.out.println("*************************************");
       System.out.println("  Test Constructor and Input Method");
       System.out.println("*************************************");
       app.inputDimensions();
       app.print();

       System.out.println("************************");
       System.out.println("  Test Mutator Method");
       System.out.println("************************");
       app.changeDimensions();
       app.print();
   }
}