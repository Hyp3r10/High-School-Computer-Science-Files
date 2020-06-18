import java.util.Scanner;

public class TextLab02v100
{
    public static void main(String args[])
    {
        Scanner time = new Scanner (System.in);
        
        final int MILLISECONDS_IN_HOUR = 3600000;
        final int MILLISECONDS_IN_MINUTE = 60000;
        final int MILLISECONDS_IN_SECOND = 1000;
        int startingMilliseconds = 0;
        
        System.out.println("TextLab02, 100 Point Version\n");
        System.out.print("Please enter milliseconds--> ");
        startingMilliseconds = time.nextInt();
        
        int hours = startingMilliseconds / MILLISECONDS_IN_HOUR;
        int minutes = (startingMilliseconds % MILLISECONDS_IN_HOUR) / MILLISECONDS_IN_MINUTE;
        int seconds = (startingMilliseconds % MILLISECONDS_IN_MINUTE) / MILLISECONDS_IN_SECOND;
        int milliseconds = ((startingMilliseconds % MILLISECONDS_IN_MINUTE) % MILLISECONDS_IN_SECOND);
        
        System.out.println("Starting Milliseconds: " + startingMilliseconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Milli Seconds: " + milliseconds);
    }
}