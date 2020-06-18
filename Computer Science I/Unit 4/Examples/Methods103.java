public class Methods103
{
    public double averageThree(int operand1,int operand2,int operand3) // This method depends on its helpers
    {
        int sum = sumThree(operand1, operand2, operand3);
        return devideThree(sum); // Can a method call in a return statement
        //return devideThree(sumThree(operand1,operand2,operand3)); // You can have a method call as the paramater of anoter method call.
    }
    // Helper methods should have restricted access, this can be done with "privae"
    private int sumThree(int operand1,int operand2,int operand3) // Helper Method
    {
        int sum = operand1 + operand2 + operand3;
        return sum;
    }
    private double devideThree(int operand4) // Helper Method
    {
        return (double) operand4/3;
    }
}