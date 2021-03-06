import java.util.*;

public class Utility
{
	// Static constructor
	private Utility() {
		
	}
    private static Scanner keyboard = new Scanner(System.in);

    /** This method prompts a user to enter
     *  an integer value from the keyboard. It
     *  then reads and returns the integer value  
     *  using the Scanner class's nextInt method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static int readInt(String prompt) {
    	System.out.print(prompt);
    	int value = keyboard.nextInt();
    	return value;
    }

    /** This method prompts a user to enter
     *  a double value from the keyboard. It
     *  then reads and returns the double value  
     *  using the Scanner class's nextDouble method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static double readDouble(String prompt) {
    	System.out.print(prompt);
    	double value = keyboard.nextDouble();
    	keyboard.nextLine();
    	return value;
    }

    /** This method prompts a user to enter
     *  a string from the keyboard. It then
     *  reads and returns the string using  
     *  the Scanner class's nextLine method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static String readString(String prompt)  {
    	System.out.print(prompt);
    	String value = keyboard.nextLine();
    	return value;
    }

    /** This method prints blank lines on the
     *  console window.
     *  @param num the number of lines to display
     */
    public static void blankLines(int num)
    {
    	for(int i = 0; i < num; i ++) {
    		System.out.println();
    	}
    }
}