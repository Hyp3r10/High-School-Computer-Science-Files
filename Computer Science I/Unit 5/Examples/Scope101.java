public class Scope101
{
    int num1 = 10; // instance variables(aka global cariables, aka attributes)
    int num2 = 30; // instance variables(aka global cariables, aka attributes)
    
    // *** Scope is determined by the {} ***
    public void scopeMethod1()
    {
        int num1 = 50; // local variable
        int num2 = 75; // local variable
        int sum = num1 + num2; // uses the local variables over the instance variables
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
    public void scopeMethod2()
    {
        int diff = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + diff);
    }
}