public class DoWhileLoop101
{
    public static void main (String args[])
    {
        /**
         * 1. Start (Initilize loop control variable)
         * 2. Boolean Conditional (This statement must be true for this loop to run, more than once)
         * 3. Increment (Optional. what the loop goes up/down by)
         */
        
        int lcv = 1;
        
        do
        {
            System.out.print(lcv + " ");
            lcv++; // Part 3
        }while(lcv <= 10); // Part 2, put a semicolin here
        
        System.out.println("\n");
        
        lcv = 10;
        
        do
        {
            System.out.print(lcv + " ");
            lcv--;
        }while(lcv >= 1);
        
        System.out.println("\n");
        
        lcv = 10;
        
        do
        {
            System.out.print(lcv + " ");
            lcv--;
        }while(lcv >= 1000); // Do while loops iterate atleast one time, every time
        
        System.out.println("\n");
        
        lcv = 10;
        
        do
        {
            System.out.print(lcv + " ");
            lcv += 10;
        }while(lcv <= 100);
    }
}