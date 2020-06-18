public class Boolean104{
    public static void main(String args[]){
        // && == (and)
        int age = 14;
        System.out.println("If your age us between 10 and 15, you can come to my Minecraft party"); 
        System.out.println("Age :: " + age);
        if(age >= 10 && age <= 14){
            System.out.println("\nYou can come to my party!");
        }
        else{
            System.out.println("\nYou cannot come to my party.");
        }
    }
}
