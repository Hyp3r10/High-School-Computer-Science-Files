public class WhileLoop101
{
    public static void main (String args[])
    {
        /**
         * 1. Start (Loop Control Variable)
         * 2. Boolean Conditional (The loop runs while it is true and ends when it is false.)
         * 3. Increment (Optional, what the loop goes up/down by)
         */
        
        int lcv = 0; // Part one must be declasred and initilized outise of the loop.
        
        while(lcv <= 10) //Part 2, NEVER PUT A SEMICOLINE HERE
        {
            System.out.print(lcv + " ");
            lcv++; // Not always needed, depends on how the loop is implemented.
        }
        
        System.out.println("\n");
        
        while(lcv >= 0)
        {
            System.out.print(lcv + " ");
            lcv--;
        }
        
        System.out.println("\n");
        System.out.println(lcv);
        System.out.println("\n");
        
        lcv = 10;
        
        while(lcv >= 0)
        {
            System.out.print(lcv + " ");
            lcv -= 2;
        }
    }
}