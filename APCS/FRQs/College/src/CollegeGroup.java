import java.util.*;

public class CollegeGroup 
{ 
   private ArrayList <College> myColleges;
   
   public CollegeGroup()
   {
   	  myColleges = new ArrayList <College>();
   }
   
   // precondition:  collegeName exists in this CollegeGroup 
   // postcondition: tuition for collegeName is changed to newTuition 
   public void updateTuition(String collegeName, int newTuition) 
   { 
      for(int i = 0; i < myColleges.size(); i++) {
    	  if(myColleges.get(i).getName().equals(collegeName)) {
    		  myColleges.get(i).setTuition(newTuition);
    		  break;
    	  }
      }
   }
   // precondition:  low <= high 
   // postcondition: returns an ArrayList of colleges in region 
   // where low <= tuition <= high;
   public ArrayList <College> getCollegeList(String region, int low, int high) 
   { 
	   ArrayList<College> colleges = new ArrayList<College>();
	   for(int i = 0; i < myColleges.size(); i++) {
		   if(myColleges.get(i).getRegion().equals(region) && 
			  myColleges.get(i).getTuition() >= low && 
			  myColleges.get(i).getTuition() <= high) {
			   colleges.add(myColleges.get(i));
		   }
	   }
	   return colleges;
   }
   
   public void addCollege(College c)
   {
   	  myColleges.add(c);
   }
   
   public ArrayList <College> getColleges()
   {
   	 return myColleges;
   }

}