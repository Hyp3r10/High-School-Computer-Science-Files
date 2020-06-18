class Person7 //Super Class
{
    protected int age;
    protected String name;
    
    public Person7(String n, int a)
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
    
    public void outputStuff()
    {
        System.out.println("This is from the SUPER class");
    }
    
    public String toString()
    {
        String output = "";
        
        output += "\nName: " + getName() +
                  "\nAge:  " + getAge();
                  
        return output;
    }
}