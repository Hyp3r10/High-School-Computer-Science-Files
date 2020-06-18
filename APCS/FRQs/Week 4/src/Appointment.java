 public class Appointment
 {
 	  // instance variables
 	  private TimeInterval timeInterval;
 	  private String description;
 	  
 	  public Appointment(String d, long begin, long end)
 	  {
 	  	 description = d;
 	  	 timeInterval = new TimeInterval(begin, end);
 	  }
 	  
      // returns the time interval of this Appointment
      public TimeInterval getTime()
      { 
         return timeInterval;
      }
      
      // returns the description of this Appointment
      public String getDescription()
      {
      	 return description;
      }
      
      // part(a)
      // returns true if the time interval of this Appointment
      // overlaps with the time interval of other;
      // otherwise, returns false
      public boolean conflictsWith(Appointment other)
      { 
    	  return getTime().overlapsWith(other.getTime());
      }
}