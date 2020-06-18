import java.util.*;
public class Arrays108 {
	double average;
	//int void length;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] grades = new int[100];
		int index = 0;
		int grade = 0;
		
		System.out.println("When you are done entering grades, type \"-1\" \n");
		
		while(grade != (-1)) {
			System.out.print("Please enter a grade :: ");
			grade = scan.nextInt();
			if(grade != -1) {
				grades[index] = grade;
				index++;
			}
		}
		
		// The enhanced for loop will always go through the entire physical size of the array
		/*for(int g : grades) {
			System.out.print(g + " ");
		}*/
		
		//Use a basic for loop to print out the logical array
		for(int i = 0; i < index; i++) {
			System.out.print(grades[i] + " ");
		}
		
		scan.close();
	}
	
}
