// Enhanced For Loop and other array printing options
import java.util.Arrays;
public class Arrays105 {
    /**
      * Enhanced for loop (AKA "for each loop")
      * 1. Data type (String)
      * 2. Element variable (name)
      * 3. Array's name or other Data Structure (naems)
      
      * Steps to use a toString method
      * 1. Import java.util.Arrays;
      */
    public static void main(String[] args) { 
        String[] names = new String[5];
        int len = names.length;
        names[0] = "Ladno Calrisian";
        names[1] = "Dylen the Hutt";
        names[2] = "Jermy Binks";
        names[3] = "Hass(an) Solo";
        names[4] = "Darth Tim";
        //Basic 'for' loop
        System.out.println("Basic 'for' loop");
        for(int i = 0; i < len; i++) {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        //Enhanced 'for' loop"
        System.out.println("\nEnhanced 'for' loop");
        for(String name : names) {
            System.out.print(name + ", "); // name == names[i];
        }
        System.out.println();
        
        //Directly Printing Array
        System.out.println("\nDirectly Printing Array (Memory Location)");
        System.out.println(names);
        System.out.println();
        
        //toString
        System.out.println(Arrays.toString(names));
    }
}