import java.util.*;
public class BoxWords {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the word you want to make into a box :: ");
        String word = scan.nextLine();
        
        int wordLength = word.length()-1;
        int spaceLength = word.length()-3;
        
        int substr1 = 1;
        int substr2 = 2;
        int substr3 = wordLength-1;
        
        System.out.println("\n" + word);
        if(wordLength >= 2) {
            for(int i = 0; i <= word.length()-3; i++) {
                System.out.print(word.substring(substr1, substr2));
                for(int k = 0; k <= spaceLength; k++) {
                    System.out.print(" ");
                }
                System.out.print(word.charAt(substr3));
                if(i == spaceLength) {
                    substr3 = wordLength;
                    System.out.println("");
                    for(int count = 1; count <= word.length(); count++) {
                        System.out.print(word.charAt(substr3));
                        substr3--;
                    }
                }
                substr1++;
                substr2++;
                substr3--;
                System.out.println("");
            }
        }
    }
}
