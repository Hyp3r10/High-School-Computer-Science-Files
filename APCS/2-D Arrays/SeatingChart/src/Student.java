public class Student
{
    // instance variables
    private String name;
    private String id;

    // default constructor
    public Student()
    {
        name = "vacant";
        id = "";
    }

    // another constructor
    public Student(String n, String i)
    {
        name = n;
        id = i;
    }

    // mutator methods
    public void setName(String n)
    {
        name = n;
    }

    public void setID(String i)
    {
        id = i;
    }

    // accessor methods
    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return id;
    }

    // toString method
    public String toString()
    {
        return String.format("%-10s", name);
    }
}