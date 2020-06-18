public class String102
{
    public static void main(String[] args)
    {
        //substring
        
        String word = "racecar";
        // index       0123456
        
        String sub1 = word.substring(0,3);
        String sub2 = word.substring(0,4);
        String sub3 = word.substring(4,6);
        String sub4 = word.substring(4,7);
        String sub5 = word.substring(4);
        String sub6 = word.substring(1,4);
        String sub7 = word.substring(3,4);
        
        
        System.out.println("The sub of " + word + " (0,3) is: " + sub1);// note that substring is all lower case
        System.out.println("The sub of " + word + " (0,4) is: " + sub2);// must go one more than where the substring ends (exclusive)
        System.out.println("The sub of " + word + " (4,6) is: " + sub3);
        System.out.println("The sub of " + word + " (4,7) is: " + sub4);
        System.out.println("The sub of " + word + " (4) is: " + sub5);// when there is no second argument it will go to the end of the string
        System.out.println("The sub of " + word + " (1,4) is: " + sub6);//"ace"
        System.out.println("The sub of " + word + " (3,4) is: " + sub7);
        
        
        
        
        
    }
}