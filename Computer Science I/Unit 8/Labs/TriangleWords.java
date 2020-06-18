import java.util.*;
public class TriangleWords {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a word :: ");
        String word = scan.nextLine();
        int rows = word.length();
        
        int wordLength = word.length()-1;
        
        int substr1 = 1;
        int substr2 = 2;
        int substr3 = wordLength-1;
        String letter = word.substring(0,1);
        
        int insideSpaces = 1;
        
        String output = "";
        ///////////////////////////////////////////////////////////////////////////////
        output = "\n";
        for(int i = 1; i <= rows; i++)
        {
             for(int j = rows; j > i; j--) // First set of spaces
             {
                 output += " ";
             }
             if(i != rows) 
             {
                 output += letter; // Used to make the top letter
                 if(i > 1) 
                 {
                     for(int k = 0; k < insideSpaces-2; k++) // inside spaces
                     {
                         output += " ";
                     }
                     output += letter; // Used to make the second letter if applies
                 }
             }
             letter = word.substring(substr1, substr2);
             if(i == rows) // Bottom of the triangle
             {
                substr3 = wordLength;
                for(int count = 1; count < word.length(); count++) {
                    output += word.charAt(substr3);
                    substr3--;
                }
                output += word;
             }
             if(i != rows-1) 
             {
                 substr1++;
                 substr2++;
                 substr3--;
                 insideSpaces += 2;
             }
             output += "\n";
        }
        ///////////////////////////////////////////////////////////////////////////////
        System.out.println(output);
    }
}