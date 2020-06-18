import java.util.Date;

public class TimeInterval
 {
 	  // instance variables
 	  private Date timeBegin;
 	  private Date timeEnd;
 	  
 	  public TimeInterval(long begin, long end)
 	  {
 	  	 timeBegin = new Date(begin);
 	  	 timeEnd = new Date(end);
 	  }
 	  
      // returns true if interval overlaps with this TimeInterval;
      // otherwise, returns false
      
      public boolean overlapsWith(TimeInterval interval)
      { 
         if(interval.timeBegin.getTime() >= timeBegin.getTime() && interval.timeBegin.getTime() <= timeEnd.getTime() ||
            interval.timeEnd.getTime() <= timeEnd.getTime() && interval.timeEnd.getTime() >= timeBegin.getTime() || 
            timeBegin.getTime() >= interval.timeBegin.getTime() && timeBegin.getTime() <= interval.timeEnd.getTime() ||
            timeEnd.getTime() <= interval.timeEnd.getTime() && timeEnd.getTime() >= interval.timeBegin.getTime())
            
            return true;
         else
            return false;
      }
      
      public String toString()
      {
      	 return timeBegin.getTime() + " " + timeEnd.getTime();
      }
}