
public class Consumeable
{
	private String name;
	private String effect;
	private int amount;
	private int heal;
	
	public Consumeable()
	{
		
	}
	
	public Consumeable(String n, String e, int a, int h)
	{
		name = n;
		effect = e;
		amount = a;
		heal = h;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEffect()
	{
		return effect;
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
	
	public int getHeal()
	{
		return heal;
	}
}
