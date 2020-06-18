import java.util.Scanner;
 
public class Shack extends Everlight
{
    private static String c1, c2, c3, c4 = "";
    private static int countGo = 0;
    private static int countAtt = 0;
    private static int countWi = 0;
    private static int countWh = 0;
    private static boolean scraps = false;
    private static boolean sacks = false;
    //private static boolean  = false;
     
    public Shack()
    {
        System.out.println("SHACK:"
                       + "\nAs you open the door, splinters fly and screws untighted; remarkably, this door has withstood the test of time."
                       + "\nYou hear many little shreiks and scutters from inside the shack as you step in."
                       + "\nThe cracks in the ceiling would let the moonlight illuminate the shack, if only there was even a sliver of moon to see this night."
                       + "\nYou see a stack of sacks in the corner of the shack."
                       + "\nYou sigh, as your tounge twisters don't even amuse yourself."
                       + "\nA pile of scraps in the middle of the shack block most of your view."
                       + "\n\nYou remember to be thankful you at least live in a house.\n");
        prompt();
    }
     
    public static void prompt()
    {   
        System.out.print(">");
        String com = scan.nextLine();
         
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
    }
     
    public static boolean hasItem(String it)
    {
        boolean flag = false;
         
        for(int i = 0; i < inv.size(); i++)
        {
            if(inv.get(i).getName().equalsIgnoreCase(it))
            {
                flag = true;
            }
        }
         
        return flag;
    }
     
    public static void execute()
    {   
        if(c1.equalsIgnoreCase("help"))
        {
            System.out.println("\n And as if God himself whispered into your ear, you instantly knew the commanmds to use.");
            System.out.println("--------------------------");
            System.out.println("INVENTORY or I: access the items you have collected.\n"
                    + "You may hold five items at a time.");
            System.out.println("TAKE or GRAB or PICK UP: put an item into your inventory.");
            System.out.println("DROP or PUT DOWN: take an item out of your inventory.");
            System.out.println("LOOK or LOOK AT or INSPECT or CHECK:\n"
                    + "gives a description of the general area, or an item if specified.");
            System.out.println("GO or GO TO or MOVE or MOVE TO: move to a place specified.\n");
            System.out.println("Please do not use THE in any commands.\n");
            prompt();
        }
        else if(c1.equalsIgnoreCase("go") || c1.equalsIgnoreCase("walk") || c1.equalsIgnoreCase("move"))
        {
            if(c2.equalsIgnoreCase("to") || c2.equalsIgnoreCase("towards"))
            {
                if(c3.equalsIgnoreCase("scrap")||c3.equalsIgnoreCase("scraps"))
                {
                    if(!scraps)
                    {
                        System.out.println("\nThere is a pile of various spare parts, long forgotten by their owners.\nYou sometimes  through the spare parts all throguh the night.");
                        scraps = true;
                        sacks = false;
                        prompt();
                    }
                    else
                    {
                        System.out.println("You are already here.\n");
                        prompt();
                    }
                }
                else if(c3.equalsIgnoreCase("sacks"))
                {
                    if(!sacks)
                    {
                        System.out.println("\nThe sacks hold animal feed primarily, but a few hold human feed as well. Excuse me, I mean they hold human delicacies.\nYou spot a sack of carrots and a sack of assorted Italian breads.\n");
                        scraps = false;
                        sacks = true;
                        prompt();
                    }
                    else
                    {
                        System.out.println("You are already here.\n");
                        prompt();
                    }
                }
                else if(!scraps)
                {
                    System.out.println("\nThere is a pile of various spare parts, long forgotten by their owners.\nYou sometimes  through the spare parts all throguh the night.");
                    scraps = true;
                    sacks = false;
                    prompt();
                }
                else
                {
                    System.out.println("Go where?\n");
                    countAtt=0;
                    countWh=0;
                    countWi=0;
                    countGo++;
                    prompt();
                }
            }
            else
            {
                System.out.println("Go where?\n");
                countAtt=0;
                countWh=0;
                countWi=0;
                countGo++;
                prompt();
            }
        }
        else if(c1.equalsIgnoreCase("scavenge") || c1.equalsIgnoreCase("look") || c1.equalsIgnoreCase("inspect")||c1.equals("check"))
        {
            if(c2.equalsIgnoreCase("scrap") || c2.equalsIgnoreCase("scraps")||c2.equalsIgnoreCase("at")||c2.equalsIgnoreCase("through"))
            {
                if(c3.equalsIgnoreCase("scrap")||c3.equalsIgnoreCase("scraps"))
                {
                    if(scraps)
                    {
                        System.out.println("Once again, you decide to spend the whole night scavenging.");
                        System.out.println("After all of that hard work, you determine that everything is useless, spare this wrech that you pick up.");
                        System.out.println("It seems you have also revealed a trapdoor hiding under the scraps.\n");
                        Cave cave=new Cave();
                    }
                }
                else if(scraps)
                {
                    if(scraps)
                    {
                    	 System.out.println("Once again, you decide to spend the whole night scavenging.");
                         System.out.println("After all of that hard work, you determine that everything is useless, spare this wrech that you pick up.");
                         System.out.println("It seems you have also revealed a trapdoor hiding under the scraps.\n");
                         Cave cave=new Cave();
                    }
                }
            }
        }
        else if(c1.equalsIgnoreCase("go") || c1.equalsIgnoreCase("walk") || c1.equalsIgnoreCase("move")||c1.equalsIgnoreCase("open"))
        {
            if(c2.equalsIgnoreCase("to") || c2.equalsIgnoreCase("towards")||c3.equalsIgnoreCase("trapdoor")||c3.equals("hatch"))
            {
            	if(c3.equalsIgnoreCase("trapdoor")||c3.equals("hatch"))
            	{
            		if(scraps)
            		{
            			System.out.println("You open the trapdoor. It flips open smoothly, quite unlike the door to the shack.");
            			Cave cave=new Cave();
            		}
            	}
            	if(scraps)
            	{
            		System.out.println("You open the trapdoor. It flips open smoothly, quite unlike the door to the shack.");
        			Cave cave=new Cave();
            	}
            	
            }
        else if(c1.equalsIgnoreCase("pick") || c1.equals("take"))
        {
            if(c2.equalsIgnoreCase("up")||c2.equalsIgnoreCase("carrots")||c2.equalsIgnoreCase("sack")||c2.equalsIgnoreCase("carrot"))
            {
                if((c3.equalsIgnoreCase("carrots")||c3.equalsIgnoreCase("carrot")||c3.equalsIgnoreCase("sack"))&&sacks)
                {
                    System.out.println("You take the sack of carrots, which remind you of an old time. Do you wish to relive this memory?\n");
                    Scanner scan=new Scanner(System.in);
                    System.out.print(">");
                    if(scan.nextLine().equalsIgnoreCase("yes")||scan.nextLine().equalsIgnoreCase("y"))
                    {
                        System.out.println("How fitting it be that old memories quite often portain to old people.\n");
                        System.out.println("\"Grandfather used to take me back to his farm on the weekends, whenever he could steal me away for those precious moments.");
                        System.out.println("He would show me the work that had to be done, and there was never a shortage.");
                        System.out.println("As if he knew it would one day keep me just alive enough to keep working, he taught me everything he knew.");
                        System.out.println("After he was at least half satisfied with what was accoplished, he would take me back to his room and show me his possessions.");
                        System.out.println("They were alwasy the same possessions; alwasy the same stories to accompany the too, but that didn't matter.");
                        System.out.println("It was really the person I loved, not the stories or the experiences or the skills aquired.");
                        System.out.println("Grandfather was my favorite. I can only hope now that I was his.\"\n\n");
                        Stats.setStat(7,true);
                        prompt();
                    }
                    else
                    {
                        prompt();
                    }
                }
                else
                {
                    System.out.println("Take what?\n");
                    countGo = 0;
                    countAtt = 0;
                    countWi = 0;
                    countWh++;
                    prompt();
                }
            }
            else if((c2.equalsIgnoreCase("carrots")||c2.equalsIgnoreCase("carrot"))&&sacks)
            {
                System.out.println("You take the sack of carrots, which remind you of an old time. Do you wish to relive this memory?\n");
                Scanner scan=new Scanner(System.in);
                if(scan.nextLine().equalsIgnoreCase("yes")||scan.nextLine().equalsIgnoreCase("y"))
                {
                    System.out.println("How fitting it be that old memories quite often portain to old people.\n");
                    System.out.println("\"Grandfather used to take me back to his farm on the weekends, whenever he could steal me away for those precious moments.");
                    System.out.println("He would show me the work that had to be done, and there was never a shortage.");
                    System.out.println("As if he knew it would one day keep me just alive enough to keep working, he taught me everything he knew.");
                    System.out.println("After he was at least half satisfied with what was accoplished, he would take me back to his room and show me his possessions.");
                    System.out.println("They were alwasy the same possessions; alwasy the same stories to accompany the too, but that didn't matter.");
                    System.out.println("It was really the person I loved, not the stories or the experiences or the skills aquired.");
                    System.out.println("Grandfather was my favorite. I can only hope now that I was his.\"\n\n");
                    Stats.setStat(7,true);
                    prompt();
                }
                else
                {
                    prompt();
                }
            }
            else
            {
                System.out.println("Take what?\n");
                countGo = 0;
                countAtt = 0;
                countWi = 0;
                countWh++;
                prompt();
            }
        }
         
        else if(c1.equalsIgnoreCase("pick") || c1.equals("take"))
        {
            if(c2.equalsIgnoreCase("up")||c2.equalsIgnoreCase("bread")||c2.equalsIgnoreCase("sack")||c2.equalsIgnoreCase("italian"))
            {
                if((c3.equalsIgnoreCase("bread")||c3.equalsIgnoreCase("italian")||c3.equalsIgnoreCase("sack"))&&sacks)
                {
                    System.out.println("You take the sack of Italian bread, which remind you of an old time. Do you wish to relive this memory?\n");
                    Scanner scan=new Scanner(System.in);
                    System.out.print(">");
                    if(scan.nextLine().equalsIgnoreCase("yes")||scan.nextLine().equalsIgnoreCase("y"))
                    {
                        System.out.println("It was in a cafe in a far away place. A time unimaginable now.");
                        System.out.println("The smell was hypnotic to the people around the area.");
                        System.out.println("They came from far away to come to the shop. It was the center of everyone's lives.");
                        System.out.println("And the bread wasn't even that good.");
                        System.out.println("No, the real reason everyone came was for the personality of the place. But where to even begin with that?");
                        System.out.println("No, I guess some things are more magical if they remain lost in time, only recorded by the memories of the ones who experienced it.");
                        System.out.println("Tasting the bread now, you realize you had quite honestly forgot what the bread had used to taste like.");
                        Stats.setStat(6,true);
                        prompt();
                    }
                    else
                    {
                        prompt();
                    }
                }
                else
                {
                    System.out.println("Take what?\n");
                    countGo = 0;
                    countAtt = 0;
                    countWi = 0;
                    countWh++;
                    prompt();
                }
            }
            else if((c2.equalsIgnoreCase("bread")||c2.equalsIgnoreCase("italian"))&&sacks)
            {
                System.out.println("You take the sack of Italian bread, which remind you of an old time. Do you wish to relive this memory?\n");
                Scanner scan=new Scanner(System.in);
                if(scan.nextLine().equalsIgnoreCase("yes")||scan.nextLine().equalsIgnoreCase("y"))
                {
                    System.out.println("It was in a cafe in a far away place. A time unimaginable now.");
                    System.out.println("The smell was hypnotic to the people around the area.");
                    System.out.println("They came from far away to come to the shop. It was the center of everyone's lives.");
                    System.out.println("And the bread wasn't even that good.");
                    System.out.println("No, the real reason everyone came was for the personality of the place. But where to even begin with that?");
                    System.out.println("No, I guess some things are more magical if they remain lost in time, only recorded by the memories of the ones who experienced it.");
                    System.out.println("Tasting the bread now, you realize you had quite honestly forgot what the bread had used to taste like.");
                    Stats.setStat(6,true);
                    prompt();
                }
                else
                {
                    prompt();
                }
            }
            else
            {
                System.out.println("Take what?\n");
                countGo = 0;
                countAtt = 0;
                countWi = 0;
                countWh++;
                prompt();
            }
        }
         
        else if(c1.equalsIgnoreCase("exit") || c1.equalsIgnoreCase("leave"))
        {
            System.out.println("You exit the room the way you came in.");
            Trezoran trezoran=new Trezoran();
        }
        else
        {
            System.out.println("I do not understand that command.\n");
            prompt();
        }
    }
}
}