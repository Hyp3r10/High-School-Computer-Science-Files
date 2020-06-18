import java.util.*;

public class Nested
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int rows = 0;
        
        System.out.print("Enter number of rows -->");
        rows = keyboard.nextInt();
        
        /*************
         * Example 1 *
         *************/
        for(int r = 1; r <= rows; r++)      // outer
        {
            for(int c = 1; c <= rows; c++)  // inner
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        /*************
         * Example 2 *
         *************/
        for(int r = 1; r <= rows; r++)      // outer
        {
            for(int c = 1; c <= r; c++)  // inner
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        /*************
         * Example 3 *
         *************/
        for(int r = 1; r <= rows; r++)      // outer 
        {
            for(int c = rows; c >= 1; c--)  // inner
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        /*************
         * Example 4 *
         *************/
        for(int r = 1; r <= rows; r++)      // outer
        {
            for(int c = rows; c >= r; c--)  // inner
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
  