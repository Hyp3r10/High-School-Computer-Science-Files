public class Boolean106{
    public static void main(String args[]){
        // ^ (xor)
        int age1 = 15;
        int age2 = 16;
        System.out.println("If you or your friend is 15, but not both of you, you can come to my party!");
        System.out.println("Age1 :: " + age1);
        System.out.println("Age2 :: " + age2);
        if(age1 == 15 ^ age2 == 15){
            System.out.println("\nYou can come to my party!");
        }
        else{
            System.out.println("\nYou cannot come to my party.");
        }
    }
}
