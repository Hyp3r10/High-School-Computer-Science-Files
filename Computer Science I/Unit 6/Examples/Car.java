public class Car
{
   String type;
   Wheel carWheel; //TODO Fix this later
   Engine carEngine;
   Paint carPaint;
   
   public Car(String t, int wc, int hp, String pc)
   {
       System.out.println("Car Constructor Called");
       type = t; 
       carWheel = new Wheel(wc); //TODO Fix this later
       carEngine = new Engine(hp);
       carPaint = new Paint(pc);
   }
   public String toString()
   {
       return "Car Type :: " + type + 
            "\nWheel Count :: " + carWheel.getWheelCount() + 
            "\nHorse Power :: " + carEngine.getHorsePower() + 
            "\nPaint Color :: " + carPaint.getPaintColor();
   }
}