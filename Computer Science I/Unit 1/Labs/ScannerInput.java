import java.util.Scanner;

public class ScannerInput
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("\t Input ");
        System.out.println("-----------------------");
        
        
        // Creating and initializing the integers
        int intOne, intTwo;
        
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        
        // Creating and initializing the doubles
        double doubleOne, doubleTwo;
        
        System.out.print("\nEnter a double :: ");
        doubleOne = keyboard.nextDouble();
        
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        
        // Creating and initializing the floats
        float floatOne, floatTwo;
        
        System.out.print("\nEnter a float :: ");
        floatOne = keyboard.nextFloat();
        
        System.out.print("Enter a float :: ");
        floatTwo = keyboard.nextFloat();
        
        // Creating and initializing the shorts
        short shortOne, shortTwo;
        
        System.out.print("\nEnter a short :: ");
        shortOne = keyboard.nextShort();
        
        System.out.print("Enter a short :: ");
        shortTwo = keyboard.nextShort();
        
        // Creating and initializing the bytes
        byte byteOne, byteTwo;
        
        System.out.print("\nEnter a byte :: ");
        byteOne = keyboard.nextByte();
        
        System.out.print("Enter a byte :: ");
        byteTwo = keyboard.nextByte();
        
        // Creating and initializing the longs
        long longOne, longTwo;
        
        System.out.print("\nEnter a long :: ");
        longOne = keyboard.nextLong();
        
        System.out.print("Enter a long :: ");
        longTwo = keyboard.nextLong();
        
        
        // Printing out the Results
        System.out.println("");
        System.out.println("\tOutput ");
        System.out.println("-----------------------");
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println("\ndouble one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println("\nfloat one = " + floatOne);
        System.out.println("float two = " + floatTwo);
        System.out.println("\nshort one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println("\nbyte one = " + byteOne);
        System.out.println("byte two = " + byteTwo);
        System.out.println("\nlong one = " + longOne);
        System.out.println("long two = " + longTwo);

    }
}