class Person5 //Super Class
{
    private int age;
    private String name;
    
    public Person5(String n, int a)
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