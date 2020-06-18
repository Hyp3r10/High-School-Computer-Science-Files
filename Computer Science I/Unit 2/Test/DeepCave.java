
public class DeepCave extends Everlight
{
	public DeepCave()
	{
		System.out.println("DEEP CAVE:");
		System.out.println("You feel quite tired. You can tell you won't be able to continue unless you get some more energy somehow.");
		System.out.println("Suddenly the slain ogre behind you falls over and blocks the way you came in.");
		System.out.println("You see a pot laying on a rock. There is also a stream of water flowing from the ceiling down into a small pool.");
		
		execute();
	}
	
	public void execute()
	{
		Everlight.prompt();
		
		switch(Everlight.getOutput())
		{
		case "5jD":
		{
			if(Stats.getStat(9))
			{
				System.out.println("You are already here.");
			}
			else
			{
				System.out.println("You go to the rock with the pot on it.");
				System.out.println("The pot seems to be closed by bolts.");
				Stats.setStat(9,true);
				Stats.setStat(10,false);
				execute();
			}
			break;
		}
		case "14":
		{
			if(Stats.getStat(9))
			{
				System.out.println("You are already here.");
			}
			else
			{
				System.out.println("You go to the rock with the pot on it.");
				System.out.println("The pot seems to be closed by bolts.");
				Stats.setStat(9,true);
				Stats.setStat(10,false);
				execute();
			}
			break;
		}
		case "12oE3":
		{
			if(Stats.getStat(9))
			{
				System.out.println("You open the pot. There's nothing inside, but now you can put things inside of it.");
				//PUT POT IN INVENTORY
				inv.add(new InventoryBoxes("Pot"));
				Stats.setStat(11,true);
				execute();
			}
			else
			{
				System.out.println("You should go to the pot.");
				execute();
			}
			break;
		}
		case "5jF":
		{
			if(Stats.getStat(10))
			{
				System.out.println("You are already here.");
			}
			else
			{
				System.out.println("You go to the waterfall. It is full of minerals and would need to be purified somehow to become drinkable.");
				Stats.setStat(9,false);
				Stats.setStat(10,true);
			}
			break;
		}
		case "15":
		{
			if(Stats.getStat(10))
			{
				System.out.println("You are already here.");
			}
			else
			{
				System.out.println("You go to the waterfall. It is full of minerals and would need to be purified somehow to become drinkable.");
				Stats.setStat(9,false);
				Stats.setStat(10,true);
			}
			break;
		}
		case "13oE4":
		{
			if(Stats.getStat(10)&&Stats.getStat(11))
			{
				System.out.println("The pot is filled with water, but the water still needs to be cleaned somehow.");
				Stats.setStat(12,true);
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		case "2pG5":
		{
			if(Stats.getStat(10)&&Stats.getStat(11))
			{
				System.out.println("The pot is filled with water, but the water still needs to be cleaned somehow.");
				Stats.setStat(12,true);
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		case "2hG5":
		{
			if(Stats.getStat(7)&&Stats.getStat(11))
			{
				System.out.println("You drop a carrot into the pot.");
				Stats.setStat(14,true);
				
				for(int i = 0; i < inv.size(); i++)
				{
					if(inv.get(i).getName().equalsIgnoreCase("carrot"))
					{
						inv.get(i).setToNull();
					}
				}
				if(Stats.getStat(15))
				{
					System.out.println("You have all of the food you need.");
					
					if(Stats.getStat(13)&&Stats.getStat(14)&&Stats.getStat(15))
					{
						System.out.println("The soup is done and ready to eat.");
						System.out.println("You sit by the edge of the pool looking into the ever changing surface.");
						System.out.println("You enjoy your last meal, as you know there is no way out of the cavern.");
						System.out.println("You know your light will soon go out, but feel comfort in the fact that the light around you;");
						System.out.println("The light from the cave; The light of fire; The light of the sun; The light of all of the celestial bodies;");
						System.out.println("Will not soon go out, but continue on forever. The Everlight.");
					}
				}
				else
				{
					System.out.println("It seems to be missing an ingrediant.");
				}
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		case "2qG5":
		{
			if(Stats.getStat(6)&&Stats.getStat(11))
			{
				System.out.println("You drop the bread into the pot.");
				Stats.setStat(15,true);
				//REMOVE BREAD FROM INVENTORY
				for(int i = 0; i < inv.size(); i++)
				{
					if(inv.get(i).getName().equalsIgnoreCase("bread"))
					{
						inv.get(i).setToNull();
					}
				}
				if(Stats.getStat(14))
				{
					System.out.println("You have all of the food you need.");
					
					if(Stats.getStat(13)&&Stats.getStat(14)&&Stats.getStat(15))
					{
						System.out.println("The soup is done and ready to eat.");
						System.out.println("You sit by the edge of the pool looking into the ever changing surface.");
						System.out.println("You enjoy your last meal, as you know there is no way out of the cavern.");
						System.out.println("You know your light will soon go out, but feel comfort in the fact that the light around you;");
						System.out.println("The light from the cave; The light of fire; The light of the sun; The light of all of the celestial bodies;");
						System.out.println("Will not soon go out, but continue on forever. The Everlight.");
					}
				}
				else
				{
					System.out.println("It seems to be missing an ingrediant.");
				}
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		case "2rG5":
		{
			if(Stats.getStat(0)&&Stats.getStat(11)&&Stats.getStat(12))
			{
				System.out.println("You drop the pendant into the pot.");
				System.out.println("The pot immediantly heats up and the water starts to boil, disolving the minerals.");
				Stats.setStat(13,true);
				//REMOVE PENDANT FROM INVENTORY
				for(int i = 0; i < inv.size(); i++)
				{
					if(inv.get(i).getName().equalsIgnoreCase("pendant"))
					{
						inv.get(i).setToNull();
					}
				}
				
				if(Stats.getStat(13)&&Stats.getStat(14)&&Stats.getStat(15))
				{
					System.out.println("The soup is done and ready to eat.");
					System.out.println("You sit by the edge of the pool looking into the ever changing surface.");
					System.out.println("You enjoy your last meal, as you know there is no way out of the cavern.");
					System.out.println("You know your light will soon go out, but feel comfort in the fact that the light around you;");
					System.out.println("The light from the cave; The light of fire; The light of the sun; The light of all of the celestial bodies;");
					System.out.println("Will not soon go out, but continue on forever. The Everlight.");
				}
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		case "2rH5":
		{
			if(Stats.getStat(0)&&Stats.getStat(11)&&Stats.getStat(12))
			{
				System.out.println("You put the pendant under the pot.");
				System.out.println("The pot immediantly heats up and the water starts to boil, disolving the minerals.");
				Stats.setStat(13,true);
				//REMOVE PENDANT FROM INVENTORY
				for(int i = 0; i < inv.size(); i++)
				{
					if(inv.get(i).getName().equalsIgnoreCase("bread"))
					{
						inv.get(i).setToNull();
					}
				}
				
				if(Stats.getStat(13)&&Stats.getStat(14)&&Stats.getStat(15))
				{
					System.out.println("The soup is done and ready to eat.");
					System.out.println("You sit by the edge of the pool looking into the ever changing surface.");
					System.out.println("You enjoy your last meal, as you know there is no way out of the cavern.");
					System.out.println("You know your light will soon go out, but feel comfort in the fact that the light around you;");
					System.out.println("The light from the cave; The light of fire; The light of the sun; The light of all of the celestial bodies;");
					System.out.println("Will not soon go out, but continue on forever. The Everlight.");
				}
			}
			else
			{
				System.out.println("You can't do that.");
			}
			break;
		}
		}
	}
}
