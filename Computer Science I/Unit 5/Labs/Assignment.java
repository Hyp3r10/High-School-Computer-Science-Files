public class Assignment
{
   // instance variables
   private String name;
   private String type;
   private int score;
   // constructors
   /**
    * @param name, type :: ask Stites for null v. ""
    */
   public Assignment()
   {
       name = null;
       type = null;
       score = 0;
   }
   public Assignment(String t, String n, int s)
   {
       type = t;
       name = n;
       score = s;
   }
   // accessor methods
   public String getName()
   {
       return name;
   }
   public String getType()
   {
       return type;
   }
   public int getScore()
   {
       return score;
   }
   // mutator methods
   public String changeName(String n)
   {
       name = n;
       return name;
   }
   public String changeType(String t)
   {
       type = t;
       return type;
   }
   public int changeScore(int s)
   {
       score = s;
       return score;
   }
   // other methods
   public char getLetterGrade()
   {
       if(score >= 90)
        {
           char letterGrade = 'A';
           return letterGrade;
        }
        else if(score >= 80)
        {
            char letterGrade = 'B';
            return letterGrade;
        }
        else if(score >= 70)
        {
            char letterGrade = 'C';
            return letterGrade;
        }
        else if(score >= 60)
        {
            char letterGrade = 'D';
            return letterGrade;
        }
        else
        {
            char letterGrade = 'F';
            return letterGrade;
        } 
   }
   public String toString()
   {
       return "Type         : " + getType() + 
              "\nName         : " + getName() + 
              "\nScore        : " + getScore() + 
              "\nLetter Grade : " + getLetterGrade() + 
              "\n";
   }
}