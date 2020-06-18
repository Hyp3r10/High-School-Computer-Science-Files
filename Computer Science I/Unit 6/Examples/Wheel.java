public class Wheel
{
    private int wheelCount;
    
    public Wheel(int wc)
    {
        System.out.println("Wheel Constructor Called");
        wheelCount = wc;
    }
    
    public int getWheelCount()
    {
        return wheelCount;
    }
}