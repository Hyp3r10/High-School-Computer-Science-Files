package application;

//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

public class Career
{
	private String type; //name of Career
	private int salary;  //salary number 


	public Career()
	{
		type = ""; 
		salary = 0; 
	}

	public Career(String type, int salary)
	{
		this.type = type; 
		this.salary = salary; 
	}


	//Getter methods
	public String getType()
	{
		return type; 
	}

	public int getSalary()
	{
		return salary; 
	}


	public String toString()
	{
		return "You are a " + getType() + " and you earn $" + getSalary(); 
	}
}

