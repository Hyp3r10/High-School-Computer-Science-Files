import java.util.Scanner;
public class MorseCode
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a letter :: ");
        String user = scan.nextLine();
        switch(user)
        {
            case "A":
                System.out.println("A is . - in morse!");
                break;
            case "B":
                System.out.println("B is - . . . in morse!");
                break;
            case "C":
                System.out.println("C is - . - . in morse!");
                break;   
            case "D":
                System.out.println("D is - . . in morse!");
                break;    
            case "E":
                System.out.println("E is . in morse!");
                break;
            case "F":
                System.out.println("F is . . - . in morse!");
                break;
            case "G":
                System.out.println("G is - - . in morse!");
                break;
            case "H":
                System.out.println("H is . . . . in morse!");
                break;
            case "I":
                System.out.println("I is . .  in morse!");
                break;
            case "J":
                System.out.println("J is . - - - in morse!");
                break;
            case "K":
                System.out.println("K is - . - in morse!");
                break;
            case "L":
                System.out.println("L is . - . . in morse!");
                break;
            case "M":
                System.out.println("M is - - in morse!");
                break;
            case "N":
                System.out.println("N is - . in morse!");
                break;
            case "O":
                System.out.println("O is - - - in morse!");
                break;
            case "P":
                System.out.println("P is . - - . in morse!");
                break;
            case "Q":
                System.out.println("Q is - - . -  in morse!");
                break;
            case "R":
                System.out.println("R is . - . in morse!");
                break;
            case "S":
                System.out.println("S is . . . in morse!");
                break;
            case "T":
                System.out.println("T is - in morse!");
                break;
            case "U":
                System.out.println("U is . . - in morse!");
                break;
            case "V":
                System.out.println("V is . . . - in morse!");
                break;
            case "W":
                System.out.println("W is . - - in morse!");
                break;
            case "X":
                System.out.println("X is - . . - in morse!");
                break;
            case "Y":
                System.out.println("Y is - . - - in morse!");
                break;
            case "Z":
                System.out.println("Z is - - . . in morse!");
                break;
            case "0":
                System.out.println("0 is - - - - - in morse!");
                break;
            case "1":
                System.out.println("1 is . - - - - in morse!");
                break;  
            case "2":
                System.out.println("2 is . . - - - in morse!");
                break;
            case "3":
                System.out.println("3 is . . . - - in morse!");
                break;
            case "4":
                System.out.println("4 is . . . . - in morse!");
                break;    
            case "5":
                System.out.println("5 is . . . . . in morse!");
                break;
            case "6":
                System.out.println("6 is - . . . . in morse!");
                break;
            case "7":
                System.out.println("7 is - - . . . in morse!");
                break;
            case "8":
                System.out.println("8 is - - - . . in morse!");
                break;    
            case "9":
                System.out.println("9 is - - - - . in morse!");
                break;    
        }
    }
}