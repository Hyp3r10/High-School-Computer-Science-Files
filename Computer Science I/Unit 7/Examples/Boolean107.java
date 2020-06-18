public class Boolean107{
    public static void main (String[] args){
        int age1 = 15;
        int age2 = 16;
        boolean awesome = true;
        System.out.println("If you or your friend is 15 and you both are awesome, you can come to my party!");
        System.out.println("Age1 :: " + age1);
        System.out.println("Age2 :: " + age2);
        if((age1 == 15 || age2 == 15) && awesome){
            System.out.println("\nYou can come to my party!");
        }
        else{
            System.out.println("\nYou cannot come to my party.");
        }
    }
}