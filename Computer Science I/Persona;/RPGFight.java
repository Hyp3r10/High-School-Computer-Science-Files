/**
 *Need to work on:
 *Rounded Avg + Ending Sequence
 */

import java.util.Scanner;

public class RPGFight
{
    public static void main (String[] args)
    {
        Scanner demogorgon = new Scanner(System.in);
        
        String playerName = "";
         
        int hit1 = (int)(Math.random()*(20));
        int hit2 = (int)(Math.random()*(20));
        int hit3 = (int)(Math.random()*(20));
        int hit4 = (int)(Math.random()*(20));
        int hit5 = (int)(Math.random()*(20));
        int hit6 = (int)(Math.random()*(20));
        int exp = (int)(Math.random()*(126)+5);
        boolean hPerson = true;

        int maxHit = (int)(Math.max(hit1, Math.max(hit2, Math.max(hit3, Math.max(hit4, Math.max(hit5, hit6))))));
        int minHit = (int)(Math.min(hit1, Math.min(hit2, Math.min(hit3, Math.min(hit4, Math.min(hit5, hit6))))));
        double avg = (hit1 + hit2 + hit3 + hit4 + hit5 + hit6) / 6;
        int roundedAvg = (int)Math.round(avg);

        System.out.print("Hello there! Welcome to the world of demogorgon! My name is Postachio!\nPlease press enter to continue..."); 
        demogorgon.nextLine();
        System.out.print("\nPeople call me the demogorgon Prof!\nPlease press enter to continue..."); 
        demogorgon.nextLine();  
        System.out.print("\nThis world is inhabited by creatures called demogorgon!\nPlease press enter to continue...");
        demogorgon.nextLine();      
        System.out.print("\nFor some people, demogorgon are pets. Others use them for fights.\nPlease press enter to continue..."); 
        demogorgon.nextLine();      
        System.out.print("\nMyself...I study demogorgon as a profession.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\n\nFirst, what is your name?");
        playerName = demogorgon.next();
        System.out.print("\nRight! So your name is " + playerName + "!\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\n" + playerName + "! Your very own demogorgon legend is about to unfold!\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nA world of dreams and adventures with demogorgon awaits!\nPlease press enter to continue...");
        demogorgon.nextLine();        
        System.out.print("\nLet's go!\nPlease press enter to continue...");
        demogorgon.nextLine();

        System.out.print("\n\nYou wake up to hear a loud scream.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nEverybody knows that a scream of that caliber could only come from your sister.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nYou quickly hop out of bed and rush to your sister's room.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nYou open your sister's door to see what lies beyond.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nA dangereous demogorgon jumps out and attacks!\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nYou swiftly release your own demogorgon to defend yourself and your family:\nPlease press enter to continue...");
        demogorgon.nextLine();
        

        System.out.print("\n\nYou hit the demogorgon for " + hit1 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit2 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit3 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit4 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit5 + " points of damage.");
        System.out.print("\nYou hit the demogorgon for " + hit6 + " points of damage.\nPlease press enter to continue...");
        demogorgon.nextLine();

        System.out.print("\n\nThe demogorgon falls to the floor, lifeless.");
        System.out.print("\nCongradulations! You earned " + exp + " points of experience\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nYet at the same time you feel like a horriable person for");
        System.out.print("\nkilling such an innocent creature.\nPlease press enter to continue...");
        demogorgon.nextLine();
        System.out.print("\nBut everyone will see you as a hero, but yourself.\nPlease press enter to continue...");
        demogorgon.nextLine();

        System.out.print("\n\nBattle Summary");
        System.out.print("\n==============");
        System.out.print("\nMax Hit: " + maxHit);
        System.out.print("\nMin Hit: " + minHit);
        System.out.print("\nHit Average: " + roundedAvg);
        System.out.print("\nHorriable person: " + hPerson);

    }
}