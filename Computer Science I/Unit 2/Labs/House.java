import java.util.Scanner;
import java.util.ArrayList;
public class House extends Everlight
{
    //private static String c1, c2, c3, c4 = "";
    //private static int countGo = 0;
    //private static int countAtt = 0;
    //private static int countWi = 0;
    //private static int countWh = 0;
    //private static boolean bed = false;
    //private static boolean chest = false;
     
    public House()
    {
        System.out.println("YOUR HOUSE:\nYou enter your own home."
                       + "\nYou recognize the familiar stench of poverty."
                       + "\nThe non-existence of your wealth almost seems to eminate from the walls."
                       + "\nYour sorry excuse for a bed sits in the corner."
                       + "\nAt the end of the bed is a chest made of straw."
                       + "\nTo inspect this chest would be a waste of time."
                       + "\n\nA single ray of sunlight slips through a crack in the ceiling."
                       + "\nA sudden glare catches the corner of your eye."
                       + "\nIt seems to be coming from behind your bed.\n");
        execute();
    }
     
    public static void execute()
    {
        Everlight.prompt();
        if(!(Everlight.getOutput().equals("0")
         ||Everlight.getOutput().equals("5")
         ||Everlight.getOutput().equals("5j")
         ||Everlight.getOutput().equals("1")
         ||Everlight.getOutput().equals("1k")
         ||Everlight.getOutput().equals("10")
         ||Everlight.getOutput().equals("11")))
        {
        switch(Everlight.getOutput())
        {
        case "5jI":
        {
            if(Stats.getStat(2))
            {
                System.out.println("You are already here.");
                execute();
            }
            else
            {
                System.out.println("You walk towards the bed; the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                Stats.setStat(2,true);
                Stats.setStat(1,false);
                execute();
            }
            break;
        }
        case "16":
        {
            if(Stats.getStat(2))
            {
                System.out.println("You are already here.");
                execute();
            }
            else
            {
                System.out.println("You walk towards the bed; the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                Stats.setStat(2,true);
                Stats.setStat(1,false);
                execute();
            }
            break;
        }
        case "5jJ":
        {
            if(Stats.getStat(1))
            {
                System.out.println("You are already here.");
                execute();
            }
            else
            {
                System.out.println("Turns out I was right. There's nothing special about the chest\n");
                execute();
            }
            break;
        }
        case "17":
        {
            if(Stats.getStat(1))
            {
                System.out.println("You are already here.");
                execute();
            }
            else
            {
                System.out.println("Turns out I was right. There's nothing special about the chest\n");
                execute();
            }
            break;
        }
        case "1kK":
        {
            if(Stats.getStat(2))
            {
                System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                inv.add(new InventoryBoxes("pendant"));
                Stats.setStat(0,true);
                execute();
            }
            else
            {
                System.out.println("You can't do that.");
                execute();
            }
            break;
        }
        case "1r":
        {
            if(Stats.getStat(2))
            {
                System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                inv.add(new InventoryBoxes("pendant"));
                Stats.setStat(0,true);
                execute();
            }
            else
            {
                System.out.println("You can't do that.");
                execute();
            }
            break;
        }
        case "18":
        {
            if(Stats.getStat(2))
            {
                System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                inv.add(new InventoryBoxes("pendant"));
                Stats.setStat(0,true);
                execute();
            }
            else
            {
                System.out.println("You can't do that.");
                execute();
            }
            break;
        }
        case "11s":
        {
            if(Stats.getStat(2))
            {
                System.out.println("The bed is not even a bed; it's a hay bale with two sticks on each side.\n");
                execute();
                 
            }
            else
            {
                System.out.println("You can't do that.");
                execute();
            }
            break;
        }
        case "11t":
        {
            if(Stats.getStat(1))
            {
                System.out.println("I already told you; it's pointless.\n");
                execute();
            }
            else
            {
                System.out.println("You can't do that.");
                execute();
            }
            break;
        }
        case "19u":
        {
            System.out.println("You exit the room the way you came in.");
            Trezoran trezoran = new Trezoran();
        }
        case "19":
        {
            System.out.println("You exit the room the way you came in.");
            Trezoran trezoran = new Trezoran();
        }
        default:
        {
            System.out.println("I don't understand.");
            execute();
            break;
        }
        }
        }
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 
     
    //public static void execute()
    /*{ 
        if(c1.equalsIgnoreCase("help"))
        {
            System.out.println("\n And as if God himself whispered into your ear, you instantly knew the commanmds to use.");
            System.out.println("--------------------------");
            System.out.println("INVENTORY or I: access the items you have collected.\n"
                    + "You may hold five items at a time.");
            System.out.println("TAKE or GRAB or PICK UP: put an item into your inventory.");
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
                if(c3.equalsIgnoreCase("bed"))
                {
                    if(!bed)
                    {
                        System.out.println("You walk towards the bed; the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                        bed = true;
                        chest = false;
                        prompt();
                    }
                    else
                    {
                        System.out.println("You are already here.\n");
                        prompt();
                    }
                }
                else if(c3.equalsIgnoreCase("glare"))
                {
                    if(!bed)
                    {
                        System.out.println("You walk towards the bed; the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                        bed = true;
                        chest = false;
                        prompt();
                    }
                    else
                    {
                        System.out.println("You are already here.\n");
                        prompt();
                    }
                }
                else if(c3.equalsIgnoreCase("sunlight"))
                {
                    if(!bed)
                    {
                        System.out.println("You walk towards the bed; the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                        bed = true;
                        chest = false;
                        prompt();
                    }
                    else
                    {
                        System.out.println("You are already here.\n");
                        prompt();
                    }
                }
                else if(c3.equalsIgnoreCase("chest"))
                {
                    System.out.println("Turns out I was right. There's nothing special about the chest\n");
                    chest = true;
                    bed = false;
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
        else if(c1.equalsIgnoreCase("pick") || c1.equals("take") || c1.equals("grab"))
        {
            if(c2.equalsIgnoreCase("up"))
            {
                if(c3.equalsIgnoreCase("pendant") && bed)
                {
                    if(!hasItem("Pendant"))
                    {
                        System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                        inv.add(new InventoryBoxes("Pendant"));
                        prompt();
                    }
                    else
                    {
                        System.out.println("You already have that.");
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
            else if(c2.equalsIgnoreCase("pendant"))
            {
                if(!hasItem("Pendant"))
                {
                    System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                    inv.add(new InventoryBoxes("Pendant"));
                    prompt();
                }
                else
                {
                    System.out.println("You already have that.");
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
        else if(c1.equalsIgnoreCase("bed") && countGo > 0)
        {
            if(!bed)
            {
                System.out.println("You walk towards the bed the glare only gets brighter.\nYou see the source of the glare is a ray of sunlight hitting a gold-encrusted pendant behind the bed post.\n");
                bed = true;
                chest = false;
                prompt();
            }
            else
            {
                System.out.println("You are already here.\n");
                prompt();
            }
        }
        else if(c1.equals("chest") && countGo > 0)
        {
            System.out.println("Turns out I was right. There's nothing special about the chest.\n");
            chest = true;
            bed = false;
            prompt();
        }
        else if(c1.equalsIgnoreCase("pendant") && countWh > 0 && bed)
        {
            if(!hasItem("Pendant"))
            {
                System.out.println("As soon as you touch the pendant, it burns a mark on your skin almost as if it's marking its territory.\n");
                inv.add(new InventoryBoxes("Pendant"));
                prompt();
            }
            else
            {
                System.out.println("You already have that.");
                prompt();
            }
        }
        else if(c1.equalsIgnoreCase("check") || c1.equalsIgnoreCase("look") || c1.equalsIgnoreCase("inspect"))
        {
            if(c2.equalsIgnoreCase("at"))
            {
                if(c3.equalsIgnoreCase("bed"))
                {
                    if(bed)
                    {
                        System.out.println("The bed is not even a bed; it's a hay bale with two sticks on each side.\n");
                        prompt();
                    }
                    else
                    {
                        System.out.println("You may need to get closer to get a better look.\n");
                        prompt();
                    }
                }
            }
            else if(c2.equalsIgnoreCase("bed"))
            {
                if(bed)
                {
                    System.out.println("The bed is not even a bed; it's a hay bale with two sticks on each side.\n");
                    prompt();
                }
                else
                {
                    System.out.println("You may need to get closer to get a better look.\n");
                    prompt();
                }
            }
            else if(c2.equalsIgnoreCase("chest"))
            {
                if(chest)
                {
                    System.out.println("I already told you; it's pointless.\n");
                    prompt();
                }
                else
                {
                    System.out.println("You may need to get closer to get a better look.\n");
                    prompt();
                }
            }
            else
            {
                System.out.println("What would you wish to look at?\n");
                countGo=0;
                countAtt=0;
                countWh=0;
                countWi++;
                prompt();
            }
        }
        else if(c1.equalsIgnoreCase("bed") && countWi > 0)
        {
            if(bed)
            {
                System.out.println("The bed is not even a bed; it's a hay bale with two sticks on each side.\n");
                prompt();
            }
            else
            {
                System.out.println("You may need to get closer to get a better look.\n");
                prompt();
            }
        }
        else if(c1.equalsIgnoreCase("chest") && countWi > 0)
        {
            if(chest)
            {
                System.out.println("I already told you; it's pointless.\n");
                prompt();
            }
            else
            {
                System.out.println("You may need to get closer to get a better look.\n");
                prompt();
            }
        }
        else if(c1.equalsIgnoreCase("exit") || c1.equalsIgnoreCase("leave"))
        {
            System.out.println("You exit the room the way you came in.");
            Trezoran trezoran = new Trezoran();
        }
        else if(c1.equalsIgnoreCase("i") || c1.equalsIgnoreCase("inventory"))
        {
            System.out.println(inv);
            prompt();
        }
        else
        {
            System.out.println("I do not understand that command.\n");
            prompt();
        }
    }*/
}