import java.util.*;

public class Methods
{
    /** @return the square of num
     *  @param num the number to be squared
     */
    //  square Method
    public int square(int num)
    {
        num = (int)Math.pow(num,2);
        return num;
    }
    /** @return the sum of num1, num2, and num3
     *  @param num1 first number in the sum
     *  @param num2 second number in the sum
     *  @param num3 third number in the sum
     */
    //  sumThree Method
    public int sumThree(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }
    /** @return the average of num1 and num2
     *  @param num1 first number in average
     *  @param num2 second number in average
     */
    //  average Method
    public double average(int num1, int num2)
    {
        double avg = (num1 + num2) / 2.0;
        return avg;
    }
    /** @return the smaller value between num1 and num2
     *  @param num1 first number in minimum comparison
     *  @param num2 second number in minimum comparison
     */
    //  smaller Method
    public int smaller(int num1, int num2)
    {
        int smaller = Math.min(num1, num2);
        return smaller;
    }
    /** @return an integer random number in the range of [1..range] inclusive
     *  @param range the upper bounds of generated random number
     */
    //  randomInt Method
    public int randomInt(int range)
    {
        int random = (int)(Math.random() * range) + 1;
        return random;
    }
    /** Determines if num is odd or even. If num is even returns the string "even";
     *  otherwise it returns the string "odd"
     *  @return the string "even" or the string "odd"
     *  @param num number used in comparison
     */
    //  evenOdd Method
    public String evenOdd(int num)
    {
        if(num % 2 == 0)
        {
            return "even";
        }
        else// if(num % 2 == 1)
        {
            return "odd";
        }
    }
    /** Determines the letter grade for grade
     *  @return a string value of "A", "B", "C", or "F"
     *  @param grade the grade that needs to be converted into a letter grade
     */
    //  getLetterGrade Method
    public char getLetterGrade(int num1)
    {
        if(num1 >= 90)
        {
           char letterGrade = 'A';
           return letterGrade;
        }
        else if(num1 >= 80)
        {
            char letterGrade = 'B';
            return letterGrade;
        }
        else if(num1 >= 70)
        {
            char letterGrade = 'C';
            return letterGrade;
        }
        else
        {
            char letterGrade = 'F';
            return letterGrade;
        }
    }
    /** Prints the parameter name followed by the phrase
     *  " have a nice day!"
     *  @param name the name to be displayed
     */
    //  greeting Method
    public void greeting(String name) 
    {
        System.out.println(name + " have a nice day!");
    }
    /** @return the first letter from parameter str
     *  @param str string used to extract first letter from
     */
    // firstLetter Method
    public String firstLetter(String str)
    {
        String firstLetter = str.substring(0,1);
        return firstLetter;
    }
    /** @return the last letter from parameter str
     *  @param str string used to extract last letter from
     */
    //  lastLetter Method
    public String lastLetter(String str)
    {
        int length = str.length()-1;
        String lastLetter = str.substring(length);
        return lastLetter;
    }
    /** @return a substring of str that has first letter removed
     *  @param str string used to extract first letter from
     */
    //  removeFirst Method
    public String removeFirst(String str)
    {
        String removeFirst = str.substring(1);
        return removeFirst;
    }
    /** @return a substring of str that has last letter removed
     *  @param str string used to extract last letter from
     */
    //  removeLast Method
    public String removeLast(String str)
    {
        int length = str.length()-1;
        String removeLast = str.substring(0,(length));
        return removeLast;
    }
    /** @return a string with str1, str2, and str3 merged together
     *  @param str1 first string to be merged
     *  @param str2 second string to be merged
     *  @param str3 third string to be merged
     */
    //  merge Method
    public String merge(String str1, String str2, String str3)
    {
        String merge = str1 + str2 + str3;
        return merge;
    }
    /** @return a string that is the first letter of parameter
     *   str repeated three times.
     *  @param str string used to extract first letter from
     */
    //  repeatFirst Method
    public String repeatFirst(String str)
    {
        String merge = merge(firstLetter(str), firstLetter(str), firstLetter(str));
        return merge;
    }
    /** @return a string that is the last letter of parameter
     *   str repeated three times.
     *  @param str string used to extract last letter from
     */
    //  repeatLast Method
    public String repeatLast(String str)
    {
        String merge = merge(lastLetter(str), lastLetter(str), lastLetter(str));
        return merge;
    }
}