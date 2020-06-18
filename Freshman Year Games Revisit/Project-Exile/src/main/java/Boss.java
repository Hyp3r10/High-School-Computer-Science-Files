import com.fasterxml.jackson.annotation.JsonIgnore;

public class Boss extends Minion
{
    @JsonIgnore
    public Conversation dialogue;

    public Boss(String n, int d, int bA, int cM, int h, int cC, Equipment e, Consumeable c, Player p)
    {
        super(n, d, bA, cM, h, cC, e, c, p);
        dialogue = new Conversation();

    }

    public static void playMusic()
    {

    }

    public static void revive()
    {

    }
}