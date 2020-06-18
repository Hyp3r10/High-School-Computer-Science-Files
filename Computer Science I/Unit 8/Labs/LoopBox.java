import java.util.*;
public class LoopBox {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        char response;
        do {
            System.out.print("Enter a number :: ");
            int size = scan.nextInt();
            String dummy = scan.nextLine();
            String output = "\n";
            for(int r = 1; r <= size; r++) {
                for(int c = size; c >= r; c--) {
                    output += "*";
                }
                for(int c = 1; c <= r; c++) {
                    output += "#";
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