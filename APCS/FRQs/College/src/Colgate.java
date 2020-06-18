public class Colgate implements College
{
   // instance variables
   private int tuition;
   
   // constructor
   public Colgate(int t)
   {
   	  tuition = t;
   }
   public String getName()
   {
   	  return "Colgate University";
   } 
   public String getRegion()
   {
   	  return "Northeast";
   }
   public int getTuition()
   {
   	 return tuition;
   } 
   public void setTuition(int newTuition)
   {
   	  tuition = newTuition;
   }
}