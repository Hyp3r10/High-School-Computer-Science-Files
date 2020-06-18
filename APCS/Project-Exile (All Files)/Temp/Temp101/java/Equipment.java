
public class Equipment
{
	private String name;
	private String effect;
	private String type;
	private int amount;
	private int value;
	
	public Equipment()
	{
		
	}
	
	public Equipment(String n, String e, String t, int a, int v)
	{
		name = n;
		effect = e;
		type = t;
		amount = a;
		value = v;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEffect()
	{
		return effect;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public void reduceAmount()
	{
		amount--;
	}
	
	public void addAmount()
	{
		amount++;
	}
	
	public int getValue()
	{
		return value;
	}
}
