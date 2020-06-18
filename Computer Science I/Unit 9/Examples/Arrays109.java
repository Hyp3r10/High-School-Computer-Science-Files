import java.util.*;
public class Arrays109 {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Note :: Enter \"-1\" to stop entering grades");
        System.out.println("------------------------------------------ \n");
        
        int[] grades = new int[100];
        int grade = 0;
        int index = 0;
        while(grade != -1) { // -1 is a "sentinal value"
            System.out.print("Please enter a grade :: ");
            grade = scan.nextInt();
            String dummy = scan.nextLine();
            if(grade != -1) { // More proffessional than saying in the for loop that "index-1"
                grades[index] = grade;
                index++;
            }
        } 
        System.out.println();
        
        // An enhanced for loop will always cycle throughout the entire array
        for(int i = 0; i < index; i++) {
            System.out.print(grades[i] + " ");
        }
    }
}