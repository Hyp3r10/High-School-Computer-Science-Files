public class MysteryNumber
{
    public static void main (String[] args)
    {
        // (1) Creating the variable and initilizing it's value
        int mystery = 100;
        
        // (2) Increasing the value by 50
        mystery += 50;
        
        // (3) Decreasing the value by 1
        --mystery;
        
        // (4) Increase the value by a factor of 3
        mystery *= 3;
        
        // (5) Increase the value by 1
        mystery = ++mystery;
        
        // (6) Cut the value in half
        mystery /= 2;
        
        // (7) Increase the value by 15
        mystery += 15;
        
        // (8) Decrease the value by 6 
        mystery -= 6;
        
        // (9) Increase the value by 1
        ++mystery;
        
        // (10) Decrease the value by 5
        mystery -= 5;
        
        // (11) variable Mod. 10
        mystery %= 10;
        
        // (12) Increase the value by a factor of 100
        mystery *= 100;
        
        // (13) Increase the value by 12
        mystery += 12;
        
        // (14) Decrease the value by 1
        --mystery;
        
        // (15) Print out the mystery number
        System.out.println("The Mystery Number = " + mystery);
    }
}