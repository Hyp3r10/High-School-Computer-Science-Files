public class Employee
{
	// instance variables
	private int age;
	private int yearsOnJob;
	private double salary;
	private int id;
	
	public Employee(int a, int y, double s, int i)
	{
	   age = a;
	   yearsOnJob = y;
	   salary = s;
	   id = i;	
	}
	
	public int getAge()
	{
		return age;
	}
	public int getYearsOnJob()
	{
		return yearsOnJob;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getID()
	{
		return id;
	}
	
	public String toString()
	{
		return  age + " " + yearsOnJob + " " + salary + " " + id;
	}
}