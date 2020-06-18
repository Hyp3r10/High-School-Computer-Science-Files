import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Player 
{
	public String name;
	public int maxHealth;
	public int health;
	public int exp;
	public int defense;
	public int level;
	public int attack;
	public int gold;
	public int town;	
	public double critChance;
	public double critMult;
	List<Equipment> equip;
	List<Consumeable> consume;

	public Player()
	{
		
	}
	
	public Player(String n)
	{
		name = n;
		maxHealth = 15;
		health = 15;
		exp = 0;
		defense = 0;
		level = 1;
		attack = 0;
		gold = 0;
		town = 0;
		critChance = 3.0;
		critMult = 1.5;
		equip = new ArrayList<Equipment>();
		consume = new ArrayList<Consumeable>();
	}

	public Player(String n, int mH, int h, int ex, int d, int l, int at, int g, int t, int cC, int cM, ArrayList<Equipment> e, ArrayList<Consumeable> c)
	{
		name = n;
		maxHealth = mH;
		health = h;
		exp = ex;
		defense = d;
		level = l;
		attack = at;
		gold = g;
		town = t;
		critChance = cC;
		critMult = cM;
		equip = e;
		consume = c;
	}

	@JsonIgnore
	public int getAtk() 
	{
		int atk = attack;

		if((int)(Math.random()*critChance) >= 6) 
		{
			atk = (int) Math.round(attack*critMult);
		}

		return atk;
	}

	@JsonIgnore
	public int attack() 
	{
		return getAtk();
	}

	@JsonIgnore
	public String dead()
	{
		return "You Died!";
	}

	public int getHealth()
	{
		return health;
	}

	public int getMaxHealth()
	{
		return maxHealth;
	}

	public int getDefense()
	{
		return defense;
	}

	public void attacked(int damage) 
	{
		int dmg = (damage - defense);

		if (dmg <= 0)
			dmg = 0;

		health -= dmg;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setHealth(int health) 
	{
		this.health = health;
	}

	public void setExp(int exp) 
	{
		this.exp = exp;
	}

	public void setDefense(int defense)
	{
		this.defense = defense;
	}

	public void setLevel(int level) 
	{
		this.level = level;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public void setCritChance(double critChance)
	{
		this.critChance = critChance;
	}

	public void setCritMult(double critMult)
	{
		this.critMult = critMult;
	}
	
	//Inventory System
	public void printConsume()
	{
		for(int i = 0; i < consume.size(); i++)
		{
			System.out.println("\n" + (i+1) + ". " + consume.get(i).getName() + ":" + consume.get(i).getAmount());
		}
	}

	public void printEquip()
	{
		for(int i = 0; i < equip.size(); i++)
		{
			System.out.println("\n" + (i+1) + ". " + equip.get(i).getName() + ":" + equip.get(i).getAmount());
		}
	}
	
	public void printGold()
	{
		System.out.println("You have " + gold + " gold.");
	}

	public void addConsume(Consumeable cons)
	{
		boolean inList = false;
		int count = 0;

		if(consume.size() <= 0)
			consume.add(cons);

		else {
			for(Consumeable con : consume)
			{
				if(con.getName().equals(cons.getName()))
				{
					inList = true;
				}
				count++;
			}

			if(inList)
				consume.get(count-1).addAmount();
			else
				consume.add(cons);
		}

	}

	public List<Consumeable> getConsume()
	{
		return consume;
	}

	public void addEquip(Equipment equi)
	{
		boolean inList = false;
		int count = 0;

		if(equip.size() <= 0)
			equip.add(equi);

		else {
			for(Equipment con : equip)
			{
				if(con.getName().equals(equi.getName()))
				{
					inList = true;
				}
				count++;
			}

			if(inList)
				equip.get(count-1).addAmount();
			else
				equip.add(equi);
		}

	}
	
	public List<Equipment> getEquip()
	{
		return equip;
	}

	public void equip(int x)
	{
		int i = x-1;

		if(equip.get(i).getType().equals("armor"))
			setDefense(equip.get(i).getValue());

		if(equip.get(i).getType().equals("weapon"))
			setAttack(equip.get(i).getValue());
	}

	public void heal(int x)
	{
		int i = x-1;

		setHealth(getHealth() + consume.get(i).getHeal());

		if(getHealth() > getMaxHealth())
			setHealth(getMaxHealth());

		consume.get(i).reduceAmount();
		if(consume.get(i).getAmount() <= 0)
			consume.remove(i);
	}
	
	public void addGold(int g)
	{
		gold += g;
	}
}