import java.util.Scanner;
import java.util.ArrayList;
public class Cave extends Everlight
{
	private static String c1, c2, c3, c4 = "";
	private static Scanner key = new Scanner(System.in);
	private static int countGo = 0;
	private static int countAtt = 0;
	private static int countWi = 0;
	private static int countWh = 0;
	
	public Cave()
	{
		System.out.println("CAVE:\nYou drop throguh a trapdoor into a cave. The trapdoor slams shut behind you.");
		System.out.println("An ogre stands before you. Behind him on the ground is a sharp metallic-looking sword.");
		System.out.println("You can't tell where the light that illuminates the cave is coming from.");
		prompt();
	}
	
	public static void prompt()
	{	
		System.out.print(">");
		String com = key.nextLine();
		
		if(com.indexOf(" ") != -1)
		{
			c1 = com.substring(0,com.indexOf(" "));
			com = com.substring(c1.length()+1,com.length());
		}
		else
			c1 = com;
		
		if(com.indexOf(" ") != -1)
		{
			c2 = com.substring(0,com.indexOf(" "));
			com = com.substring(c2.length()+1,com.length());
		}
		else
			c2 = com;
		
		if(com.indexOf(" ") != -1)
		{
			c3 = com.substring(0,com.indexOf(" "));
			com = com.substring(c3.length()+1,com.length());
		}
		else
			c3 = com;
		
		if(com.indexOf(" ") != -1)
		{
			c4 = com.substring(0,com.indexOf(" "));
			com = com.substring(c4.length()+1,com.length());
		}
		else
			c4 = com;
		
		execute();
		
		key.close();
	}
	
	public static void execute()
	{	
		if(c1.equalsIgnoreCase("go") || c1.equalsIgnoreCase("walk") || c1.equalsIgnoreCase("move"))
		{
			if(c2.equalsIgnoreCase("to"))
			{
				if(c3.equalsIgnoreCase("house"))
				{
					System.out.println("You walk towards the house\n");
					prompt();
				}
				else if(c3.equals("ogre"))
					System.out.println("The ogre grabs and eats you. You are dead.");
				else
				{
					System.out.print("Go where?\n");
					countAtt=0;
					countWh=0;
					countWi=0;
					countGo++;
					prompt();
				}
			}
			else
			{
				System.out.print("Go where?\n");
				countAtt=0;
				countWh=0;
				countWi=0;
				countGo++;
				prompt();
			}
		}
		else if(c1.equalsIgnoreCase("attack") || c1.equalsIgnoreCase("kill"))
		{
			if(c2.equalsIgnoreCase("ogre"))
			{
				if(c3.equalsIgnoreCase("with"))
				{
					if(c4.equalsIgnoreCase("sword"))
					{
						if(Everlight.hasItem("sword"))
						{
							System.out.println("You grab your sword and slay the ogre.\nBloody entrails cover your body and sword. Spoils of war.");
						System.out.println("With the ogre no logner standing in the way, you can see a path adhead of you. With no other way to go, you continue deep into the cave.");
						DeepCave deepCave=new DeepCave();
						}
						else 
						{
							System.out.println("You dive through the ogre's legs and grab the sword.\n");
							inv.add(new InventoryBoxes("sword"));
							prompt();
						}
					}
					else
					{
						System.out.println("With what?\n");
						countGo=0;
						countAtt=0;
						countWh=0;
						countWi++;
						prompt();
					}
				}
				else
				{
					System.out.println("With what?\n");
					countGo=0;
					countAtt=0;
					countWh=0;
					countWi++;
					prompt();
				}
			}
			else
			{
				System.out.println("Attack what?\n");
				countGo=0;
				countWi=0;
				countWh=0;
				countAtt++;
				prompt();
			}
		}
		else if(c1.equalsIgnoreCase("grab") || c1.equalsIgnoreCase("take") || c1.equalsIgnoreCase("nab"))
		{
			if(c2.equalsIgnoreCase("sword") && !Everlight.hasItem("Sword"))
			{
				System.out.println("You dive through the ogre's legs and grab the sword\n");
				inv.add(new InventoryBoxes("Sword"));
				prompt();
			}
			else if(c2.equals("ogre"))
			{
				System.out.println("You grab the ogre and tear inside of him.\n");
				System.out.println("With the ogre no logner standing in the way, you can see a path adhead of you. With no other way to go, you continue deep into the cave.");
				DeepCave deepCave=new DeepCave();
			}
			else if(Everlight.hasItem("Sword"))
			{
				System.out.println("You already have that.\n");
				prompt();
			}
			else
			{
				System.out.println("Grab what?\n");
				countGo=0;
				countAtt=0;
				countWi=0;
				countWh++;
				prompt();
			}
		}
		else if(c1.equalsIgnoreCase("ogre") && countGo > 0)
			System.out.println("The ogre grabs and eats you. You are dead.");
		else if(c1.equalsIgnoreCase("ogre") && countWh > 0)
			System.out.println("You grab the ogre and tear inside of him");
		else if(c1.equalsIgnoreCase("ogre") && countAtt > 0)
		{
			System.out.println("With what?\n");
			countWh=0;
			countAtt=0;
			countGo=0;
			countWi++;
			prompt();
		}
		else if(c1.equals("hands") && countWi > 0)
			System.out.println("The ogre grabs and eats you. You are dead.");
		else if(c1.equals("sword") && countGo > 0)
		{
			if(!Everlight.hasItem("Sword"))
			{
				System.out.println("You dive through the ogre's legs and grab the sword.\n");
				inv.add(new InventoryBoxes("Sword"));
				prompt();
			}
			else
			{
				System.out.println("You already have that.\n");
				prompt();
			}
				
		}
		else if(c1.equals("sword") && countWi > 0)
		{
			if(Everlight.hasItem("sword"))
			{
				System.out.println("You grab your sword and slay the ogre.\nBloody entrails cover your body and sword. Spoils of war.");
				System.out.println("With the ogre no logner standing in the way, you can see a path adhead of you. With no other way to go, you continue deep into the cave.");
				DeepCave deepCave=new DeepCave();
			}
			else 
			{
				System.out.println("You dive through the ogre's legs and grab the sword\n");
				inv.add(new InventoryBoxes("sword"));
				prompt();
			}
		}
		else if(c1.equalsIgnoreCase("sword") && countWh > 0)
		{
			System.out.println("You dive through the ogre's legs and grab the sword\n");
			inv.add(new InventoryBoxes("sword"));
			prompt();
		}
		else if(c1.equalsIgnoreCase("look"))
		{
			if(c2.equalsIgnoreCase("at"))
			{
				if(c3.equalsIgnoreCase("sword"))
				{
					System.out.println("The sword is, in fact, made of metal.\n");
					prompt();
				}
			}
		}
		else
		{
			System.out.println("I do not understand\n");
			prompt();
		}
		Stats.getStat(0);
	}
}