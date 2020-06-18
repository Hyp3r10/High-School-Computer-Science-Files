import java.util.Scanner;

public class RPGFightSimple
{
    public static void main (String[] args)
    {
        Scanner demogorgon = new Scanner(System.in);
         
        int hit1 = (int)(Math.random()*(20));
        int hit2 = (int)(Math.random()*(20));
        int hit3 = (int)(Math.random()*(20));
        int hit4 = (int)(Math.random()*(20));
        int hit5 = (int)(Math.random()*(20));
        int hit6 = (int)(Math.random()*(20));
        int exp = (int)(Math.random()*(126)+5);

        int maxHit = (int)(Math.max(hit1, Math.max(hit2, Math.max(hit3, Math.max(hit4, Math.max(hit5, hit6))))));
        int minHit = (int)(Math.min(hit1, Math.min(hit2, Math.min(hit3, Math.min(hit4, Math.min(hit5, hit6))))));
        double avg = (hit1 + hit2 + hit3 + hit4 + hit5 + hit6) / 6;
        int roundedAvg = (int)Math.round(avg);

        
        System.out.print("\n\nYou wake up to hear a loud scream.");
        System.out.print("\nEverybody knows that a scream of that caliber could only come from your sister.");
        System.out.print("\nYou quickly hop out of bed and rush to your sister's room.");
        System.out.print("\nYou open your sister's door to see what lies beyond.");
        System.out.print("\nA dangereous demogorgon jumps out and attacks!");
        System.out.print("\nYou swiftly release your own demogorgon to defend yourself and your family:");
        

        System.out.print("\n\nYou hit the demogorgon for " + hit1 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit2 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit3 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit4 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit5 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit6 + " points of damage.");

        System.out.print("\n\nThe demogorgon falls to the floor, lifeless.");
        System.out.print("\nCongradulations! You earned " + exp + " points of experience.");
        

        System.out.print("\n\nBattle Summary");
        System.out.print("\n==============");
        System.out.print("\nMax Hit: " + maxHit);
        System.out.print("\nMin Hit: " + minHit);
        System.out.print("\nHit Average: " + roundedAvg);
    }
}