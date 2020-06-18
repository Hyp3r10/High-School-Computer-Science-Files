import java.util.*;
public class Patterns {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number :: ");
        int r = keyboard.nextInt();
        String output = "\n";
        for(int i = 1; i <= r; i++) {
            for(int k = 1; k <= i; k++) {
                output += "*";
            }
            output += "\n";
        }
        for(int i = 2; i <= r; i++) {
            for(int k = r; k >= i; k--) {
                output += "*";
            }
            output += "\n";
        }
        System.out.println(output);
    }
}