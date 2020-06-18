import java.util.Scanner;

public class LetterGrade
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner(System.in);
        
        System.out.print("Enter a Numerical Grade--> ");
        int grade = bang.nextInt();
        
        if(grade >= 97)
        {
           System.out.println("Letter Grade = A+");
        }
        else if(grade >= 94)
        {
            System.out.println("Letter Grade = A");
        }
        else if(grade >= 90)
        {
            System.out.println("Letter Grade = A-");
        }
        else if(grade >= 87)
        {
            System.out.println("Letter Grade = B+");
        }
        else if(grade >= 84)
        {
            System.out.println("Letter Grade = B");
        }
        else if(grade >= 80)
        {
            System.out.println("Letter Grade = B-");
        }
        else if(grade >= 77)
        {
            System.out.println("Letter Grade = C+");
        }
        else if(grade >= 74)
        {
            System.out.println("Letter Grade = C");
        }else if(grade >= 70)
        {
            System.out.println("Letter Grade = C-");
        }
        else if(grade <= 70)
        {
            System.out.println("Letter Grade = F");
        }
    }
}