public class Constructors103
{
    //Purpose :: initilize instance variables of a class
    
    int num1; // initilized to 0 using an unseen default constructor method
    int num2;
    /**
     * How to create and recognze a constructor
     *  1. Same name as the class
     *  2. No return typ. (not even void)
     */
    
    public Constructors103(int num1, int num2)
    {
        // local = instance
        num1 = num1; // do not fall for this trap
        num2 = num2; // avoid giving the same name to both the local and instance variables. Its Confusing
    }
    /*public Constructors103(int n1, int n2)
    {
        // Technique #1, preferable
        // Use different names for the local and instance variables
        num1 = n1;
        num2 = n2;
    }
     public Constructors103(int num1, int num2)
    {
        // Technique #2
        // "this" refrences the instance variables
        //instance = local
        this.num1 = num1;
        this.num2 = num2;
    }*/
    public void outputValues()
    {
        // This num1 and num2 refers to hte instancE variables thay are initilized by the unseen default constructor
        System.out.println("num1 :: " + num1);
        System.out.println("num2 :: " + num2);
    }
}