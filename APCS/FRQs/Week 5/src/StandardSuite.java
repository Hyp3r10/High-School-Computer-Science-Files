public class StandardSuite extends Suite
{
	public StandardSuite(int room)
	{
		super(room);
	}

	public double getRoomRate()
	{
		return 80.00;
	}

	public String getBedType()
	{
		return "Queen";
	}
}