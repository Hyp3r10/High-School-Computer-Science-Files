public class RandomRanges
{
    public static void main (String[] args)
    {
        int randomInt1 = (int)(Math.random()*(26));
        int randomInt2 = (int)(Math.random()*(3))+1;
        int randomInt3 = (int)(Math.random()*(51))+50;
        int randomInt4 = (int)(Math.random()*(-10));
        int randomInt5 = (int)(Math.random()*(200)-101);
        int randomChar1 = ((int)(Math.random()*26)+65);
        double randomDec1 = ((double)(Math.round((Math.random()*(999))))) / 1000;
        int randomInt6 = (int)((Math.random()*10)+1)*1000 ;
        
        System.out.println("Random Ranges");
        System.out.println("================");
        System.out.println("1. Range: 0 to 25 = " + randomInt1);
        System.out.println("2. Range: 1 to 3 = " + randomInt2);
        System.out.println("3. Range: 50 to 100 = " + randomInt3);
        System.out.println("4. Range: -1 to -10 = " + randomInt4);
        System.out.println("5. Range: -100 to 100 = " + randomInt5);
        System.out.println("6. Range: A to Z = " + (char)randomChar1);
        System.out.println("7. Range: 0.1 to 1 = " + randomDec1);
        System.out.println("8. Range: 1000 to 10000 = " + (int)randomInt6);
    }
}