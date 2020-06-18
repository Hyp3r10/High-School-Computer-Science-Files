public class Boolean103
{
    public static void main(String args[])
    {
        int num1 = 14;
        int num2 = 9;
        System.out.println("Is " + num1 + " less than " + num2 + "?");

        /**
         *Boolean103 bb8 = new Boolean103();
         */
        
        /**
         *if(bb8.tester(num1, num2) == true){
         *  System.out.println("\nYes"); 
         *}
         *else{
         *  System.out.println("\nYes");
         *}
         */
        if(tester(num1, num2)){
           System.out.println("\nYes"); 
        }
        else{
            System.out.println("\nYes");
        }
    }
    private static boolean tester(int n1, int n2) // Include static in the method header of ant method that is in the same class as the main method.
    {
        /**if(n1<n2){
         *    return true;
         *}
         *else{
         *    return false;
         *}
         */
        return n1 < n2;
    }
}
