import java.util.*;
public class GoodBoxWords {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the word you want to make into a box :: ");
        String word = scan.nextLine();
        
        int wordLength = word.length()-1;
        
        String output = "\n" + word;
        if(wordLength >= 2) {
            for(int i = 1; i <= wordLength; i++) {
                output += "\ntest";
            }
        }
        System.out.println(output);
    }
}