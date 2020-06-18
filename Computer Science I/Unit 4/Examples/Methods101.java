public class Methods101
{
    public String weekdayName(int day) // All the normal paramaters put together is called the method signature.
    {
        /**
         * Java requires a "catch-all" return statement in the return methods
         * otherwise it generates a compile error.
         * To fix thos either use an else or a return statement at the end of the method.
         */
        if(day == 0)
        {
            return "\nSunday";
        }
        else if(day == 1)
        {
            return "\nMonday";
        }
        else if(day == 2)
        {
            return "\nTuesday";
        }
        else if(day == 3)
        {
            return "\nWednesday";
        }
        else if(day == 4)
        {
            return "\nPre-Friday";
        }
        else if(day == 5)
        {
            return "\nActual Friday";
        }
        else if(day == 6)
        {
            return "\nSaturday";
        }
        else
        {
            return "\nIllegal Weekday";
        }
    }
}