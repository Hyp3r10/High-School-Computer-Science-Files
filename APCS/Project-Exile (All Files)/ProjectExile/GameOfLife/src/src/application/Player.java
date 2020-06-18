package application;

//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

public class Player
{
	private String name;
	private String gender;
	private double totalMoney; 
	private int numOfChildren;
	private double salary; 
	private double costOfHouse; 
	private Career job; 


	public Player(String name, String gender)
	{
		this.name = name;
		this.gender = gender; 
		totalMoney = 200000; 
		numOfChildren = 0; 
		salary = 0; 
		costOfHouse = 0; 
		job = new Career(); 
	}

	//Getter Methods 
	public String getName()
	{
		return name; 
	}

	public String getGender()
	{
		return gender; 
	}

	public int getNumOfChildren()
	{
		return numOfChildren;
	}


	public double getSalary()
	{
		return salary; 
	}

	public double getCostOfHouse()
	{
		return costOfHouse; 
	}

	public double getTotalMoney()
	{
		return totalMoney; 
	}

	public String getCareer()
	{
		return job.toString(); 
	}

	//Setter Methods
	public void setCostOfHouse(double cost)
	{
		costOfHouse = cost; 
	}


	public void setSalary(int sal)
	{
		salary = sal; 
	}

	public void setCareer(Career job)
	{
		this.job = job; 
	}


	//Changer Methods
	public void subtractMoney(double money)
	{
		totalMoney -= money; 
	}

	public void addMoney(double money)
	{
		totalMoney += money; 
	}

	public void addChildren(int numBaby)
	{
		numOfChildren += numBaby;
	}


}
