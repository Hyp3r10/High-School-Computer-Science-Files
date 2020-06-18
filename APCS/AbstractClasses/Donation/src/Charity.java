import java.util.*;

public class Charity
{
	private ArrayList <Donation> list;
	
	public Charity()
	{
	   list = new ArrayList <Donation> ();
	   getDonations();
	   printSummary();
	}
	
	public void getDonations()
	{
		Scanner keyboard = new Scanner(System.in);
		String sel = "y";
		Donation donation=null;
		do
		{
			System.out.print("Enter donor name -->");
			String name = keyboard.nextLine();
			System.out.print("Enter donation amount ($100, $500, $1000) --> $");
			double amount = keyboard.nextDouble();
			
			if(amount == 100)
			   donation = new Silver(name);
			if(amount == 500)
			   donation = new Gold(name);
			if(amount == 1000)
			   donation = new Platinum(name);
			   
			list.add(donation);
			
			System.out.println();
			System.out.print("Enter Another [Y/N]? ");
			sel = keyboard.nextLine();
			sel = keyboard.nextLine();
			System.out.println();
		}
		while(sel.equalsIgnoreCase("y"));
	}
	
	public void printSummary()
	{
		System.out.println();
		System.out.println("Summary of Donations");
		System.out.println("====================");
		for(Donation donation : list)
		{
			System.out.println(donation);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		Charity charity = new Charity();
	}
}