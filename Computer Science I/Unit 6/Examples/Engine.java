public class Engine
{
    private int horsePower;
    
    public Engine(int hp)
    {
        System.out.println("Engine Constructor Called");
        horsePower = hp;
    }
    
    public int getHorsePower()
    {
        return horsePower;
    }
}
