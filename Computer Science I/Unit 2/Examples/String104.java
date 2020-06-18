public class String104
{
    public static void main(String[] args)
    {
        //indexOf();
        
        String word = "bobcat";
        // index       012345
        
        String find1 = "b";
        char find2 = 'c';
        String find3 = "x"; 
        String find4 = "cat";
        String find5 = "bob";
        String find6 = "a nap would be nice";
        
        System.out.println("Word: " + word);
        System.out.println("The first instance of " + find1 + " is at index: " + word.indexOf(find1));
        System.out.println("The first instance of " + find2 + " is at index: " + word.indexOf(find2));
        System.out.println("The first instance of " + find3 + " is at index: " + word.indexOf(find3));
        System.out.println("The first instance of " + find4 + " is at index: " + word.indexOf(find4));
        System.out.println("The first instance of " + find5 + " is at index: " + word.indexOf(find5));
        System.out.println("The first instance of " + find6 + " is at index: " + word.indexOf(find6));
    }
}