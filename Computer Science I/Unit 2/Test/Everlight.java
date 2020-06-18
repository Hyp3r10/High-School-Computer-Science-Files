import java.util.ArrayList;
import java.util.Scanner;

/**
 * Holds the main method, which includes the introduction and creates a Trezoran object.
 * Includes methods and objects that deal with the inventory.
 * Also includes methods and variables that deal with commands input by the user.
 */
public class Everlight
{
	public static Scanner scan;
	public static ArrayList<InventoryBoxes> inv; //The array of InventoryBoxes is used to access specific inventory slots and print the whole inventory.
	private static String input; //Holds the unaltered input from the user.
	private static String output; //Holds the representation of an input that is recognized by Words.
	public static Stats stats; //Creates the object that holds the statistics of the player.
    
    public Everlight()
    {
        inv=new ArrayList<InventoryBoxes>();
        scan=new Scanner(System.in);
		input="";
		output="";
		stats=new Stats();
    }
    
    public static void main(String[]args)
    {
        Everlight everlight=new Everlight();
        System.out.println("\"Home is behind, the world ahead,\n"
				 + "and there are many paths to tread\n"
				 + "through shadows to the edge of night,\n"
				 + "until the stars are all alight.\"\n\n");

		System.out.println("\n---------------------------------\n");
		
		
		System.out.println("\nYou now enter the world of Everlight.");
		System.out.println("This world is filled with magic and mystery, not necessarily in that order.");         
		System.out.println("\nYou find yourself in your hometown, Trezoran. It is evening. You head back to your house from your daily toils.");        
		System.out.println("The light from your oil lamp illuminates a ring of gravel path around you. Tiny beasts of the night scurry away from the light.");


		Trezoran trezorant=new Trezoran();
    }
    
    /**
     * Determines whether or not an item is in the inventory.
     * 
     * @param item	The name of the item specified.
     * @return		True if the item is in the ArrayList "inv"; false otherwise.
     */
    public static boolean hasItem(String item)
	{
		for(int i = 0; i < inv.size(); i++)
		{
			if(inv.get(i).getName().equalsIgnoreCase(item))
			{
				return true;
			}
		}
		
		return false;
	}
    
    /**
     * Removes an item from the inventory.
     * 
     * @param item	The name of the item specified.
     */
    public static void removeItem(String item)
	{
		for(int i = 0; i < inv.size(); i++)
		{
			if(inv.get(i).getName().equalsIgnoreCase(item))
			{
				inv.remove(i);
			}
		}
	}
    
    /**
     * Prompts the user for input.
     * Then sends the input to determineWords() to check if is acceptable.
     * Then runs through a switch statement with the universally-accepted commands.
     * After this method is called, a class' execute() method is called (not in Everlight).
     */
    public static void prompt()
	{
		System.out.print("> ");
		input=scan.nextLine();
		output=Words.determineWords(input);
		
		switch(output)
		{
			case "0":
			{
				System.out.println("\n And as if God himself whispered into your ear, you instantly knew the commanmds to use.");
				System.out.println("--------------------------");
				System.out.println("INVENTORY or I: access the items you have collected.\n"
						+ "You may hold any amount of items at a time.");
				System.out.println("TAKE or GRAB or PICK UP: put an item into your inventory.");
				System.out.println("LOOK or LOOK AT or INSPECT or CHECK:\n"
						+ "gives a description of the general area, or an item if specified.");
				System.out.println("GO or GO TO or MOVE or MOVE TO: move to a place specified.\n");
				System.out.println("Please use only four words in a command.");
				System.out.println("Please do not use THE in any commands.");
				prompt();
				break;
			}
			case "5":
			{
				System.out.println("Please include where you are going.");
				prompt();
				break;
			}
			case "5j":
			{
				System.out.println("Please include where you are going.");
				prompt();
				break;
			}
			case "1":
			{
				System.out.println("Please include what you are taking.");
				prompt();
				break;
			}
			case "1k":
			{
				System.out.println("Please include what you are taking.");
				prompt();
				break;
			}
			case "10":
			{
				System.out.println(inv);
				break;
			}
			case "11":
			{
				System.out.println("Please include what you are checking.");
				prompt();
				break;
			}
		}
	}
    
    /**
     * Returns output, giving other classes besides Everlight access to output.
     * 
     * @return	Returns the variable output, the representation of an input that is recognized by Words.
     */
    public static String getOutput()
	{
		return output;
	}
}