//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;
import java.util.Scanner;
public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner scan = new Scanner(System.in);
	   String response;
	   String word1;
	   String word2;
	   
	   do {
		   System.out.print("Enter the first word you want to compare :: ");
		   word1 = scan.nextLine();
		   System.out.print("Enter the second word you want to compare :: ");
		   word2 = scan.nextLine();
		   
		   System.out.println();
		   
		   WordsCompare testOne = new WordsCompare(word1, word2);
		   System.out.println(testOne);
		   
		   System.out.print("Do you want to enter another response? <y/n> :: ");
		   response = scan.nextLine();
		   
		   System.out.println();
	   } while(response.equalsIgnoreCase("y"));
	   scan.close();
	}
}