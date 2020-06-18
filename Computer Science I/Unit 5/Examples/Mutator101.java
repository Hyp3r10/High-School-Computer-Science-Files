public class Mutator101
{
    private int num1;
    private int num2;
    public Mutator101(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    
    //Accessor methods(aka Getters)
    // Accessors are generaly return methods
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
    //Mutator Methods AKA Setters
    //Generaly void methods
    public void SetNum1(int n1)
    {
        num1 = n1;
    }
    public void SetNum2(int n2)
    {
        num2 = n2;
    }
}