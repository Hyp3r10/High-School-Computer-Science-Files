public class Constructors104
{
    //Purpose :: initilize instance variables of a class
    
    int num1; // initilized to 0 using an unseen default constructor method
    int num2;
    /**
     * How to create and recognze a constructor
     *  1. Same name as the class
     *  2. No return typ. (not even void)
     */
    
    public Constructors104(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    //Default Constructor
    public Constructors104()
    {
        num1 = 23;
        num2 = 42;
    }
    public Constructors104(int n1)
    {
        num1 = n1;
        num2 = 96;
    }
    public void outputValues()
    {
        // This num1 and num2 refers to hte instancE variables thay are initilized by the unseen default constructor
        System.out.println("num1 :: " + num1);
        System.out.println("num2 :: " + num2);
    }
}