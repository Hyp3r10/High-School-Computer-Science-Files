import java.util.Scanner;

public class RichterScale
{
    public static void main (String[] args)
    {
        Scanner scale = new Scanner(System.in);
        
        System.out.print("Enter a magnitude on the Richter scale ==>> ");
        double rScale = scale.nextDouble();
        
        if (rScale >= 8.0)
            System.out.println("\nDamage = Most structures fall");
        else if (rScale >= 7.0)  
            System.out.println("\nDamage = Most buildings destroyed");
        else if (rScale >= 6.0)
            System.out.println("\nDamage = Many buildings considerably damaged; some collapse");
        else if (rScale >= 4.5)
            System.out.println("\nDamage = Damage to poorly constructed buildings");
        else if (rScale >= 3.5)
            System.out.println("\nDamage = Felt by many people, no destruction");
        else if (rScale >= 0.0)
            System.out.println("\nDamage = Generally not felt by people");
    }
}
