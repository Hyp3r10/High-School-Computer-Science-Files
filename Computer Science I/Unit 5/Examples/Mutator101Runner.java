import java.util.Scanner;
public class Mutator101Runner 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number --> ");
        int number1 = scan.nextInt();
        System.out.print("Enter Second number --> ");
        int number2 = scan.nextInt();
        
        Mutator101 mu = new Mutator101(number1, number2);
        
        System.out.println("num1 :: " + mu.getNum1());
        System.out.println("num2 :: " + mu.getNum2());
        
        mu.SetNum1(3);
        mu.SetNum2(7);
        
        System.out.println("num1 :: " + mu.getNum1());
        System.out.println("num2 :: " + mu.getNum2());
    }
}