public class Inheritance101
{
    public static void main(String[] args)
    {
        Person per = new Person();
        
        System.out.println("The person's age is: " + per.getAge());
        // Objects of the Person class (super) do not have access to the student class (sub).
        //System.out.println("The person's GradeLevel is: " + per.getGradeLevel());
        
        Student stu = new Student();
        
        System.out.println("The student's GradeLevel is: " + stu.getGradeLevel()); 
        System.out.println("The student's age is: " + stu.getAge());
        
    }
}

class Person //Super Class
{
    private int age;
    
    public int getAge()
    {
        return age;
    }
}

class Student extends Person //Sub Class
{
    private int gradeLevel = 12;
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}

