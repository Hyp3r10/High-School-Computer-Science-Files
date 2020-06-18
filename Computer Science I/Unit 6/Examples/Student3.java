class Student3 extends Person3 //Sub Class
{
    private int gradeLevel;
    
    public Student3(int g)
    {
        System.out.println("Student Constructor Called");
        gradeLevel = g;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}

