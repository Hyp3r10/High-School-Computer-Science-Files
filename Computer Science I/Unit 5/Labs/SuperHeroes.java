public class SuperHeroes
{
    //Instance Variables
    private String name;
    private int age;
    private String power;
    private String sName;
    private String sWeakness;
    private char choice;
    //Constructors
    public SuperHeroes()
    {
        name = null;
        age = 0;
        power = null;
        sName = null;
        sWeakness = null;
    }
    public SuperHeroes(String n, int a, String p)
    {
        name =  n;
        age = a;
        power = p;
    }
    public SuperHeroes(String n, int a, String p, String sn, String sw, char c)
    {
        name =  n;
        age = a;
        power = p;
        sName = sn;
        sWeakness = sw;
        choice = c;
    }
    //Accessors
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getPower()
    {
        return power;
    }
    private String getRealName()
    {
        return sName;
    }
    private String getWeakness()
    {
        return sWeakness;
    }
    //Mutators
    {
        /**
          * There are no mutators in this program because we dont want the user to have 
          * "write access", the ability to change the contents of the instance variables(attributes).
          */
    }
    //toString
    public String toString()
    {
        if(choice == 'y')
        {
            System.out.println("test toString");
            return "\nSuper Hero Profile" + 
                   "\n==================" + 
                   "\nName :: " + getName() + 
                   "\nAge :: " + getAge() + 
                   "\nPower :: " + getPower() + 
                   "\n" + 
                   "\n***Secret Info***" + 
                   "\nReal Name :: " + getRealName() + 
                   "\nHero's Weakness :: " + getWeakness();
        }
        else//(choice != "y" [y == "n"])
        {
            System.out.println("test toString");
            return "\nSuper Hero Profile" + 
                   "\n==================" + 
                   "\nName :: " + getName() + 
                   "\nAge :: " + getAge() + 
                   "\nPower :: " + getPower();
        }
    }
    //Other
}