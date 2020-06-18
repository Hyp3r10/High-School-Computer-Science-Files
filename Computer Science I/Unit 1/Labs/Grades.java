public class Grades
{
    public static void main (String[] args)
    {
        // (1) Createing 4 varibales (type double) and assigning their values
        double dailyAvg = 88;
        double quizAvg = 74;
        double testAvg = 95;
        double sixWeeksAvg = 0;
        
        // (2) Creating variable roundedAvg and assigning its value
        int roundedAvg = 0;
        
        // (3) Calculating the sixWeeksAvg
        sixWeeksAvg = (dailyAvg * 0.3) + (quizAvg * 0.2) + (testAvg * 0.5);
        
        // (4) Rounding the average to the nearest integer
        sixWeeksAvg += 0.5;
        roundedAvg = (int) sixWeeksAvg;
        
        // (5)
        System.out.println("Daily Average = " + dailyAvg);
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Test Average = " + testAvg);
        System.out.println("--------------------------");
        System.out.println("Six Weeks Average = " + roundedAvg);
    }
}