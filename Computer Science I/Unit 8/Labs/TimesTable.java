// NEED TO FIX, CHANGE ROW # TO BE ACCURATE

import java.util.*;
public class TimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows --> ");
        int rows = scan.nextInt();
        String output = "";
        for(int i = 1; i <= rows; i++) {
            for(int k = 1; k <= rows; k++) {
                output += (i*k) + " "; 
            }
            output += "\n";
        }
        System.out.println(output);
    }
}