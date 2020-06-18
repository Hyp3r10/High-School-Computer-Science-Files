import java.util.*;

public class TestResults
{
   private ArrayList<StudentAnswerSheet> sheets;
   
   // constructor
   public TestResults()
   {
   	  sheets = new ArrayList<StudentAnswerSheet>();
   }
   
   public void add(StudentAnswerSheet s)
   {
   	  sheets.add(s);
   }
   
   // Part (b)
   /** Precondition: sheets.size() > 0;
    *                all answer sheets in sheets have the same number of answers
    *  @param key the list of correct answers represented as strings of length one
    *         Precondition: key.size() is equal to the number of answers
    *                       in each of the answer sheets in sheets
    *  @return the name of the student with highest score
    */
   public String highestScoringStudent(ArrayList<String> key)
   {   
	   int highestIndex = 0;
	   double previousScore = Double.MIN_VALUE;
	   for(int i = 0; i < sheets.size(); i++) {
		   if(sheets.get(i).getScore(key) >= previousScore) {
			   previousScore = sheets.get(i).getScore(key);
			   highestIndex = i;
		   }
	   }
     return sheets.get(highestIndex).getName();
    
   }
   
   
   // There may be fields, constructors, and methods that are not shown.
  
}