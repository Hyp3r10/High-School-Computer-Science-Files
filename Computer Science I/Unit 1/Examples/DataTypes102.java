// This program hows that there is a memory storage limitation to double and float data types.

public class DataTypes102
{
    public static void main(String[] args)
    {
      double num1 = 1.012345;
      double num2 = 1.0123456789;
      double num3 = 1.01234567890123456789;
      float num4 = 1.01234567890123456789f;
      
      System.out.println("num1 " + num1);
      System.out.println("num2 " + num2);
      System.out.println("num3 " + num3);
      System.out.println("num4 " + num4);
      
    }
}