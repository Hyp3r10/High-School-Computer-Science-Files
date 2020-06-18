class Student5 extends Person5 //Sub Class
{
    private int gradeLevel;
    
    public Student5(String n, int a, int g)
    {
        super(n,a); //Must be the first statment
        System.out.println("Student Constructor Called");
        gradeLevel = g;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}

