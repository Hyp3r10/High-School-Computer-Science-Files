public class Boolean110 {
    public static void main (String args[]) {
        boolean value = false;
        int count = 0;
        
        if(value && count++ == 0) {
            System.out.println("Count true :: "  + count);
        }
        else {
            System.out.println("Count false :: " + count);
        }
    }
}