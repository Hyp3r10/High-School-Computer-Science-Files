//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;
    private String winner;
    public RockPaperScissors()
    {
        playChoice = "";
        compChoice = "";
    }
    public RockPaperScissors(String player)
    {
        setPlayers(player);
    }
    public void setPlayers(String player)
    {
        playChoice = player;
        int compIntChoice = (int) (Math.random()*3);
        if(compIntChoice == 0){
            compChoice = "R";
        }
        else if(compIntChoice == 1){
            compChoice = "P";
        }
        else if(compIntChoice == 2){
            compChoice = "S";
        }
        determineWinner();
    }
    public String determineWinner()
    {
        // Player == R 
        if((playChoice.equalsIgnoreCase("R"))&&(compChoice.equals("R"))){
             winner = "!Draw Game!";
            }
        else if((playChoice.equalsIgnoreCase("R"))&&(compChoice.equals("P"))){
             winner = "!Computer wins <<Paper Covers Rock>>!"; 
            }   
        else if((playChoice.equalsIgnoreCase("R"))&&(compChoice.equals("S"))){
             winner = "!Player wins <<Rock Breaks Scissors>>!";
            }
        // Player == P
        else if((playChoice.equalsIgnoreCase("P"))&&(compChoice.equals("P"))){
             winner = "!Draw Game!";
            }
        else if((playChoice.equalsIgnoreCase("P"))&&(compChoice.equals("R"))){
             winner = "!Player wins <<Paper Covers Rock>>!";
            }
        else if((playChoice.equalsIgnoreCase("P"))&&(compChoice.equals("S"))){
             winner = "!Computer wins <<Scissors Cuts Paper>>!";
            }
        // Player == S
        else if((playChoice.equalsIgnoreCase("S"))&&(compChoice.equals("S"))){
             winner = "!Draw Game!";
            }
        else if((playChoice.equalsIgnoreCase("S"))&&(compChoice.equals("R"))){
             winner = "!Computer wins <<Rock Breaks Scissors>>!";
            }
        else if((playChoice.equalsIgnoreCase("S"))&&(compChoice.equals("P"))){
             winner = "!Player wins <<Scissors Cuts Paper>>!";
            }
        return winner;    
    }
    public String toString()
    {
         String output = "\nPlayer had :: " + playChoice + 
                         "\nComputer had :: " + compChoice + 
                         "\n" + determineWinner();
         return output;
    }
}