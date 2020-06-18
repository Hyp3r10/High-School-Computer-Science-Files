/** 
 * This program shows "unary arithmetic shortcut notation
 * Note that "postfix" x++ "prefix" ++x do not always
 * have the same result.
 */

public class Operators106
{
    public static void main (String[] args)
    {
        int num = 10;
        System.out.println("num equals " + num);
        
        num++;
        System.out.println("num equals " + num);
        
        ++num;
        System.out.println("num equals " + num);
        
        System.out.println("num equals " + num++ + " (postfix)");
        System.out.println("num equals " + num);
        
        System.out.println("num equals " + ++num + " (prefix)");
    }
}