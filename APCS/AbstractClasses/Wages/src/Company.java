import java.util.*;

public class Company
{
	private ArrayList <Employee> roster;
	private Scanner keyboard;
	
	public Company()
	{
	   roster = new ArrayList<Employee>();
	   keyboard = new Scanner(System.in);
	   addEmployee();
	   printSalaries();	
	}
	
	public void addEmployee()
	{
		String ans="";
		
		do
		{
			System.out.println(" Add Employee");
			System.out.println("==============");
			System.out.println();
			System.out.println("Enter Employee Payment Type");
			System.out.println("1. Hourly");
			System.out.println("2. Salary");
			System.out.println();
			System.out.print("Make Selection -->");
			int sel = keyboard.nextInt();
			String dummy = keyboard.nextLine();
			System.out.println();
			System.out.print("Enter Employee Name -->");
			String name = keyboard.nextLine();
			System.out.print("Enter Employee SS#  -->");
			String ss = keyboard.nextLine();
			
			Employee employee = null;
			
			if(sel == 1)
			{
				System.out.print("Enter hourly wage -->$");
				double wage = keyboard.nextDouble();
				System.out.print("Enter hours worked for month -->");
				int hours = keyboard.nextInt();
				
				employee = new Hourly(name, ss, wage, hours);
			}
			if(sel == 2)
			{
				System.out.print("Enter yearly salary -->$");
				double salary = keyboard.nextDouble();
				employee = new Salary(name, ss, salary);
			}
			
			roster.add(employee);
			
			System.out.println();
			System.out.print("Enter another employee[y/n]?");
			ans = keyboard.nextLine();
			ans = keyboard.nextLine();
			System.out.println();
			
		}
		while(ans.equalsIgnoreCase("y"));
	}
	
	public void printSalaries()
	{
		System.out.println(" Salary Summary");
		System.out.println("================");
		for(Employee emp : roster)
		{
		    System.out.printf("Name              =  %s\n", emp.getName());
		    System.out.printf("Social Security # =  %s\n", emp.getSSNum());
		    System.out.printf("Monthly Salary    =  $%.2f\n\n", emp.getSalary());
		}
	}

	
	public static void main(String[] args)
	{
		Company company = new Company();
	}
}