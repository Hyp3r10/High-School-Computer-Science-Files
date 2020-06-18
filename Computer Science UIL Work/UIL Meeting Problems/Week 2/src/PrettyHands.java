import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class PrettyHands 
{
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("prettyhands.txt"));
		int times = scan.nextInt();
		ArrayList<String> royalty = new ArrayList<String>(); // Array With the fancy cards
		royalty.add("Ace"); royalty.add("Jack"); royalty.add("Queen"); royalty.add("King");
		
		ArrayList<String> red = new ArrayList<String>();
		red.add("Hearts"); red.add("Diamonds"); //ArrayList with all of the Red Cards
		
		for(int i = 0; i < times; i++)
		{
			int num = scan.nextInt();
			scan.nextLine(); 
			int x = 0;
			int fancy = 0;
			int r = 0;
			while(x < num)
			{
				String rank = scan.next(); 
				scan.next(); // clears the "of"
				String suit = scan.next();
				
				if(royalty.indexOf(rank) > -1)
					fancy++; //If its fancy,it it "pretty"
				
				else if(red.indexOf(suit) > -1)
					r++; //If its not fancy, but it red, its "pretty
				
				x ++;
			}
			
			if(r == num || fancy == num) //If they are ALL red or ALL Fancy, it is pretty
				System.out.println("PRETTY");
			else
				System.out.println("NOT PRETTY");
		}
		
	}
}
