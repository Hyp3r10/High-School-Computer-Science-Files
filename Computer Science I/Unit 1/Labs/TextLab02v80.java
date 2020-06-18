public class TextLab02v80
{
    public static void main(String args[])
    {
        //
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        int startingSeconds = 10000;
        int hours = startingSeconds / SECONDS_IN_HOUR;
        int minutes = (startingSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = startingSeconds % SECONDS_IN_MINUTE;
        
        System.out.println("TextLab02, 80 Point Version\n");
        System.out.println("Starting seconds: " + startingSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}