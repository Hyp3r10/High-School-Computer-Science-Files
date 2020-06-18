import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 20 integers");
        System.out.println("--------------");
        int[] nums = new int[20];
        for(int i = 0; i < nums.length; i++) {
            System.out.print("Num " + (i + 1) + " :: ");
            nums[i] = scan.nextInt();
        }
        System.out.println();
        for(int g = 0; g < nums.length; g++) {
            System.out.print(nums[g] + " ");
        }
        System.out.println("\n");
        for(int k = nums.length-1; k >= 0; k--) {
            System.out.print(nums[k] + " ");
        }
    }
}