// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.*;
import static java.lang.System.*;

public class Permutation
{
	private String orig;
	private ArrayList<String> list;
	private int length;

	public Permutation(String word)
	{
		orig = word;
		list = new ArrayList<String>();
		length = word.length();
		permutation(orig,"");
	}
	
   private boolean containsLetter(String word, char letter)
   {
	   for(int i = 0; i < word.length(); i++)
		   if(word.charAt(i) == letter)
			   return false;
	   return true;
   }
   
   private boolean newWord(String word)
   {
	   for(int i = 0; i < list.size(); i++)
		   if(list.get(i).equals(word))
			   return false;
	   return true;
   }

	private void permutation(String orig, String sent)
	{
		for(int i = 0; i < length; i++)
		{
			if(sent.length() == length && newWord(sent))
			{
				list.add(sent);
			}
			else if(containsLetter(sent, orig.charAt(i)))
			{
				permutation(orig, sent+orig.charAt(i));
			}
		}
	}
	
	private String printList()
	{
		String p = "";
		for(int i = 0; i < list.size(); i++)
		{
			p += list.get(i)+"\n";
		}
		return p;
	}

   public String toString()
   {
   	
	   return 	"\nPERMUTATION OF WORD :: "+orig+"\n"+printList();
   }
}