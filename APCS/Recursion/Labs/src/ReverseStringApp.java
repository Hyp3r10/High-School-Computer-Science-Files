import java.util.*;

public class ReverseStringApp
{
    public static void main(String[] args)
    {
        ReverseStringTester cd = new ReverseStringTester();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String s = keyboard.nextLine();
        
        System.out.println(cd.reverseString(s, s.length()-1));
    }
}

class ReverseStringTester
{
   /**
    * @param s the string to be reversed
    * @param index is equal to s.length() - 1
    * @return String s in reverse order
    */
    public String reverseString(String s, int index)
    {
    	if(index == 0) {
    		return s.substring(index, index+1);
    	}
    	else {
    		return s.substring(index, index+1) + reverseString(s, index-1);
    	}
    }
}