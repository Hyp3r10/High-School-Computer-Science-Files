/**
 * This program shows very bad programing style by combining various
 * shortcust in one statement. DO NOT DO THIS! 
 */

public class Operators108
{
    public static void main (String[] args)
    {
        int x = 10;
        System.out.println("Before: " + x);
        
        x += ++x + x++;
        System.out.println("After: " + x);
    }
}
