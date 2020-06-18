class Person6 //Super Class
{
    protected int age;
    protected String name;
    
    public Person6(String n, int a)
    {
        //System.out.println("Person Constructor Called");
        age = a;
        name = n;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String output = "";
        
        output += "\nName: " + getName() +
                  "\nAge:  " + getAge();
                  
        return output;
    }
}