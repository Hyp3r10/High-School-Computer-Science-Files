public class Boolean105
{
    public static void main(String args[]){
        // || (or)
        int age = 104;
        System.out.println("If your age is under 10 or greater than 65, you can come to my party!");
        System.out.println("Age :: " + age);
        if(age <= 10 || age >= 65){
            System.out.println("\nYou can come to my party!");
        }
        else{
            System.out.println("\nYou cannot come to my party.");
        }
    }
}
