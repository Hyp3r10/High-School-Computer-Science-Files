import java.util.*;

public class WordList
{
   // instance variables
   private ArrayList <String> myList;

   public WordList()
   {
      myList = new ArrayList <String>();
   }

   public void add(String word)
   {
      myList.add(word);
   }

   public String toString()
   {
      return myList.toString();
   }

   // Part (a)
   // postcondition: returns the number of words in this
   //                Wordlist that are exactly len letters long.
   public int numWordsOfLength(int len)
   {
	   int count = 0;
	   for(int i = 0; i < myList.size(); i++) {
		   if(myList.get(i).length() == len) {
			   count++;
		   }
	   }
	   return count;
   }

   // Part (b)
   // postcondition: all words that are exactly len letter long
   //                have been removed from the WordList,
   //                with the order of remaining words unchanged.

   public void removeWordsOfLength(int len)
   {
	   for(int i = myList.size()-1; i >= 0; i--) {
		   if(myList.get(i).length() == len) {
			   myList.remove(i);
		   }
	   }
   }
   
   public static void main(String[] args)
   {
      WordList w = new WordList();
      w.add("cat");
      w.add("mouse");
      w.add("frog");
      w.add("dog");
      w.add("dog");
      System.out.println(w + " " +
           w.numWordsOfLength(4) + " " +
           w.numWordsOfLength(3) + " " +
           w.numWordsOfLength(2));
      w.removeWordsOfLength(4);
      System.out.println(w);
      w.removeWordsOfLength(3);
      System.out.println(w);
      w.removeWordsOfLength(2);
      System.out.println(w);
   }
}
