import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
 
import java.io.*;
import java.util.*;
 
public class Main
{
    private static Conversation text = new Conversation();
    private static Player player;
    private static int count = 0;
    private static Scanner input;
 
    public static void main(String [] args) throws InterruptedException, JsonParseException, JsonMappingException, IOException
    {
        input = new Scanner(System.in);
        text.printTXT("You wake up with a throbbing headache, seeing a forest aflame in front of your eyes.\nYou pass out again.\nDarkness.\n\nYou wake up to see yourself surrounded by the charred remains of the forest. \"What happened?\" you think to yourself.\nYou walk to the edge of a cliff to see a broken sign... \"One mile to Hoggiest Warts\", your home town.\nYou look up to see only a burning city.\n");
 
        text.printTXT("Choose an option");
        System.out.println("1. New\n2. Load");
        int c = nextInt();
 
        if(c == 1)
        {
            text.printTXT("You run down to the town only to be stopped by a dying beggar. His wounds are dire, he will not last long! In a weak voice, he asks...\n");
 
            newSave();
            if(count == 1)
            {
                dungeon1();
            }
        }
        else if(c == 2)
        {
            load();
            town1();
            dungeon1();
        }
        else if(c >= 3)
        {
            System.out.println("Pick an actual option next time");
            System.exit(0);
        }
    }
 
    public static void newSave() throws JsonParseException, JsonMappingException, IOException
    {
        input = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String name = null;
 
 
 
        System.out.println("\"What is your name?\"");
        System.out.print("Enter name...");
        while(name == null && name != "")
        {
            name = input.nextLine();
            player = new Player(name);
            player.addConsume(ItemList.startPotion);
            player.addEquip(ItemList.startSword);
        }
 
        mapper.writeValue(new File("save.json"), player);
        count++;
 
        text.printTXT("\"" + player.name + ", you will be the savior of this town. The dragon ogre has destroyed our town. Avenge the town and your family.\" He hands you a rusty blade and two health potions.\nYou glance at the blade to see a glimmer of gold under the layers of red rust.\nYou see a path of destruction heading to the hills. You follow the path.\nAfter miles of running, you come across a bird legged hut. The path leads inside.\nYou hear an evil whisper from within.");
    }
 
    public static void load() throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
 
        player = mapper.readValue(new File("save.json"), Player.class);
    }
    public static void save() throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
 
        mapper.writeValue(new File("save.json"), player);
 
        System.out.println("Game saved successfully");
    }
 
    public static void dungeon1() throws IOException
    {
        Combat combat;
        Minion minion1 = new Minion("Green Hag", 3, 2, 2, 10, 2, ItemList.ironSword, ItemList.badPotion, player);
        Minion minion2 = new Minion("Sea Hag", 3, 2, 2, 10, 2, ItemList.ironSword, ItemList.badPotion, player);
        Minion minion3 = new Minion("Night Hag", 3, 2, 2, 10, 2, ItemList.ironSword, ItemList.potion, player);
        Boss boss1 = new Boss("Baba Yaga the Haggiest Hag", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.goodPotion, player);
        Minion[] minionList = {minion1, minion2, minion3, boss1};
        text.printTXT("You enter the dungeon, where a coven of hags reside. (Make sure to equip your sword before progressing into the dungeon!)\n");
        inventory(2);
        for(int i = 0; i < minionList.length; i++) {
            combat = new Combat(minionList[i], player);
            if(minionList[i].getClass().getName().equals("Minion"))
                text.printTXT("You encounter a " + minionList[i].getName());
            if(minionList[i].getClass().getName().equals("Boss"))
                text.printTXT("You encounter the dungeon boss, " + minionList[i].getName());
            inventory(combat.fight());
        }
 
 
        text.printTXT("Baba Yaga speaks with her dying breath, \"Thank you for freeing me, this is the first time I've felt peace in a long time...\"\nA map falls out of her hand as she dies.\nYou pick up the map, unrolling it. Suprisingly, there's a dotted path leading to the next village that the dragon ogre planned on destroying.\nYou decide to head there for clues.\n");
        town1();
    }
 
    public static void dungeon2() throws IOException
    {
        Combat combat;
        Minion minion1 = new Minion("Kobold Footman", 3, 2, 2, 10, 2, ItemList.goldSword, ItemList.potion, player);
        Minion minion2 = new Minion("Kobold Footman", 3, 2, 2, 10, 2, ItemList.goldSword, ItemList.potion, player);
        Minion minion3 = new Minion("Kobold Knight", 3, 2, 2, 10, 2, ItemList.goldArmor, ItemList.potion, player);
        Minion minion4 = new Minion("Kobold Knight", 3, 2, 2, 10, 2, ItemList.goldArmor, ItemList.potion, player);
        Minion minion5 = new Minion("Kobold Footman", 3, 2, 2, 10, 2, ItemList.goldSword, ItemList.potion, player);
        Boss boss1 = new Boss("Magmon the Golem", 3, 2, 2, 10, 2, ItemList.goldGolemGauntlet, ItemList.goodPotion, player);
        Minion[] minionList = {minion1, minion2, minion3, minion4, minion5, boss1};
        text.printTXT("As you leave the town, you feel something warming up in your pocket.\nYou look down to see a faint glow, and immediately reach into your pocket.\nYour map! As it glows, a new path appears.\nYou decide to follow it, believing it will lead you closer to the dragon ogre.\nUnlike the last path of destruction, this path is nice and there is even a trail of gold plated torches lighting the way!\nYou follow the path to the mouth of a cave. You look in to see a gold furnished cave, with lava flowing from every orifice.\nProceeding cautiously, you enter your next dungeon.\nYou enter the dungeon. Here, deep underground, the kobolds defend their treasures.");
        inventory(2);
        for(int i = 0; i < minionList.length; i++) {
            combat = new Combat(minionList[i], player);
            if(minionList[i].getClass().getName().equals("Minion"))
                text.printTXT("You encounter a " + minionList[i].getName());
            if(minionList[i].getClass().getName().equals("Boss"))
            {
                text.printTXT("You kill all the kobolds, feeling let down because there are no more clues to lead you to the dragon ogre.\nAs you move to a pile of gold coins to make up for your seemingly pointless quest, you hear the roar of a mechanical engine, and the floor beneath you begins to tremble.\nYou see a massive dwarven golem rising out of the pile of gold coins.");
                text.printTXT("You encounter the dungeon boss, " + minionList[i].getName());
            }
            inventory(combat.fight());
        }
 
 
        text.printTXT("With your final blow, the sputtering golem's knees give out.\nHe falls back into the lava, producing a horrific metalic screech.\nAfter a good two minutes, he is melted.\nA small crystal bobs out of the top of the pool of lava. Puzzling to you, you grab for your sword, and fish the crystal out of the lava.\nThe crystal is, shockingly, cool to the touch. As you peer into the crystal, you see movement! The map begins to glow once more, revealing yet another path.\nYou're off to the next village, armed with your newfound crystal...");
    }
 
   
    public static void dungeon3() throws IOException
    {
        Combat combat;
        Minion minion1 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion2 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion3 = new Minion("Hellhound", 3, 2, 2, 10, 2, ItemList.dragonSword, ItemList.potion, player);
        Minion minion4 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion5 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion6 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion7 = new Minion("Animated Armor", 3, 2, 2, 10, 2, ItemList.dragonsteelArmor, ItemList.goodPotion, player);
        Minion minion8 = new Minion("Posessed Villager", 3, 2, 2, 10, 2, ItemList.steelSword, ItemList.badPotion, player);
        Minion minion9 = new Minion("Hellhound", 3, 2, 2, 10, 2, ItemList.dragonSword, ItemList.potion, player);
        Minion minion10 = new Minion("Animated Armor", 3, 2, 2, 10, 2, ItemList.dragonsteelArmor, ItemList.goodPotion, player);
        Boss boss1 = new Boss("Stephan the Blacksmith", 3, 2, 2, 10, 2, ItemList.dragonSword, ItemList.goodPotion, player);
        Minion[] minionList = {minion1, minion2, minion3, minion4, minion5, minion6, minion7, minion8, minion9, minion10, boss1};
        //text.printTXT("");
        inventory(2);
        for(int i = 0; i < minionList.length; i++) {
            combat = new Combat(minionList[i], player);
            if(minionList[i].getClass().getName().equals("Minion"))
                text.printTXT("You encounter a " + minionList[i].getName());
            if(minionList[i].getClass().getName().equals("Boss"))
            {
                text.printTXT("");
                text.printTXT("You encounter the dungeon boss, " + minionList[i].getName());
            }
            inventory(combat.fight());
        }
 
 
        text.printTXT("");
        }
   
    public static void finalBoss()
    {
 
    }
 
    public static void secretDungeon()
    {
 
    }
 
    public static void bossRush()
    {
 
    }
 
    public static void town1() throws IOException
    {
        input = new Scanner(System.in);
        if(count == 0)
        {
        text.printTXT("You enter the seemingly empty town greeted with a howl from the wind.\nYou walk forward to the local shop and knock only to hear the words from a scared women, \"Go away Baba, we know what you seek and do not have it.\"\nTaken aback you explain how you have slayed the hag and seek shelter. The door unlocks and you walk in.");
        count++;
        }
        text.printTXT("\nTown of Estebon\n1.Inn \n2.Shop \n3. Move on");
        player.printGold();
        int choice = nextInt();
       
        if(choice == 1)
        {
            System.out.println("\"Welcome to my inn, rent a room or get out.\" A harried looking woman speaks. \n1.Rent a room \n2.Exit");
            int c = nextInt();
           
            if(c == 1 && player.gold >= 5)
            {  
                System.out.println("You drift off into a deep sleep.");
               
                player.gold -= 5;
                player.health = player.maxHealth;
                save();
                town1();
            }
            else
            {
                System.out.println("You dont have enough money for the room");
                town1();
            }  
           
            if(c == 2)
            {
                System.out.println("You leave the inn.");
                town1();
            }
        }
        if(choice == 2)
        {
            System.out.println("\"What can I get you my fine sir\" says the sweaty shopkeeper. \n1.Buy \n2.Sell");
            int c = nextInt();
           
            if(c == 1)
            {
                System.out.println("\n1. Steel Sword ( 3 Gold )");
                System.out.println("2. Plate Armor ( 4 Gold )");
                System.out.println("3. Lesser Healing Potion ( 2 Gold )"); 
               
                System.out.println("Choose item: ");
                choice = input.nextInt();
               
                if(choice == 1)
                {
                    if(player.gold >= 3)
                    {
                        player.gold -= 3;
                        System.out.println("Thank you for your patronage!");
                        player.addEquip(ItemList.steelSword);
                        town1();
                    }
                   
                    else
                    {
                        System.out.println("You don't have the funds for that!");
                        town1();
                    }
                }
               
                if(choice == 2)
                {
                    if(player.gold >= 4)
                    {
                        player.gold -= 4;
                        System.out.println("Thank you for your patronage!");
                        player.addEquip(ItemList.plateArmor);
                        town1();
                    }
                   
                    else
                    {
                        System.out.println("You don't have the funds for that!");
                        town1();
                    }
                }
               
                if(choice == 3)
                {
                    if(player.gold >= 2)
                    {
                        player.gold -= 2;
                        System.out.println("Thank you for your patronage!");
                        player.addConsume(ItemList.badPotion);
                        town1();
                    }
                   
                    else
                    {
                        System.out.println("You don't have the funds for that!");
                        town1();
                    }
                }
            }
        }
       
        if(choice == 3)
        {
            dungeon2();
        }
    }
 
    public static void inventory(int dead) throws IOException
    {
        input = new Scanner(System.in);
 
        if(dead == 1)
        {
            System.exit(0);
        }
 
        if(dead == 2)
        {
            System.out.println("Inventory \n1.Consumeable \n2.Equipment \n3.Stats \n4.Exit");
            int choice = nextInt();
 
            if(choice == 1)
            {
                if(player.consume.size() > 0)
                {
                    player.printConsume();
                    System.out.println("\n0/Exit");
                    int c = nextInt();
 
                    if(c == 0)
                        inventory(dead);
                    else
                    {
                        System.out.println(player.consume.get(c-1).getName() + "\n" +
                                player.consume.get(c-1).getEffect());
 
                        System.out.println("\nDo you want to use the item?" + "\n" +
                                "1.Yes   " + "2.No");
                        int i = nextInt();
 
                        if(i == 1)
                        {
                            player.heal(c);
                            System.out.println("The item was used\n");
                        }
 
                        inventory(dead);
                    }
                }
                else
                {
                    System.out.println("You dont have any consumables\n");
                    inventory(dead);
                }
            }
            if(choice == 2)
            {
                if(player.equip.size() > 0)
                {
                    player.printEquip();
                    System.out.println("\n0.Exit");
                    int c = nextInt();
 
                    if(c == 0)
                        inventory(dead);
                    else
                    {
                        System.out.println(player.equip.get(c-1).getName() + "\n" +
                                player.equip.get(c-1).getEffect());
 
                        System.out.println("\nDo you want to equip the item?" + "\n" +
                                "1.Yes   " + "2.No");
                        int i = nextInt();
 
                        if(i == 1)
                        {
                            player.equip(c);
                            System.out.println("The item was equipped\n");
                        }
 
                        inventory(dead);
                    }
                }
                else
                {
                    System.out.println("You dont have any equipment\n");
                    inventory(dead);
                }
            }
            if(choice == 3)
            {
                System.out.println("Name:    " + player.name + "\n" +
                        "Health:  " + player.health + "\\" + player.maxHealth + "\n" +
                        "Attack:  " + player.attack + "\n" +
                        "Defense: " + player.defense);
                inventory(dead);
            }
        }
 
        if(dead == 3)
            System.out.println("How!?!");
    }
 
    public static int nextInt()
    {
        int c = input.nextInt();
        input.nextLine();
 
        return c;
    }
}