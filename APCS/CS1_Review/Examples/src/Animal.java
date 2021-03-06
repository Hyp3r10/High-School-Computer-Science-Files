/**
 * This class is a review of
 * computer science 1 topics and concepts.
 * @author sm10095178
 *
 */
import java.util.Scanner;
// A class defines the attributes (fields) and capabilities (methods) of a real world object
public class Animal {	
	// final means that this value can't be changed
	public final double FAVNUMBER = 1.6180; // Not using "private" on ALL instance (AKA global) variables will loose you points on the AP test

	// Variables (Fields) start with a letter, underscore or $
	// Private fields can only be accessed by other methods in the class

	// Strings are objects that hold a series of characters
	private String name; //Java will set the String to the String default value of "null"
	
	// An integer can hold values from -2 ^ 31 to (2 ^ 31) -1
	private int weight = 19; // Default is '0'

	// Booleans have a value of true or false
	private boolean hasOwner = false; // Default value is "false"

	// Bytes can hold the values between -128 to 127
	private byte age = 1; // Default is '0'

	// Longs can hold the values between -2 ^ 63 to (2 ^ 63) - 1
	private long uniqueID; 

	// Chars are unsigned ints that represent UTF-16 codes from 0 to 65,535
	/* Character vales to memorize 
	 * 65 == A
	 * 97 == a
	 * 48 == 0
	 */
	private char favoriteChar; // Default is ' '

	// Doubles are 64 bit IEEE 754 floating points with decimal values
	private double speed = 3.5; // Default is '0.0'

	// Floats are 32 bit IEEE 754 floating points with decimal values
	private float height = 3.5f;

	// A Scanner object allows you to accept user input from the keyboard
	private Scanner userInput = new Scanner(System.in);
	
	// Constructors initialize instance variables
	public Animal() {
		System.out.println("Constructor Called");
		// Shorthand for age = age + 1; ++ increment / -- decrement
		System.out.println("Age :: " + age++); // Post-fix
		System.out.println("Age :: " + age);
		System.out.println("Age :: " + ++age); // Pre-fix
		System.out.println("Age :: " + age);
		age *= 2; // +=, -=, *=, /=, %=
		System.out.println("Age :: " + age);
		
		/*  Escape sequences
		\t	Inserts a tab in the text at this point.
		\b	Inserts a backspace in the text at this point.
		\n	Inserts a newline in the text at this point.
		\r	Inserts a carriage return in the text at this point.
		\'	Inserts a single quote character in the text at this point.
		\"	Inserts a double quote character in the text at this point.
		\\	Inserts a backslash character in the text at this point.
		*/
		
		System.out.print("\nEnter the name \\ or other \"identifier\" :: ");
		name = userInput.nextLine();
		
		setUniqueID(193574); // Do not need to use the "pet" title, because it is in the same class, and not static
		System.out.println("Unique ID set to :: " + getUniqueID());
		
		setUniqueID(); // Do not need to use the "pet" title, because it is in the same class, and not static
		System.out.println("Unique ID set to :: " + getUniqueID());
	}
	/** 
	 * It is best practice to use accessor (getter) methods and 
	 * mutators (setter) methods so that you can protect your data
	 */
	public String getName() { // Acessor Method (getter)
		return name;
	}
	public void setName(String n) {
		name = n; 
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight; // Use "this." to reference the global variable
	}
	public boolean getHasOwner() {
		return hasOwner;
	}
	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public long getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(long ID) {
		uniqueID = ID;
	}
	// Method overloading allows you to accept different input with the same method name
	public void setUniqueID() {
		uniqueID = (long) 42.9; // Type casting will truncate the decimal
	}
	public char getFavoriteChar() {
		return favoriteChar;
	}
	public void setFavoriteChar() {
		// Math.random() == [0,1)
		// range == largest# - smallest# + 1
		// int randomNumber = (int)(Math.random() * range) + smallest)
		
		/* Logical operators
		/ ! : Converts the boolean value to its right to its opposite form ie. true to false
		/ & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
		/ && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
		/ | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
		/ || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
		/ ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
		*/
		
		int randomNumber = ((int) (Math.random() *117) + 10);
		favoriteChar = (char) randomNumber;
		if((randomNumber >= 97 && randomNumber <= 122)||(randomNumber >= 65 && randomNumber <= 90)) {
			System.out.println("Favorite character is a letter" + 
							 "\nIt could be either uppercase or lowercase.");
		}
		if(randomNumber == 32) {
			System.out.println("Favorite character set to <space>");	
		}	
		else if(favoriteChar == 10) {
			System.out.println("Favorite character set to <new line>");	
		}
		else if(randomNumber >= 97 && randomNumber <= 122) {
			System.out.println("Favorite chararcter is a lowercase letter.");
		}
		else {
			System.out.println("Favorite character is not a letter");
		}
		System.out.println("I turned false to :: " + !false);
	}
	public void doMath()
	{
		System.out.println("\nDoing Math:");
		
		// Local variable
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		int mulOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + mulOfNumbers);
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		int divOfNumbers = 5 / 1; // Will give us a truncated int
		System.out.println("5 / 1 = " + divOfNumbers);
		
		double divOfNumbersD = 5 / 2; // Truncated then converted to double 5/2 -> 2 -> 2.0
		System.out.println("5 / 2 = " + divOfNumbersD);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);
	}
	@Override // Shows your overwriting and existing method. Can only override methods that already exists
	public String toString() { // Anything can go here
//		return "" + "\nName :: " + getName() +
//		"\nAge :: " + getAge() + 
//		"\nWeight :: " + getWeight();
 
		// or 
		
		String output = "";
		output += "\nName :: " + getName();
		output += "\nAge :: " + getAge();
		output += "\nWeight :: " + getWeight();
		output += "\nHas Owner :: " + getHasOwner();
		output += "\nUnique ID :: " + getUniqueID();
		output += "\nFavorite Character :: " + getFavoriteChar();
		
		return output;
		}
	
		

	/** 
	 * public allows other classes to use this method
	 * static means that only a class can call for this to execute
	 * void means it doesn't return a value when it finishes executing
	 * This method can except Strings that can be stored in the String array args when it is executed
	 */
	public static void main(String[] args)
	{
		Animal pet = new Animal();
		// Return method calls are included within another command
		System.out.println("Pet name :: " + pet.getName()); // Must use object identifier when calling from main or another class
		System.out.println("Changing pet name to :: \'Leroy\'.");
		pet.setName("Leroy"); // Void method calls stand alone. Cannot be apart of another command.
		System.out.println("Pet name changed to :: " + pet.getName());
		pet.doMath();
		pet.setFavoriteChar();
		System.out.println(pet);
	}

}