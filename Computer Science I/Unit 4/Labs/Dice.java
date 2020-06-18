public class Dice
{
    public void printRolls()
    {
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Roll " + i + " :: " + rollDie());
        }
    }
    private int rollDie()
    {
        int roll = (int)(Math.random()*6)+1;
        return roll;
    }
}