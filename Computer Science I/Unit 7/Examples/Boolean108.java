public class Boolean108 {
    public static void main(String args[]) {
        // Short Circuiting
        
        int total = 2;
        //boolean flag = true;
        boolean flag = false;
        
        //if(flag || total == 6/0) {
        //if(total == 6/0 || flag) {
        if(total == 6/0 | flag) { // a single '|' and '&' will always ckeck both sides
           System.out.print("Short");
        }
        System.out.print("circuit");
    }
}
