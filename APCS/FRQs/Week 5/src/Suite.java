public abstract class Suite
{
	private int roomNumber;
	
	public Suite(int room)
	{
		roomNumber = room;
	}
	
	public abstract double getRoomRate();
	public abstract String getBedType();
	
	public String toString()
	{
		return "Room number : " + roomNumber + "\n" +
		       "Room rate   : " + getRoomRate() + "\n" +
		       "Bed type    : " + getBedType();
	}

}