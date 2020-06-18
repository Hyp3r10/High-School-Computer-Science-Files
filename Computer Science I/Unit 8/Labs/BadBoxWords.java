import java.util.*;
public class BadBoxWords {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the word you want to make into a box :: ");
        String word = scan.nextLine();
        
        int length = word.length()-1;
        int spaceLength = word.length()-3;
        char firstLetter = word.charAt(1);
        char lastLetter = word.charAt(length-1);
        String output = "\n\n";
        int count = 1;
        for(int i = 0; i <= spaceLength; i++) {
            if(i == 0) {
                output += word + "\n";
            }
            //First Letter
            for(int f = 1; f == 1; f++) {
                output += firstLetter;
            }
            firstLetter = word.charAt(count);
            //Spaces1
            for(int k = 0; k <= spaceLength; k++) {
                output += " ";
            }
            //Last Letter
            for(int p = 1; p == 1; p++) {
                output += lastLetter;
            }
            lastLetter = word.charAt((length-1)-count);
            output += "\n";
            if(i == spaceLength) {
                for(int track = length; track >= 0; track--) {
                    output += word.substring(track, track+1);
                }
            }
            count++;
        }
    
        System.out.println(output);
    }
}