import java.util.*;

public class FavoritesManager
{  
   //instance variables
   private Favorites myFavorites;
   // methods
   public void inputFavorites()
   {
       Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter person's name --> ");
       String name = keyboard.nextLine();
       System.out.print("Enter favorite food --> ");
       String food = keyboard.nextLine();
       System.out.print("Enter favorite color --> ");
       String color = keyboard.nextLine();
       System.out.print("Enter favorite music --> ");
       String music = keyboard.nextLine();
       System.out.print("Enter favorite automobile --> ");
       String auto = keyboard.nextLine();
       System.out.print("Enter favorite sport --> ");
       String sport = keyboard.nextLine();
       myFavorites = new Favorites(name, food, color, music, auto, sport);
   }
   public void printFavorites()
   {
       System.out.println(myFavorites.toString());
   }
   public static void main(String[] args)
   {
       FavoritesManager app = new FavoritesManager();
       app.inputFavorites();
       app.printFavorites(); 
   }    
}