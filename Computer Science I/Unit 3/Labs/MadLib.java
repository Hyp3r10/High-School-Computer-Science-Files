import java.util.Scanner;

public class MadLib
{
    public static void main(String[] args)
    {
           Scanner madLib = new Scanner(System.in);
           
           System.out.print("[1] Enter a NOUN --> ");
           String noun1 = madLib.nextLine();
           System.out.print("[2] Enter a type of VEHICLE --> ");
           String vehicle1 = madLib.nextLine();
           System.out.print("[3] Enter an ADJECTIVE --> ");
           String adjective1 = madLib.nextLine();
           System.out.print("[4] Enter an ADJECTIVE --> ");
           String adjective2 = madLib.nextLine();
           System.out.print("[5] Enter a NOUN --> ");
           String noun2 = madLib.nextLine();
           System.out.print("[6] Enter a NOUN --> ");
           String noun3 = madLib.nextLine();
           System.out.print("[7] Enter an ADJECTIVE --> ");
           String adjective3 = madLib.nextLine();
           System.out.print("[8] Enter a VERB ending in 'ed' --> ");
           String verbEd1 = madLib.nextLine();
           System.out.print("[9] Enter a NOUN --> ");
           String noun4 = madLib.nextLine();
           System.out.print("[10] Enter a NOUN --> ");
           String noun5 = madLib.nextLine();
           System.out.print("[11] Enter a NOUN --> ");
           String noun6 = madLib.nextLine();
           System.out.print("[12] Enter a NOUN --> ");
           String noun7 = madLib.nextLine();
           
           //___________________________________________________________________________________________________________
           
           
            System.out.println("\n         GILLIGAN`S ISLAND THEME\n");
            System.out.println("Just sit right back and you`ll hear a tale,");
            System.out.println("A tale of a fateful "+ noun1 + ",");
            System.out.println("That started from this tropic port,");
            System.out.println("Aboard this tiny " + vehicle1 + ".");
            System.out.println();
            System.out.println("The mate was a " + adjective1 + " sailor man,");
            System.out.println("The skipper " + adjective2 + " and sure.");
            System.out.println("Five " + noun2 + " set sail that day,");
            System.out.println("For a three hour " + noun3 + " , a three hour " + noun3 + ".");
            System.out.println();
            System.out.println("The weather started getting " + adjective3 + ",");
            System.out.println("The tiny " + vehicle1 + " was " + verbEd1 + ",");
            System.out.println("If not for the " + noun4 +" of the fearless crew,");
            System.out.println("The " + noun5 + " would be lost, the " + noun5 + " would be lost.");
            System.out.println();
            System.out.println("The " + vehicle1 + " set ground on the shore of this uncharted desert isle,");
            System.out.println("With Gilligan, The Skipper too,");
            System.out.println("The millionaire and his " + noun6 +", The movie " + noun7 + ","); 
            System.out.println("And The Rest, Here on Gilligan`s Isle.");
    }
}
