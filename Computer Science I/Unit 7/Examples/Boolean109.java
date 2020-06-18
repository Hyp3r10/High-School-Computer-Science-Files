public class Boolean109 {
    public static void main (String args[]) {
        // Case 1 :: does not shortcircuit
        //int n1 = 3;
        //int n2 = 10;
        
        //Case 2 :: does short circuit
        int n1 = 10;
        int n2 = 3;
        
        Boolean109 b = new Boolean109();
        if(b.isEven(n1) || b.isEven(n2)) {
            System.out.println("\nOne or more numbers are even");
        }
        else {
            System.out.println("\nNeither numbers are even");
        }
    }
    private  boolean isEven(int number) {
        System.out.println("\nCalling isEven Method");
        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}