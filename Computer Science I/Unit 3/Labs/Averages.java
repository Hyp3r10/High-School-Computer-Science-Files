public class Averages
{
    public static void main (String args[])
    {
        int random = 0;
        double randomCount = 0;
        double posCount = 0;
        double negCount = 0;
        double posAvg = 0;
        double negAvg = 0;
        double sumPos = 0;
        double sumNeg = 0;
        
        while(randomCount < 100)
        {
            random = (int)(Math.random()*(2001)-1000);
            randomCount++;
            if(randomCount <= 20)
            {
                System.out.print(random + " ");
                if(randomCount == 20)
                {
                    System.out.println("");
                }
            }
            else if(randomCount <= 40)
            {
                System.out.print(random + " ");
                if(randomCount == 40)
                {
                    System.out.println("");
                }
            }
            else if(randomCount <= 60)
            {
                System.out.print(random + " ");
                if(randomCount == 60)
                {
                    System.out.println("");
                }
            }
            else if(randomCount <= 80)
            {
                System.out.print(random + " ");
                if(randomCount == 80)
                {
                    System.out.println("");
                }
            }
            else if(randomCount <= 100)
            {
                System.out.print(random + " ");
                if(randomCount == 10)
                {
                    System.out.println("");
                }
            }
            if(random > 0)
            {
                posCount++;
                sumPos += random;
            }
            else if(random < 0)
            {
                negCount++;
                sumNeg += random;
            }
        }
        posAvg = (sumPos / posCount);
        negAvg = (sumNeg / negCount);
        System.out.println("\n\n        Summary");
        System.out.println("------------------------");
        System.out.println("Positive Numbers = " + posCount);
        System.out.println("Sum of Positives = " + sumPos);
        System.out.println("Average of Positives = " + posAvg + "\n");
        
        System.out.println("Negative Numbers = " + negCount);
        System.out.println("Sum of Negatives = " + sumNeg);
        System.out.println("Average of Negatives = " + negAvg + "\n");
    }
}