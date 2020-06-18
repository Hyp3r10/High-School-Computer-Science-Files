import java.util.Scanner;

public class BirthdayManager {
	// instance variables
	private Birthday[] birthdays;
	private int numBirthdays;
	//Methods
	public void addBirthdays() {
	    Scanner keyboard = new Scanner(System.in);
	    birthdays = new Birthday[50];
	    int len = birthdays.length;
	    String response = "";
	    
	    System.out.println("************************");
	    System.out.println("*     addBirthdays     *");
	    System.out.println("************************");  
	    
	    do {
	        System.out.print("Enter name --> ");
	        String name = keyboard.nextLine();
	        System.out.print("Enter Bday --> ");
	        String bDay = keyboard.nextLine();
	        
	        birthdays[numBirthdays] = new Birthday(name, bDay);
	        	
	        numBirthdays++;
	        	
	        System.out.print("\nEnter another birthday? <y/n> :: ");
	        response = keyboard.nextLine();
	        	
	        System.out.println();
	    } while(numBirthdays < len && response.equalsIgnoreCase("y"));
	        keyboard.close();
	}
	public void printBirthdays() {
	    System.out.println("\n************************");
	    System.out.println("*    printBirthdays    *");
	    System.out.println("************************"); 
	    for(int i = 0; i < numBirthdays; i++) {
	    	System.out.println(birthdays[i] + "\n");
	    }
	}
	public static void main(String[] args) {
	    BirthdayManager app = new BirthdayManager();
	    app.addBirthdays();
	    app.printBirthdays();
	}
}
