public class BoxTester
{
    public static void main(String[] args)
    {
        Box box1 = new Box(4);   // instantiate box object
        
        System.out.println("  Box 1");
        System.out.println("=========");
        System.out.println("Area = " + box1.calculateArea());
        System.out.println("Volume = " + box1.calculateVolume());
        
        Box box2 = new Box(10);
        
        System.out.println("\n  Box 2");
        System.out.println("=========");
        System.out.println("Area = " + box2.calculateArea());
        System.out.println("Volume = " + box2.calculateVolume());
        
        Box box3 = new Box(150);
        
        System.out.println("\n  Box 3");
        System.out.println("=========");
        System.out.println("Area = " + box3.calculateArea());
        System.out.println("Volume = " + box3.calculateVolume());
        
    }
}
