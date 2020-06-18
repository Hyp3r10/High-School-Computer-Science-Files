public class Farm
{
   public static void main(String[] args)
   {
       FarmAnimal farm1 = new FarmAnimal();
       FarmAnimal farm2 = new FarmAnimal("John Chisum", 50, 12, 5, 10);
       
       System.out.println("****************************");
       System.out.println("  Test Default Constructor");
       System.out.println("****************************");
       System.out.println("Farmer Name : " + farm1.getName());       // call accessor methods
       System.out.println("Cows        : " + farm1.getCows());
       System.out.println("Horses      : " + farm1.getHorses());
       System.out.println("Pigs        : " + farm1.getPigs());
       System.out.println("Chickens    : " + farm1.getChickens());
       System.out.println();
       System.out.println("****************************");
       System.out.println("    Test 2nd Constructor");
       System.out.println("****************************");
       System.out.println("Farmer Name : " + farm2.getName());
       System.out.println("Cows        : " + farm2.getCows());
       System.out.println("Horses      : " + farm2.getHorses());
       System.out.println("Pigs        : " + farm2.getPigs());
       System.out.println("Chickens    : " + farm2.getChickens());
       System.out.println();
   }    
}