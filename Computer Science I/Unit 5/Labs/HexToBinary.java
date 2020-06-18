import java.util.Scanner;
public class HexToBinary
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter :: ");
        String user = scan.nextLine();
        char userChar = user.charAt(0);
        
        switch(userChar)
        {
            case 'A':
                System.out.println("A is 1010 in binary!");
                break;
            case 'B':
                System.out.println("B is 1011 in binary!");
                break;
            case 'C':
                System.out.println("C is 1100 in binary!");
                break;
            case 'D':
                System.out.println("D is 1101 in binary!");
                break;
            case 'E':
                System.out.println("E is 1110 in binary!");
                break;
            case 'F':
                System.out.println("F is 1111 in binary!");
                break;
            default:
                System.out.println(user + " is ERROR in binary!");
                break;
        }
    }
}