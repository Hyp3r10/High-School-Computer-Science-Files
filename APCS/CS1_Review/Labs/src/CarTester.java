public class CarTester
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1000, 1450, 20);  // instantiate Car object
        
        System.out.println("  Car 1");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n",  car1.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car1.milesToEmpty());
        
        Car car2 = new Car(15000, 15200, 12);
        
        System.out.println();
        System.out.println("  Car 2");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n", car2.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car2.milesToEmpty());
        
        Car car3 = new Car(80000, 80727, 21);
        
        System.out.println();
        System.out.println("  Car 3");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n", car3.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car3.milesToEmpty());        
   }
}