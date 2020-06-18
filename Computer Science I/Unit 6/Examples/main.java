class test 
{
    public test()
    {
        System.out.println("Student Constructor called");
    }
}
class test3 extends test
{
    public test3()
    {
        System.out.println("3");
    }
}
public class main
{
    public static void main(String args[])
    {
        test3 t = new test3();
    }
}