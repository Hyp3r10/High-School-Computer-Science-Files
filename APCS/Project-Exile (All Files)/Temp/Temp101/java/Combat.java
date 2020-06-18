import java.util.*;
 
public class Combat
{
    private Minion minion;
    private Player player;
 
    public Combat(Minion m, Player p)
    {
        minion = m;
        player = p;        
    }
 
    @SuppressWarnings("resource")
    public int fight()
    {
        while(player.getHealth() > 0 || minion.getHealth() > 0)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n         What will you do?" + "\n" +
                    "1. Attack     2. Defend     3. Item");
            int choice = input.nextInt();
 
            if(choice == 1)
            {
                System.out.println(playerAttack());
 
                if(minion.getHealth() <= 0)
                {
                    System.out.println(minion.died());
                    System.out.println(minion.getLoot());
                   
                    return 2;
                }
 
            }
            else if(choice == 3)
                System.out.println("You don't have time for that!");
 
            if(choice != 2)
            {
                System.out.println(minionAttack());
                if(player.getHealth() <= 0)
                {
                    System.out.println(player.dead());
                    return 1;
                }
            }
        }
 
        return 3;
    }
 
    public String playerAttack()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("After your vicious blows");
        words.add("With a crippling strike");
        words.add("With all your might behind your attack");
        Collections.shuffle(words);
       
        int patk = player.getAtk();
 
        minion.attacked(patk);
       
        if(patk - minion.getDefense() < 0)
            return words.get(0) + "You did 0 damage to " + minion.getName();
        else    
            return words.get(0) + ", you did " + (patk - minion.getDefense()) + " damage to " + minion.getName();
    }
 
    public String minionAttack()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("The vile beast strikes back! ");
        words.add("With clever deception, the " + minion.getName() + " gets around your defense. ");
        words.add("The " + minion.getName() + " deftly attacks! ");
        Collections.shuffle(words);
       
        int matk = minion.getAtk();
 
        player.attacked(matk);
       
        if(matk - player.getDefense() < 0)
            return words.get(0) + "You took 0 damage";
        else
            return words.get(0) + "You took " + (matk - player.getDefense()) + " damage";
    }
}