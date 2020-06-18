public class Arrays102 {
    public static void main(String[] args) {
        String[] dorks = {"Parx", "Nathan with a capital 'd'", "Lukas", "Humza", "Antonio AKA Tenacious A"};
        
        System.out.println(dorks[0] + ", " + dorks[1] + ", " + dorks[2] + ", " + dorks[3] + ", " + dorks[4]);
        
        dorks[1] = "Tanner";
        
        System.out.println(dorks[0] + ", " + dorks[1] + ", " + dorks[2] + ", " + dorks[3] + ", " + dorks[4]);
        
        int len = dorks.length;
        
        System.out.println("The length of the Array is :: " + len);
        
        System.out.println("The last member of dorks is :: " + dorks[len - 1]);
    }
}