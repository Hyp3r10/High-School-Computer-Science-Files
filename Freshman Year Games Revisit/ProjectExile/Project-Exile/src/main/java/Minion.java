public class Minion {
    private String name;
    private int defense;
    private int baseAttack;
    private double critMultiplier;
    private int health;
    private int critChance;
    private Equipment itemLoot;
    private Consumeable consumLoot;
    private Player player;

    public static void main(String[] args) 
    {
        playMusic();
    }

    public Minion(String n, int d, int bA, int cM, int h, int cC, Equipment e, Consumeable c, Player p) 
    {
        name = n;
        defense = d;
        baseAttack = bA;
        critMultiplier = cM;
        health = h;
        critChance = cC;
        player = p;
        consumLoot = c;
        itemLoot = e;
    }

    public String getName()
    {
        return name;
    }
    
    public int getDefense()
    {
        return defense;
    }

    public int getHealth()
    {
        return health;
    }

    public int getAtk() 
    {
        int atk = baseAttack;

        if((int)(Math.random()*critChance) >= 6) 
        {
            atk = (int) Math.round(baseAttack*critMultiplier);
        }

        return atk;
    }

    public String getLoot() 
    {
    	int rand = (int) (Math.random()*100)+1;
    	int g = (int) (Math.random()*4)+1;
    	
    	player.addGold(g);
    	System.out.println("The monster dropped " + g + " gold!");
    	
    	if(rand <= 30)
    	{
    		player.addEquip(itemLoot);
    		return "The " + name + " dropped a " + itemLoot.getName();
    	}
    		
    	else if(rand <= 70)
    	{
    		player.addConsume(consumLoot);
    		return "The " + name + " dropped a " + consumLoot.getName();
    	}
    		
    	else
    		return "The " + name + " dropped nothing.";
    }
    
    public int attack() 
    {
        return getAtk();
    }

    public void attacked(int damage) 
    {
        int dmg = (damage - defense);
        
        if (dmg <= 0)
            dmg = 0;
        
        health -= dmg;
    }
    public String died() 
    {
        return "dead";
    }

    public static void playMusic() 
    {
    }
}