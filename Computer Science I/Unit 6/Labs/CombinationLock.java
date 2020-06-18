import java.util.Scanner;
public class CombinationLock extends Lock
{
    protected String combination;
    protected Scanner scan = new Scanner(System.in); 
    public CombinationLock()
    {
        super();// Calling the default constroctur of the lock class, this super is not necessary becaus ether are no paramaters being passed to the lock superclass, thus Java will call the Lock constructor automatically
        combination = "";
    }
    public CombinationLock(String combo)
    {
        super(); // Again this statement is not neccessary
        combination = combo;
    }
    public void open()
    {
        System.out.print("Enter the combination :: ");
        String combo = scan.nextLine();
        if(combo.equals(combination))
        {
            super.open();
        }
    }
    public void setCombination(String combo)
    {
        combination = combo;
    }
    public String getCombination()
    {
        return combination;
    }
    public String toString()
    {
        return super.toString() + 
            "\nCombinaion is :: " + getCombination();
    }
}