import java.util.Scanner;
public class CombinationLockTest
{
    public static void main(String args[])
    {
        CombinationLock myLock = new CombinationLock("11-22-33");
        Scanner scan = new Scanner(System.in);
        
        System.out.println(myLock);
        System.out.println();
        myLock.open();
        System.out.println(myLock);
        myLock.close();
        
        System.out.println();
        System.out.println("Change the combination to 44-55-66");
        System.out.print("Enter the new combination :: ");
        String combo = scan.nextLine();
        myLock.setCombination(combo);
        System.out.println("Combination has been successfully changed.");
        System.out.println();
        
        myLock.open();
        System.out.println(myLock);
        myLock.close();
        
        System.out.println();
        System.out.println("Type an incorrect combination.");
        
        myLock.open();
        System.out.println(myLock);
        myLock.close();
        
    }
}