public class Student101
{
    // Attributes (Instance Variables)
    private String name;
    private int gradeLevel;
    private double gpa;
    private String secretInfo;
    //Constructor
    public Student101()
    {
        name = "";
        gradeLevel = 0;
        gpa = 0.0;
        secretInfo = "";
    }
    public Student101(String n, int g, double gpa, String shhh)
    {
        name = n;
        gradeLevel = g;
        this.gpa = gpa; // "this" refers to the local variable (instance variable)
        secretInfo = shhh;
    }
    // Accessors or Getters
    public String getName()
    {
        return name;
    }
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    public double getGPA()
    {
        return gpa;
    }
    // Mutators or Setters
    {
        /**
          * There are no mutators in this program because we dont want the user to have 
          * "write access", the ability ro change the contents of the instance variables(attributes).
          */
    }
    // toString method
    public String toString()
    {
        //Can reference the attribute (instance variable) directly or call the accessor method
        return "Name :: " + getName() + 
        "\nGrade Level :: " + getGradeLevel() + 
        "\nGPA :: " + getGPA();
        //"\nSecret Info :: " + secretInfo;
        
        /*
         * You dont have to include all the atrributes
         * you can inclued as much or as little as you want
         * Dont include sensitive information
         * 
         */
    }
}