import java.util.*;
public class TriangleLetters3 {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number :: ");
        int rows = keyboard.nextInt();
        
        System.out.print("Enter a Character :: ");
        String dummy = keyboard.nextLine();
        char ch1 = keyboard.nextLine().charAt(0); // Method chainning
        /**
         * Old way :: 
         * char char1 = character.charAt(0);
         * char char1 = character.charAt(0);
         */
        String output = "\n";
        for(int i = 1; i <= rows; i++) {
            for(int j = rows; j > i; j--) {
                output += " ";
            }
            for(int k = 1; k <= i; k++) {
                output += ch1;
            }
            output += "\n";
        }
        System.out.println(output);
    }
}