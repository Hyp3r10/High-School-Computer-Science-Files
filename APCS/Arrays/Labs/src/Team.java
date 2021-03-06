import java.util.*;

public class Team {
    // instance variables
	private Player[] players;
	private int numPlayers;
    // constructor
	
    /* This method allows a user to input up to 20 basketball players and 
     *  stores them in an array.
     */
    public void addPlayers() {
        Scanner keyboard = new Scanner(System.in);
        players = new Player[20];
        int len = players.length;
        String response = "";
        
        System.out.println("************************");
        System.out.println("*      addPlayers      *");
        System.out.println("************************");  
        
        do {
        	System.out.print("Enter player name--> ");
        	String playerName = keyboard.nextLine();
        	System.out.print("Enter free throws made --> ");
        	int ftm = keyboard.nextInt();
        	System.out.print("Enter free throws attempted --> ");
        	int fta = keyboard.nextInt();
        	System.out.print("Enter 2 pt field goals made --> ");
        	int fg2m = keyboard.nextInt();
        	System.out.print("Enter 2 pt field goals attempted --> ");
        	int fg2a = keyboard.nextInt();
        	System.out.print("Enter 3 pt fields goals made --> ");
        	int fg3m = keyboard.nextInt();
        	System.out.print("Enter 3 pt fields goals attempted --> ");
        	int fg3a = keyboard.nextInt();
        	
        	keyboard.nextLine();
        	
        	players[numPlayers] = new Player(playerName, ftm, fta, fg2m, fg2a, fg3m, fg3a);
        	
        	numPlayers++;
        	
        	System.out.print("\nEnter another player? <y/n> :: ");
        	response = keyboard.nextLine();
        	
        	System.out.println();
        } while(numPlayers < len && response.equalsIgnoreCase("y"));
        keyboard.close();
    }
    /* This method displays each Player in the array 
     */
    public void printPlayers() {
    	System.out.println("\n************************");
        System.out.println("*     printPlayers     *");
        System.out.println("************************"); 
    	for(int i = 0; i < numPlayers; i++) {
    		System.out.println(players[i] + "\n");
    	}
    }
    public static void main(String[] args) {
        Team app = new Team();
        app.addPlayers();
        app.printPlayers();
    }
}