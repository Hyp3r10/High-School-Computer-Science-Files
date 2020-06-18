/**
 * This program demosntrates how to create constant identifier values
 * with the <final> keyword.
 */

public class Constants101
{
    public static void main (String[] args)
    {
        final int INT_CONST = 100;
        final double DOUBLE_CONST = 2.81745;
        final char CHAR_CONST = 'C';
        // You cannot change the value of a constant.
            // INT_CONST++;
            // DOUBLE_CONST = 1234.4321;
            // CHAR_CONST = '#';
        
        System.out.println("INT_CONST " + INT_CONST);
        System.out.println("DOUBLE_CONST " + DOUBLE_CONST);
        System.out.println("CHAR_CONST " + CHAR_CONST);
        
        
    }
}