public class Baseball
{
    public static void main (String[] args)
    {
        // (1) Creating variables and initializing the values
        int hits = 27;
        int atBats = 80;
        double battingAvg = 0;
        int roundedAvg = 0;
        
        // (2) Finding the batting average
        battingAvg = (double) hits / atBats;
        
        // (3) Rounding to the nearest thousandth
        battingAvg = (battingAvg + 0.0005);
        
        // (4) Coverting the rounded average to an integer
        battingAvg = battingAvg * 1000;
        roundedAvg = (int) battingAvg;
        
        // (5) Printing the results
        System.out.println("Hits = " + hits);
        System.out.println("At Bats = " + atBats);
        System.out.println("-------------------------");
        System.out.println("Batting Average = " + roundedAvg);
    }
}