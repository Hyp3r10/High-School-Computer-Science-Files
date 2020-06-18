class Student6 extends Person6 //Sub Class
{
    private int gradeLevel;
    
    public Student6(String n, int a, int g)
    {
        super(n,a); //Must be the first statment
        System.out.println("Student Constructor Called");
        gradeLevel = g;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    public String toString()
    {
        String output = "";
        
        /*output += "\nName: " + name +
                  "\nAge:  " + age +*/
                  
         /*output += "\nName: " + getName() +
                  "\nAge:  " + getAge() +  */
                  
       output += super.toString() +
                  "\nGrade Level: " + getGradeLevel();
        
        return output;       
    }
}

