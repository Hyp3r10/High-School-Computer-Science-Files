public class Paint
{
	private String paintColor;

	public Paint(String pc)
	{
		System.out.println("Paint Constructor Called");
		paintColor = pc;
	}

	public String getPaintColor()
	{
		return paintColor;
	}
}