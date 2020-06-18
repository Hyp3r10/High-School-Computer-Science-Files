public class String101
{
    public static void main(String[] args)
    {
        //charAt()
        
        String str = "Adam Eve Smith";
        // index      0123456789
        
        char let1 = str.charAt(0); //A == 65
        char let2 = str.charAt(5); //E == 69
        char let3 = str.charAt(9); //S == 83
        
        System.out.println(let1);
        System.out.println(let1 + let2 + let3 + " " + let1 + let2 + let3); // 65 + 69 + 83 == 217
        System.out.println("Your initials are: " + let1 + let2 + let3);
        
        System.out.println("12 is the index for: " + str.charAt(12));//'t'
        //System.out.println("12 is the index for: " + str.charAt(30));//run time error because index value is larger than max string index 
        //System.out.println("12 is the index for: " + str.charAt(-1));///run time error because like no negatives, it bad.
            
    }
}