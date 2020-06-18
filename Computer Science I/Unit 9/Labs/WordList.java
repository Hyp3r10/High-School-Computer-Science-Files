import java.util.*;
public class WordList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 words");
        System.out.println("--------------");
        String[] words = new String[10];
        for(int i = 0; i < words.length; i++) {
            System.out.print("Enter word " + (i + 1) + " :: ");
            words[i] = scan.nextLine();
        }
        System.out.println();
        for(int g = 0; g < words.length; g++) {
            System.out.println(words[g]);
        }
    }
}