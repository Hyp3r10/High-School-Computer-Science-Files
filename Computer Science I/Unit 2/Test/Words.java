import java.util.Scanner;
public class Words
{   
    public static String determineWords(String word)
    {
        String output="";
         
        word.toLowerCase();
         
        while(word.indexOf("the")!=-1)
        {
            System.out.println("And suddenly you remember the tale of the superfluous traveler.\n");
            System.out.println("The story goes that one day the traveler came across a very cross vulture.");
            System.out.println("It greatly pained the vulture to listen to the tediously slow and excessive words of the humans.");
            System.out.println("The vulture was old as well, and with age usually comes wisdom.");
            System.out.println("As fate would have it, the vulture knew the way to the place that the traveler seeked.");
            System.out.println("The traveler said, \"Why oh wise vulture of great strength and knowlege, might you grace me with-\"");
            System.out.println("But the traveler had not any more time to speak, for he had been gobbled up the vulture, who was tortured by the traveler's complex wording.");
            System.out.println("If only the traveler knew that all he had to do was utter commands in the most barbaric way to get his point across;");
            System.out.println("That not everyone needed all of the words in between to get the message behind the sentence.\n");
            System.out.println("That is all to say, please do not use the word \"the\" in any further commands. It will not be recognized.\n");
            System.out.print("> ");
            Everlight.prompt();
        }
        
         
        if(!word.equals(""))
        {
            if(word.indexOf(" ")==-1)
            {
                output=String.valueOf(firstWord(word));
                return output;
            }
            else
                output=firstWord(word.substring(0,word.indexOf(" ")));
            word=word.substring(word.indexOf(" ")+1,word.length());
        }
        if(output.equals("-1"))
        {
            return output;
        }
         
         
        if(!word.equals(""))
        {
            if(word.indexOf(" ")==-1)
            {
                output=String.valueOf(output)+secondWord(word);
                return output;
            }
            else
                output=output+secondWord(word.substring(0,word.indexOf(" ")));
            word=word.substring(word.indexOf(" ")+1,word.length());
        }
        else
        {
            return output;
        }
        
        
        if(!word.equals(""))
        {
            if(word.indexOf(" ")==-1)
            {
                output=String.valueOf(output)+thirdWord(word);
                return output;
            }
            else
                output=output+thirdWord(word.substring(0,word.indexOf(" ")));
            word=word.substring(word.indexOf(" ")+1,word.length());
        }
        else
        {
            return output;
        }
         
         
        if(!word.equals(""))
        {
            if(word.indexOf(" ")==-1)
            {
                output=String.valueOf(output)+fourthWord(word);
                return output;
            }
            else
                output=output+fourthWord(word.substring(0,word.indexOf(" ")));
            word=word.substring(word.indexOf(" ")+1,word.length());
        }
         
        return output;
    }
     
    private static String firstWord(String word)
    {
        switch(word)
        {
        case "help":
            return "0";
        case "grab":
            return "1";
        case "take":
            return "1";
        case "pick":
            return "1";
        case "drop":
            return "2";
        case "put":
            return "2";
        case "throw":
            return "3";
        case "blow":
            return "4";
        case "go":
            return "5";
        case "move":
            return "5";
        case "walk":
        	return "5";
        case "north":
            return "6";
        case "south":
            return "7";
        case "east":
            return "8";
        case "west":
            return "9";
        case "i":
            return "10";
        case "inventory":
            return "10";
        case "look":
            return "11";
        case "inspect":
            return "11";
        case "check":
            return "11";
        case "open":
        	return "12";
        case "fill":
        	return "13";
        case "rock":
        	return "14";
        case "pot":
        	return "14";
        case "pool":
        	return "15";
        case "water":
        	return "15";
        case "waterfall":
        	return "15";
        case "bed":
        	return "16";
        case "glare":
        	return "16";
        case "sunlight":
        	return "16";
        case "chest":
        	return "17";
        case "pendant":
        	return "18";
        case "exit":
        	return "19";
        case "leave":
        	return "19";
        }
        return "-1";
    }
     
    private static String secondWord(String word)
    {
         
        switch(word)
        {
        case "north":
            return "a";
        case "south":
            return "b";
        case "east":
            return "c";
        case "west":
            return "d";
        case "apple":
            return "e";
        case "orange":
            return "f";
        case "butter":
            return "g";
        case "carrot":
            return "h";
        case "lamp":
            return "i";
        case "oil":
            return "i";
        case "to":
            return "j";
        case "towards":
        	return "j";
        case "up":
            return "k";
        case "out":
            return "l";
        case "down":
            return "m";
        case "at":
            return "n";
        case "pot":
        	return "o";
        case "water":
        	return "p";
        case "bread":
        	return "q";
        case "pendant":
        	return "r";
        case "bed":
        	return "s";
        case "glare":
        	return "s";
        case "sunlight":
        	return "s";
        case "chest":
        	return "t";
        case "house":
        	return "u";
        }
        return "";
    }
     
    private static String thirdWord(String word)
    {
        switch(word)
        {
        case "house":
            return "A";
        case "shack":
            return "B";
        case "lamp":
            return "C";
        case "oil":
            return "C";
        case "pot":
        	return "D";
        case "rock":
        	return "D";
        case "with":
        	return "E";
        case "pool":
        	return "F";
        case "water":
        	return "F";
        case "waterfall":
        	return "F";
        case "in":
        	return "G";
        case "under":
        	return "H";
        case "bed":
        	return "I";
        case "glare":
        	return "I";
        case "sunlight":
        	return "I";
        case "chest":
        	return "J";
        case "pendant":
        	return "K";
        }
        return "";
    }
    
    private static String fourthWord(String word)
    {
    	switch(word)
        {
        case "house":
            return "0";
        case "shack":
            return "1";
        case "lamp":
            return "2";
        case "oil":
            return "2";
        case "wrench":
        	return "3";
        case "water":
        	return "4";
        case "pot":
        	return "5";
        }
        return "";
    }
}