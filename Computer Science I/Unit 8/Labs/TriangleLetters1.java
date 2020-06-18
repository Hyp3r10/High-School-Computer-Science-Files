import java.util.*;
public class TriangleLetters1 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        char response;
        do {
            System.out.print("Enter the size of the triangle :: ");
            int size = scan.nextInt();
            
            System.out.print("Enter a letter :: ");
            String dummy = scan.nextLine();
            char letter = scan.nextLine().charAt(0);
            
            String output = "\n";
            for(int r = 1; r <= size; r++) {
                for(int c = 1; c <= r; c++) {
                    output += letter;
                }
                output += "\n";
            }
            System.out.println(output);
            
            output = "\n";
            
            System.out.print("Do you want to enter more data <y/n>? ");
            response = scan.nextLine().charAt(0);
            
            System.out.println("\n");
        }while(response == 'y');
    }
}