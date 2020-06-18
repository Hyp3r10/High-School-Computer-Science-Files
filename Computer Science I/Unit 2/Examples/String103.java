public class String103
{
    public static void main(String[] args)
    {
        //Length();
        
        String word = "tacocat";
        // index       0123456
        
        /**
         * length == 7
         * indx range == 0...6
         * the highest index will always be one smaller than the length
         */
        
        int len = word.length();
        
        System.out.println("The thength of " + word + " is: " + len);
        System.out.println("The thength of " + word + " is: " + word.length());
        
        //last letter
        System.out.println("The last leter is: " + word.charAt(6)); // only works for strings of 7 characters
        System.out.println("The index of the last letter is: " + (word.length() -1)); // alwyas one less than the lenght
        System.out.println("The last letter is: " + word.charAt(word.length() -1)); // charAt()
        System.out.println("The last letter is: " + word.substring(word.length() -1));// substring()
    }
}