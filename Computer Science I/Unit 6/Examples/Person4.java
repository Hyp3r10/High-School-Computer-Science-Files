class Person4 //Super Class
{
    private int age;
    private String name;
    
    public Person4(String n, int a)
    {
        System.out.println("Person Constructor Called");
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
}