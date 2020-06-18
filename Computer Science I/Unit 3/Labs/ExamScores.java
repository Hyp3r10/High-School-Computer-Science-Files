import java.util.Scanner;

public class ExamScores
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner(System.in);
        int grade = 0;
        int gradeCount = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        
        System.out.println("To stop entering in grades, please enter '-1'.\n\n");
        while(grade != -1)
        {
            System.out.print("Enter grade " + (gradeCount +1) + ": ");
            grade = bang.nextInt();
            gradeCount++;
            if(grade >= 90)
            {
                aCount++;
            }
            else if(grade >= 80)
            {
                bCount++;
            }
            else if(grade >= 70)
            {
                cCount++;
            }
            else if(grade >= 60)
            {
                dCount++;
            }
            else if(grade < 60)
            {
                if(grade > -1)
                {
                    fCount++;
                }
            }
        }
        
        
        System.out.println("\n\n============================");
        System.out.println("       Summary Report");
        System.out.println("============================");
        System.out.println("Total number of grades = " + (gradeCount -1));
        System.out.println("Number of A's = " + aCount);
        System.out.println("Number of B's = " + bCount);
        System.out.println("Number of C's = " + cCount);
        System.out.println("Number of D's = " + dCount);
        System.out.println("Number of F's = " + fCount);
    }
}