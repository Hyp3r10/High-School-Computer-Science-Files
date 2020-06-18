import java.util.*;

public class Kennel {
    // instance variable
    private Dog[] dogs;     // declare array variable
    private int len;
    // constructor
    public Kennel() {
        dogs = new Dog[5];  // instantiate array with length 5
    }
    /* This method allows a user input information about 5 dogs and
     * stores this information in the array dogs.
     */
    public void addDogs() {
        Scanner keyboard = new Scanner(System.in);
        dogs = new Dog[5];
        len = dogs.length;
        
        System.out.println("************************");
        System.out.println("*       addDogs        *");
        System.out.println("************************");        
        
        for(int i = 0; i < len; i++) {
        	System.out.print("Enter dog name --> ");
        	String name = keyboard.nextLine();
        	System.out.print("Enter dog breed --> ");
        	String breed = keyboard.nextLine();
        	
        	dogs[i] = new Dog(name, breed);
        	
        	System.out.println();
        	
        }
        keyboard.close();
    }
    /* This method displays the name and breed for each Dog in the array.
     */
    public void printDogs() {
    	System.out.println("************************");
        System.out.println("*      printDogs       *");
        System.out.println("************************");       
    	
    	for(int i = 0; i < len; i++) {
    		System.out.println(dogs[i]);
    	}
    }
    public static void main(String[] args) {
        Kennel app = new Kennel();
        app.addDogs();
        app.printDogs();
    }
}