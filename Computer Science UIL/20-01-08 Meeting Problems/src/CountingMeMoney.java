import java.util.Scanner;

public class CountingMeMoney {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTimes = scan.nextInt();
        for(int i = 0; i < numTimes; i++) {
            // Total number of the base of our currency
            int numBronze = scan.nextInt();
            
            // Determine what Region we are dealing with
            String region = scan.next();
            int numConvert = 0;
            switch(region) {
                case "E" : numConvert = 9; break;
                case "C" : numConvert = 6; break;
            }
            // Number of Combinations
            int count = 0;
            
            if(numBronze >= numConvert) {
                // Just Silver and Bronze
                count += numBronze / numConvert;
                
                int numGold = numBronze / (numConvert * 11);
                if(numGold >= 1) {
                    // Gold, Silver, and Bronze
                    for(int numCurrentGold = numGold; numCurrentGold >= 1; numCurrentGold--) {
                        int numCurrentBronze = numBronze - (numCurrentGold * (numConvert * 11));
                        int numCurrentSilver = numCurrentBronze / numConvert;
                        count += numCurrentSilver + 1;
                    }
                }
            }
            
            // Only Bronze
            count++;
            System.out.println(count);
        }
    }
}