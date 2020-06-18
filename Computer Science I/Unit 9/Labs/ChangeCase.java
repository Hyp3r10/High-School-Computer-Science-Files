import java.util.*;
public class ChangeCase {
    // instance variables
    private String[] words = new String[50];  // array's physical size
    private int size = 0;                     // array's logical size
    private Scanner keyboard = new Scanner(System.in);
    /** Reads strings input from the keyboard and stores them in the array words.
      * Input continues until the user types "stop".
      * The logical size of the array is. incremented each time a new string
      * is added to the array.
      */
    public void readWords(){
        String str = "";
        for(int i = 0; i != 49; i++) {
            System.out.print("Word " + (i + 1) + " :: ");
            str = keyboard.nextLine();
            if(!str.equals("stop")) {
                words[i] = str; // size = logical size of the array
            }
            else if(str.equals("stop")) {
                size = i;
                i = 48;
            }
        }
    }
    /** Prints each word in the array three times. Once in its original form,
      * once in all capital letters, and once in all lowercase letters.
      */
    public void printWords() {
        String str = "";
        for(int index = 0; index < size; index++){
            str = words[index];
            System.out.print("\n" + str + " ");
            System.out.print(str.toUpperCase() + " ");
            System.out.print(str.toLowerCase());
        }
    }
    public static void main(String[] args) {
        ChangeCase app = new ChangeCase();
        System.out.println("Type \"stop\" to stop entering words");
        System.out.println("----------------------------------\n");
        app.readWords();
        app.printWords();
    }
}