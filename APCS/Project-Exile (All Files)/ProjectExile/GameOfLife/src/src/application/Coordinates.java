package application;


//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

public class Coordinates
{
	private int spot; //created for ease of plotting and purposes of testing
	private int coordinateX; //X coordinate
	private int coordinateY; //Y coordinate
	private String identification; //tells what type of action occurs at the coordinate 


	public Coordinates(int spot, int coordX, int coordY, String ident)
	{
		this.spot = spot; 
		coordinateX = coordX; 
		coordinateY = coordY; 
		this.identification = ident;  
	}


	//Getter Methods
	public int getSpot()
	{
		return spot; 
	}

	public int getCoordX()
	{
		return coordinateX; 
	}

	public int getCoordY()
	{
		return coordinateY; 
	}

	public String getIdentifaction()
	{
		return identification; 
	}
}
