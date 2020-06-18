class Student7 extends Person7 //Sub Class
{
    private int gradeLevel;
    
    public Student7(String n, int a, int g)
    {
        super(n,a); //Must be the first statment
        //System.out.println("Student Constructor Called");
        gradeLevel = g;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    public void ouputStuff()
    {
        super.outputStuff();
        System.out.println("This is from the SUB class");
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

