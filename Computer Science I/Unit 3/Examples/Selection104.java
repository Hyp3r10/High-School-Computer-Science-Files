import java.util.Scanner;

public class Selection104
{
    public static void main (String[] args)
    {
        Scanner ironman = new Scanner(System.in);
        
        /**
         * Things to do
         * 90+        Swimming
         * 75 - 89    Soccer (Futbol)
         * 65 - 74    Baseball
         * 55 - 64    Football
         * 33 - 54    Basketball
         * 0 - 32     Hockey
         * Bellow 0   Competitive Mapel Syrup Drinking
         */
        
        System.out.print("Please enter the ooutside temperature: ");
        byte choice = ironman.nextByte();
        String activity = "";
        
        //Multiple Selection
        if(choice >= 90)
            activity = "Swimming";
        else if (choice >= 75)
            activity = "Soccer (futbol)";
        else if (choice >= 65)
            activity = "Baseball";
        else if (choice >= 55)
            activity = "Football";
        else if (choice >= 33)
            activity = "Basketball";
        else if (choice >= 0)
            activity = "Hockey";
        else //Bellow 0
            activity = "Competitive Mapel Syrup Drinking";
            
       System.out.println("\nWe think you should try " + activity + ".\n" );
    }
}