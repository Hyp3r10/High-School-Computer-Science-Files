class Student2 extends Person2 //Sub Class
{
    private int gradeLevel;
    
    public Student2()
    {
        System.out.println("Student Constructor Called");
        gradeLevel = 12;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}

