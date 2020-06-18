public class DepartmentStore
{
	public DepartmentStore()
	{
		DailyTransactions dailyTrans = new DailyTransactions();
		dailyTrans.addTransaction(new Transaction("shoes", 1, 70.00));
		dailyTrans.addTransaction(new Transaction("robe", 2, 40.00));
		dailyTrans.addTransaction(new Sale("shirt", 3, 20.00, .20));
		dailyTrans.addTransaction(new Sale("pants", 1, 20.00, .40));
	
		
		dailyTrans.printTransactions();
		
	}
	
	public static void main(String[] args)
	{
		DepartmentStore store = new DepartmentStore();
	}
}