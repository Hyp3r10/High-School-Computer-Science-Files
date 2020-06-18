import java.util.*;
public class LettersAndNumbers {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a letter (Capital Please):: ");
        char letter = scan.nextLine().charAt(0);
        char letterSub = letter;
        System.out.print("Please enter a number :: ");
        int row = scan.nextInt();
        int count = row;
        
        
        String output = "\n";
        // number of rows
        for(int r = row; r >= 1; r--) { //number of rows
            output += "\n";
            for(int c = r; c >= 1; c--) {
                for(int w = count; w >= 1; w--) {
                    output += letter;
                }
                output += " ";
                letter++;
                if(letter >= 90) {
                    letter = 65;
                }
                count--;
            }
            letter = letterSub;
            count = row;
        }
        System.out.println(output);
    }
}