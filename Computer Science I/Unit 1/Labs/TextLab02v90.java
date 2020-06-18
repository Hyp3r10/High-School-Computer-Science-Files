import java.util.Scanner;

public class TextLab02v90
{
    public static void main(String args[])
    {
        Scanner time = new Scanner (System.in);
        
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        
        int startingSeconds = 0;
        
        System.out.println("TextLab02, 90 Point Version\n");
        System.out.print("Please enter starting seconds--> ");
        startingSeconds = time.nextInt();
        
        int hours = startingSeconds / SECONDS_IN_HOUR;
        int minutes = (startingSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = startingSeconds % SECONDS_IN_MINUTE;
        
        System.out.println("Starting Seconds: " + startingSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}