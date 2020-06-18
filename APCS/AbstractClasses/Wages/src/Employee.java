public abstract class Employee
{
    // instance variables
    private String name;
    private String ssNum;
    
    // constructor
    public Employee(String n, String s)
    {
       name = n;
       ssNum = s;   
    }
    
    public String getName()
    {
      return name;  
    }
    
    public String getSSNum()
    {
      return ssNum; 
    }
    
    // returns an employee's monthly salary
    public abstract double getSalary();
    
}