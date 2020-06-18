import java.util.*;

public class DailyTransactions
{
	// instance variables
	private ArrayList <Transaction> allTransactions;  // contains all transactions in a single day

	                                        
	public DailyTransactions()
	{
		allTransactions = new ArrayList <Transaction> ();
	}
	
	public void addTransaction(Transaction transaction)
	{
		allTransactions.add(transaction);
	}

	public void printTransactions()
	{
		for(Transaction t : allTransactions)
		{
		   System.out.println(t);
		   System.out.println();
		}
	}
}