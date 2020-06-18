public class Methods102
{
    public void MethodOne() 
    {
        System.out.println("Juan");
        // Does not need an identifier because it is being called by a method in the same clss
        MethodTwo(); // Methods that are called by other methods are "helper methods"
    }
    private void MethodTwo()// Helper method, helper methods should only be accessed by methods within the same class.
    {
        System.out.println("too");
    }
}