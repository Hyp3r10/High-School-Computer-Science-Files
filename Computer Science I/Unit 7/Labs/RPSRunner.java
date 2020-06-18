//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response;
        
        //add in a do while loop after you get the basics up and running
        do{
            String player = "";
            String ynChoice = "";
            
            System.out.print("type in your prompt [R,P,S] :: ");
            player = keyboard.nextLine();
            RockPaperScissors game = new RockPaperScissors(player);    
            System.out.println(game);
            
            System.out.print("\n\nDo you want to play again? ");
            String choice = keyboard.nextLine();
            response = choice.charAt(0);
          }while(response == 89 || response == 121);
    }
}


