public class ForLoop101
{
    public static void main (String[] args)
    {
        /**
         * 1. Start (initialize loop control variable)
         * 2. End (boolean conditional, this statement must be true for the loop to run)
         * 3. Increment / Decrement (What the loop goes up or down by)
         */
        
        //  1. Start  2. End    3. Increment
        for(int i = 5; i <= 20; i++) // DO NOT put a semicolin at the end of a loop!!!
        {
            System.out.print(i + " ");
            
        }
        System.out.println("\n");
        for(int i = 10; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i = 2; i <= 20; i += 2)
        {
            System.out.print(i + " ");
        }
    }
}