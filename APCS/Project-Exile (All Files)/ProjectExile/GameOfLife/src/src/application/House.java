package application;

//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

public class House 
{
	private String type; //name of House
	private double cost; //cost of House
	private String description; //image name 

	public House(String type, double cost, String description)
	{
		this.type = type; 
		this.cost = cost; 
		this.description = description; 
	}

	//Getter Methods 
	public String getType()
	{
		return type; 
	}

	public double getCost()
	{
		return cost; 
	}

	public String getDescription()
	{
		return description; 
	}

	@Override
	public String toString()
	{
		return "\nType: " + getType() + "\nCost: " + getCost(); 
	}
}
