public class Runner {
    public static void main (String args[]) {
        Test1 t = new Test1();
        System.out.println(t.getN());
    }
}
class Test2 {
    private int lives; 
    public int getN() {
        return lives;
    }
}
class Test1 extends Test2 {
    private String outputColor;
    public String getOutputColor() {
        return outputColor;
    }
}