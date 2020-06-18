public class Favorites
{
   // instance variables
   private String name;       // The peron's name
   private String food;       // Favorite food
   private String color;      // Favorite color
   private String music;      // Favorite music
   private String automobile; // Favorite automobile
   private String sport;      // Favorite sport
   // constructors
   public Favorites(String n, String ff, String fc, String fm, String fa, String fs)
   {
       name = n;
       food = fm;
       color = fc;
       music = fm;
       automobile = fa;
       sport = fs;
   }
   // toString method
   public String toString()
   {
       return "\n\nName :: " + name + 
                "\nFood :: " + food + 
               "\nColor :: " + color + 
               "\nMusic :: " + music + 
          "\nAutomobile :: " + automobile + 
               "\nSport :: " + sport;
   }
}