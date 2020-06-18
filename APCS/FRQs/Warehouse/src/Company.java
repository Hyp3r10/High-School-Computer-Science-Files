import java.util.*;

public class Company
{
	public Company()
	{
		Warehouse warehouse = new Warehouse();
		
		GregorianCalendar calendar = new GregorianCalendar(2007, 1, 10);
		Date entryDate = calendar.getTime();
		warehouse.addItem(new NonPerishable(entryDate, 25.00));
		
		calendar = new GregorianCalendar(2007, 3, 12);
		entryDate = calendar.getTime();
		warehouse.addItem(new NonPerishable(entryDate, 49.99));
		
		calendar = new GregorianCalendar(2007, 3, 17);
		entryDate = calendar.getTime();
		calendar = new GregorianCalendar(2007, 3, 10);
		Date expireDate = calendar.getTime();
		warehouse.addItem(new Perishable(entryDate, 3.99, expireDate));
		
		calendar = new GregorianCalendar(2007, 6, 10);
		entryDate = calendar.getTime();
		calendar = new GregorianCalendar(2007, 6, 12);
		expireDate = calendar.getTime();
		warehouse.addItem(new Perishable(entryDate, 10.00, expireDate));
		
		calendar = new GregorianCalendar(2007, 10, 31);
		entryDate = calendar.getTime();
		calendar = new GregorianCalendar(2007, 11, 20);
		expireDate = calendar.getTime();
		warehouse.addItem(new Perishable(entryDate, 6.25, expireDate));

		
		warehouse.printInventory();
	}
	
	public static void main(String[] args)
	{
		Company company = new Company();
	}
}