import java.util.*;
public class BooleanMethods{
    /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     *  @param str1 first string to determine length of
     *  MUST CONTAIN AN IF ELSE STATEMENT
     */
    // firstLast Method
    public boolean firstLast(String str){
        String first = str.substring(0,1);
        //System.out.println(first);
        String last = str.substring(str.length()-1);
        //System.out.println(last);
        if(first.equals(last)){
            return true;
        }
        else{
            return false;
        }
    }
    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  MUST CONTAIN AN IF ELSE STATEMENT
     */
    // sameLength Method
    public boolean sameLength(String str1, String str2){
        int lengthOne = str1.length();
        //System.out.println(lengthOne);
        int lengthTwo = str2.length();
        //System.out.println(lengthTwo);
        if(lengthOne == lengthTwo){
            return true;
        }
        else{
            return false;
        }
    }
    /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     *  @param str1 first string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */
    // firstLast2 Method
    public boolean firstLast2(String str){
        String first = str.substring(0,1);
        //System.out.println(first);
        String last = str.substring(str.length()-1);
        //System.out.println(last);
        return first.equals(last);
    }
    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */
    // sameLength2 Method
    public boolean sameLength2(String str1, String str2){
        int lengthOne = str1.length();
        //System.out.println(lengthOne);
        int lengthTwo = str2.length();
        //System.out.println(lengthTwo);
        return lengthOne == lengthTwo;
    }
}