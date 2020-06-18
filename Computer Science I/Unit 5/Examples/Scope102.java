public class Scope102
{
    int num1 = 10; // instance variables(aka global cariables, aka attributes)
    int num2 = 30; // instance variables(aka global cariables, aka attributes)
    
    // *** Scope is determined by the {} ***
    public void scopeMethod1()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            count++;
        }
        System.out.println("Count :: " + count); // COunt has scope within the scopeMethod1's {}
        //System.out.println("i :: " + i); // 'i' does not have scope outside the for loops
    }
    public void scopeMethod2()
    {
        int count = 0; // local variable
        while(count < 10)
        {
            count++;
            int value = 42;
        }
        System.out.println("Count :: " + count);
        //System.out.println("Value :: " + value); // 'value' does not have scope outside of the while loop {}
    }
    public void scopeMethod3()
    {
        if(num1 < num2)
        {
            int num3 = num1;
        }
        System.out.println("num1 :: " + num1);
        //System.out.println("num3 :: " + num3); // 'num3' only has scope within the if's {}
    }
}